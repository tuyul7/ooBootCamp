package main.java;

public class Item {

    private String type;
    private int count;

    public Item(String type, int count) {
        this.type = type;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public void addAmt(int count) {
        this.count += count;
    }
}
