package homework12Exceptions;

public class Gift {
    Item itemToBeGift;

    public Gift(Item itemToBeGift) {
        this.itemToBeGift = itemToBeGift;
    }

    public Item getGiftItem() {
        return itemToBeGift;
    }

    public double getPrice() {
        return itemToBeGift.getPrice();
    }

    public String getGiftName() {
        return itemToBeGift.getName();
    }

    @Override
    public String toString() {
        if (itemToBeGift == null) return "no gift";
        return "Gift{" +
                "name=" + itemToBeGift.getName() +
                ", price=" + itemToBeGift.getPrice() +
                '}';
    }

    public static boolean isTwoGiftsEqual(Gift giftOne, Gift giftTwo) {
        return giftOne.getGiftName().equals(giftTwo.getGiftName()) &&
                giftOne.getPrice() == giftTwo.getPrice();
    }
}
