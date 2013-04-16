package test.java;

import main.java.Point;
import main.java.Rectangle;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class RectangleTest {

    private Rectangle rectangle = new Rectangle(5, 5, 6, 8);

    @Test
    public void shouldContainTopLeftCorner(){
        assertTrue(rectangle.contains(new Point(2, 9)));
    }

    @Test
    public void shouldContainBottomRightCorner(){
        assertTrue(rectangle.contains(new Point(8, 1)));
    }

    @Test
    public void shouldNotContainPointAtZeroZero(){
        assertFalse(rectangle.contains(new Point(0, 0)));
    }

    @Test
    public void shouldContainCenterPoint(){
        assertTrue(rectangle.contains(new Point(5, 5)));
    }

    @Test
    public void shouldContainPointEvenIfInNegativeCoordinate(){
        Rectangle rectangle = new Rectangle(1, 3, 4, 4);
        assertTrue(rectangle.contains(new Point(-1, 5)));
    }
}