package main.java;

import java.util.ArrayList;

public class RectangleManager {

    ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

    public RectangleManager(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public boolean contains(Rectangle rectangle){
        return rectangles.contains(rectangle);
    }

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }
}
