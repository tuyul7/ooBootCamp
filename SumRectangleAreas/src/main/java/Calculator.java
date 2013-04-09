package main.java;

import java.util.List;

public class Calculator {

    public double sum(List<Double> doubleList){
        int sum = 0;
        for(double value : doubleList) {
            sum += value;
        }
        return sum;
    }
}