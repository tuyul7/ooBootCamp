package main.java;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

    public Boolean isPrime(int max) {
        for(int i = max - 1; i > 1; i--) {
            if(max % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> allPrimeNumbersUpTo(int max) {
        List<Integer> primes = new ArrayList<Integer>();
        for(int i = max; i > 1; i--) {
            if(isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
}