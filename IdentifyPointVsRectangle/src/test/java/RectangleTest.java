package test.java;

import main.java.Point;
import main.java.Rectangle;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class RectangleTest {

    @Test
    public void shouldContainTopLeftCorner(){
        Rectangle rectangle = new Rectangle(5, 5, 6, 8);

        assertTrue(rectangle.contains(new Point(2, 9)));
    }
}