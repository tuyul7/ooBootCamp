package main.java;

import java.util.List;

public class Calculator {

    public int sum(List<Integer> integers){
        int sum = 0;
        for(int integer : integers) {
            sum += integer;
        }
        return sum;
    }

}
