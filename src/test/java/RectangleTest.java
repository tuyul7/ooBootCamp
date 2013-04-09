package test.java;

import main.java.Rectangle;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class RectangleTest {

    @Test
    public void shouldCalculateAreaFromWidthAndLength(){
        double length = 2;
        double width = 2;

        Rectangle rectangle = new Rectangle();
        assertEquals(length * width, rectangle.area());

    }

    @Test
    public void shouldHaveAnAreaGreaterThanZero(){
//        Rectangle rectangle = new Rectangle();
//        assertTrue(rectangle.area() > 0);
    }
}
