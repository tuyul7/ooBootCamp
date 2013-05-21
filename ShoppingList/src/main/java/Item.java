package main.java;

public class Item {

    private String type;
    private int quantity;

    public Item(String type) {
        this.type = type;
        quantity = 1;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}
