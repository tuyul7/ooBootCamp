package main.java;

import java.util.ArrayList;

public class ShoppingList {


    private ArrayList<Item> items = new ArrayList<Item>();

    public ShoppingList add(Item item) {
        this.items.add(item);
        return this;
    }

    public int contains() {
        return items.size();
    }
}
