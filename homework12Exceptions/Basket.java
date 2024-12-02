package homework12Exceptions;

import homework12Exceptions.exceptions.InsufficientBalanceException;
import homework12Exceptions.exceptions.TooMuchGiftsOnBasketException;

import java.util.Scanner;

class Basket {
    private ItemsList items = new ItemsList();

    public Basket() {}

    public void addItem(Item item) {
        items.addItem(item);
    }

    public Item getItem(int indexOfItem) {
        return items.getItem(indexOfItem);
    }

    public void cleanItemsList() {
        items = new ItemsList();
    }

    public void checkout(double cardBalance) {
        double totalPrice = items.getTotalPrice();

        if (items.getGiftsCount() > 1) {
            System.out.println("You have selected more than one gift. Please remove one:");
            items.printGiftsList();

            System.out.print("Enter the index of the item to remove its gift: ");
            int indexToRemoveGift = new Scanner(System.in).nextInt();

            items.removeGiftByIndex(indexToRemoveGift);
        }

        if (items.getGiftsCount() > 1) throw new TooMuchGiftsOnBasketException();
        if (cardBalance < totalPrice) throw new InsufficientBalanceException();

        System.out.println("Checkout successful! Total price: " + totalPrice);
        cleanItemsList();
    }
}

