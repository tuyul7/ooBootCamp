package main.java;

import java.util.ArrayList;

public class ShoppingList {


    private ArrayList<Item> items = new ArrayList<Item>();

    public ShoppingList add(Item item) {
        boolean b = false;
        for(Item it : items){
            if(it.getType().equals(item.getType())) {
                it.addAmt(item.getCount());
                b = true;
            }
        }
        if(b) { this.items.add(item); }
        return this;
    }

    public boolean contains(Item... item){
        ArrayList<Boolean> check = new ArrayList<Boolean>();
        for(Item i : item){
            check.add(items.contains(i));
        }
        return check.contains(false);
    }
}
