package main.java;

public class main {

    public static void main(String[] args){

        double givenInches = 1;
        double calculatedFeet = new Converter().convert(new Pair(Length.INCHES, givenInches), Length.FEET);
        System.out.println(givenInches + " inches equals " + calculatedFeet + " foot");

        double givenCups = 1;
        double calculatedTbsp = new Converter().convert(new Pair(Volume.CUPS, givenCups), Volume.TABLESPOONS);
        System.out.println(givenCups + " cups equals " + calculatedTbsp + " tbsps");
    }
}
