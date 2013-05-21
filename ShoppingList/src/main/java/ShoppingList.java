package main.java;

import java.util.ArrayList;

public class ShoppingList {


    private ArrayList<Item> items = new ArrayList<Item>();

    public ShoppingList add(Item newItem) {
        boolean b = false;
        for(Item item : items){
            if(item.getType().equals(item.getType())) {
                b = true;
            }
        }
        if(b) { this.items.add(newItem); }
        return this;
    }

    public boolean contains(Item... item){
        ArrayList<Boolean> check = new ArrayList<Boolean>();
        for(Item i : item){
            check.add(items.contains(i));
        }
        return check.contains(false);
    }

    public int quantityOf(Item item) {
        return item.getQuantity();
    }
}
