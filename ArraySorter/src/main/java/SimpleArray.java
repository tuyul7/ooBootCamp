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

    public int largest() {
        int largest = array.get(0);
        for(int i : array) {
            if(i > largest) { largest = i; }
        }
        return largest;
    }

    public int smallest() {
        int smallest = array.get(0);
        for(int i : array) {
            if(i < smallest) { smallest = i; }
        }
        return smallest;
    }
}
