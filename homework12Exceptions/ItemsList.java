package homework12Exceptions;

public class ItemsList {
    private int currentItemCursor = 0;
    private Item[] items = new Item[15]; // hardcode default length to 15

    private void extendItemsList() {
        Item[] itemsTemporaryStorage = items;

        items = new Item[itemsTemporaryStorage.length + 5];

        for (int i = 0; i < itemsTemporaryStorage.length; i++) {
            items[i] = itemsTemporaryStorage[i];
        }
    }

    public void addItem(Item item) {
        if (currentItemCursor >= items.length) extendItemsList();
        items[currentItemCursor++] = item;
    }

    public Item getItem(int indexOfItem) {
        return items[indexOfItem];
    }

    public Item[] getItems() {
        Item[] itemsNonNull = new Item[currentItemCursor];
        for (int i = 0; i < currentItemCursor; i++) itemsNonNull[i] = items[i];
        return itemsNonNull;
    }

    private Gift[] getGifts() {
        int giftsCount = 0;

        for (Item item : getItems()) if (item.getGift() != null) giftsCount++;

        Gift[] gifts = new Gift[giftsCount];

        for (int i = 0; i < getItems().length; i++) {
            if (items[i].getGift() != null) {
                gifts[gifts.length - giftsCount--] = items[i].getGift();
            }
        }

        return gifts;
    }

    private Item getItemByGift(Gift gift) {
        for (Item item : getItems()) {
            if (item.getGift() == null) continue;
            if (Gift.isTwoGiftsEqual(item.getGift(), gift)) return item;
        }
        return null;
    }

    public int getGiftsCount() {
        return getGifts().length;
    }

    public boolean isFull() {
        return items.length == currentItemCursor;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : getItems()) totalPrice += item.getPrice();
        return totalPrice;
    }

    private void removeGift(Gift giftToRemove) {
        Item itemFoundedByGift = getItemByGift(giftToRemove);
        if (itemFoundedByGift == null) {
            System.out.println("There are no item with this gift: " + giftToRemove);
            return;
        }

        System.out.println("Gift removed from item: " + itemFoundedByGift);
        itemFoundedByGift.removeGift();
    }

    public void removeGiftByIndex(int indexToRemoveGift) {
        removeGift(getGifts()[indexToRemoveGift]);
    }

    public void printGiftsList() {
        for (Gift gift : getGifts()) {
            System.out.println(gift);
        }
    }
}
