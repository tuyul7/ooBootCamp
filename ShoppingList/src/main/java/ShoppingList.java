package main.java;

import java.util.ArrayList;

public class ShoppingList {


    private ArrayList<Item> items = new ArrayList<Item>();

    public ShoppingList add(Item item) {
        int i = 0;
        for(Item it : items){
            if(it.getType().equals(item.getType())) {
                it.addAmt(it.getCount());
                i++;
            }
        }
        if(i == 0) { this.items.add(item); }
        return this;
    }

    public int contains() {
        return items.size();
    }
}
