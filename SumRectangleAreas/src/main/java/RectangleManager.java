package main.java;

import java.util.ArrayList;

public class RectangleManager {

    ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

    public boolean contains(Rectangle rectangle){
        return rectangles.contains(rectangle);
    }

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double sum() {
        double areaSum = 0.0;
        for(Rectangle rectangle : rectangles){
            areaSum += rectangle.area();
        }
        return areaSum;
    }
}
