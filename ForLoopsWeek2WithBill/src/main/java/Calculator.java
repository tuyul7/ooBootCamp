package main.java;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


    public int sum(int[] numbers) {
        int sum = 0;
        for(int i : numbers) { sum += i; }
        return sum;
    }

    public int sumUpTo(int max) {
        int[] ints = new int[max];
        for(int i = max; i > 0; i--) {
            ints[i - 1] = i;
        }
        return sum(ints);
    }

    public int avgSumUpTo(int max) {
        int total = sumUpTo(max);
        return total / max;
    }

    public List<Integer> oddNumbersUpTo(int max) {
        List<Integer> oddNumbers = new ArrayList<Integer>();
        for(int i = 1; i <= max; i++) {
            if(i % 2 != 0) {oddNumbers.add(i);}
        }
        return oddNumbers;
    }

    public int sumOfOddNumbersUpTo(int max) {
        List<Integer> oddNumbers = oddNumbersUpTo(max);
        int sum = 0;
        for(int i : oddNumbers) {
            sum += i;
        }
        return sum;
    }

    public List<Integer> evenNumbersUpTo(int max) {
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for(int i = 1; i <= max; i++) {
            if(i % 2 == 0) {evenNumbers.add(i);}
        }
        return evenNumbers;
    }

    public int productOfEvenNumbersUpTo(int max) {
        List<Integer> evenNumbers = evenNumbersUpTo(max);
        int product = 0;
        for(int i : evenNumbers) {
            if(product == 0) {
                product = i;
            }
            else {
                product *= i;
            }
        }
        return product;
    }
}
