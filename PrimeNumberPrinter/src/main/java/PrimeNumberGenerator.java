package main.java;

public class PrimeNumberGenerator {
    public Boolean isPrime(int max) {
        for(int i = max - 1; i > 1; i--) {
            if(max % i == 0) {
                return false;
            }
        }
        return true;
    }
}
