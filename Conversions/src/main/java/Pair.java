package main.java;

public class Pair {

    private double key;
    private double value;

    public Pair(double key, double value) {
        this.key = key;
        this.value = value;
    }
    public double getKey() {
        return key;
    }

    public double getValue() {
        return value;
    }

    public void setKey(double key) {
        this.key = key;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
