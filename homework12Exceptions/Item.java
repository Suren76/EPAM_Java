package homework12Exceptions;

public abstract class Item {
    private String name;
    private double price;
    private Gift gift;

    protected Item(String name, double price, Gift gift) {
        this.name = name;
        this.price = price;
        this.gift = gift;
    }

    protected Item(String name, double price, Item gift) {
        this(name, price, new Gift(gift));
    }

    public double getPrice() {
        return price;
    }

    public Gift getGift() {
        return gift;
    }

    public void removeGift() {
        this.gift = null;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", gift=" + gift +
                '}';
    }
}
