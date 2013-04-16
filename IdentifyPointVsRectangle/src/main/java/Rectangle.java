package main.java;

public class Rectangle {

    private double minX;
    private double minY;
    private double maxX;
    private double maxY;

    public Rectangle(double centerX, double centerY, double width, double height) {
        this.minX = centerX - width/2;
        this.minY = centerY - height/2;
        this.maxX = centerX + width/2;
        this.maxY = centerY + height/2;
    }

    public boolean contains(Point point){
        boolean insideLeftSide = point.x >= minX;
        boolean insideBottomSide = point.y >= minY;
        boolean insideRightSide = point.x <= maxX;
        boolean insideTopSide = point.y <= maxY;

        return insideLeftSide && insideTopSide && insideBottomSide && insideRightSide;
    }
}
