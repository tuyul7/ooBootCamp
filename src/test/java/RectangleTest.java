package test.java;

import main.java.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RectangleTest {

    @Test
    public void shouldHaveAnAreaGreaterThanZero(){
        Rectangle rectangle = new Rectangle();
        assertTrue(rectangle.area() > 0);
    }
}
