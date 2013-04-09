package test.java;

import main.java.Rectangle;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class RectangleTest {

    @Test
    public void shouldCalculateAreaFromWidthAndLength(){
        double length = 2;
        double width = 2;

        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(length * width, rectangle.area());
    }

    @Test
    public void shouldTakeUserInputForWidthAndLengthValues(){
        double length = 2;
        double width = 2;

        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(length * width, rectangle.area());
    }
}