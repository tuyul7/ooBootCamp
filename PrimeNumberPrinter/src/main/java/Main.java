package main.java;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int maxNum = 5;
        List<Integer> primeNumbers = new PrimeNumberGenerator().allPrimeNumbersUpTo(maxNum);
        System.out.println("Prime Numbers up to " + maxNum + " are " + primeNumbers);
    }
}
