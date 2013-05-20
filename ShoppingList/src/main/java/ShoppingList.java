package main.java;

public class ShoppingList {


    private Item items;

    public Item add(Item item) {
        return this.items = item;
    }

    public Item contains() {
        return items;
    }
}
