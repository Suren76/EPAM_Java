package homework12Exceptions;

import homework12Exceptions.exceptions.InsufficientBalanceException;
import homework12Exceptions.exceptions.TooMuchGiftsOnBasketException;

import java.util.Scanner;

class Basket {
    private int itemCount = 0;
    private Item[] items = new Item[15];

    public Basket() {}

    private void extendItemsList() {
        Item[] itemsTemporaryStorage = items;

        items = new Item[itemsTemporaryStorage.length + 5];

        for (int i = 0; i < itemsTemporaryStorage.length; i++) {
            items[i] = itemsTemporaryStorage[i];
        }
    }

    public void addItem(Item item) {
        if (itemCount >= items.length) extendItemsList();
        items[itemCount++] = item;
    }

    public Item getItem(int indexOfItem) {
        return items[indexOfItem];
    }

    public void checkout(double cardBalance) {
        double totalPrice = 0;
        int giftCount = 0;

        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice();
            if (items[i].getGift() != null) {
                giftCount++;
            }
        }

        if (giftCount > 1) {
            System.out.println("You have selected more than one gift. Please remove one:");
            for (int i = 0; i < itemCount; i++) {
                if (items[i].getGift() != null) {
                    System.out.println("Item: " + items[i]);
                }
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the index of the item to remove its gift: ");
            int indexToRemoveGift = scanner.nextInt();

            if (indexToRemoveGift >= 0 && indexToRemoveGift < itemCount && items[indexToRemoveGift].getGift() != null) {
                items[indexToRemoveGift].removeGift();
                System.out.println("Gift removed from item: " + items[indexToRemoveGift]);
            }

            giftCount = 0;
            for (int i = 0; i < itemCount; i++) {
                if (items[i].getGift() != null) {
                    giftCount++;
                }
            }
        }

        if (giftCount > 1) throw new TooMuchGiftsOnBasketException();
        if (cardBalance < totalPrice) throw new InsufficientBalanceException();

        System.out.println("Checkout successful! Total price: " + totalPrice);
        items = new Item[items.length];
        itemCount = 0;
    }
}

