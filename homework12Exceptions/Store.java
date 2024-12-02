package homework12Exceptions;

public class Store {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addItem(new SmartphoneItem());
        basket.addItem(new TVItem());
        basket.addItem(new NotebookItem());

        System.out.println("Basket items:");
        for (int i = 0; i < 3; i++) {
            System.out.println(basket.getItem(i));
        }

        try {
            basket.checkout(800000);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
