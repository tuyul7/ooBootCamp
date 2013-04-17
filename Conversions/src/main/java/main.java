package main.java;

public class main {

    public static void main(String[] args){

        double givenInches = 1;
        double calculatedFeet = new Converter().inchesToFeet(givenInches);
        System.out.println(givenInches + " inches equals " + calculatedFeet + " foot");
    }
}
