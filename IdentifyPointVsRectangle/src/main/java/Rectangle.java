package main.java;

public class Rectangle {

    private double centerX;
    private double centerY;
    private double width;
    private double height;

    public Rectangle(double centerX, double centerY, double width, double height) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.width = width;
        this.height = height;
    }

    public boolean contains(Point point){
        return point.x >= centerX - (width/2) && point.y <= centerY + (height/2);
    }
}
