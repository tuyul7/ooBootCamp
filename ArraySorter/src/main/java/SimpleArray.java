package main.java;

import java.util.ArrayList;

public class SimpleArray {

    private ArrayList<Integer> array = new ArrayList<Integer>();

    public int size() {
        return array.size();
    }

    public SimpleArray add(int i) {
        array.add(i);
        return this;
    }
}
