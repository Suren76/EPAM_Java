package homework12Exceptions;

public class Gift {
    Item itemToBeGift;

    public Gift(Item itemToBeGift) {
        this.itemToBeGift = itemToBeGift;
    }

    public Item getGift() {
        return itemToBeGift;
    }

    public double getPrice() {
        return itemToBeGift.getPrice();
    }

    public String getGiftName() {
        return itemToBeGift.getName();
    }
}
