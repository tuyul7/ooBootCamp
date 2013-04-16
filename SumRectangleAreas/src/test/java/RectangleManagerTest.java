package test.java;

import main.java.Rectangle;
import main.java.RectangleManager;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RectangleManagerTest {

    @Test
    public void shouldHoldARectangle(){
        Rectangle rectangle1 = new Rectangle(2, 3);

        RectangleManager rectangleManager = new RectangleManager(rectangle1);
        assertTrue(rectangleManager.contains(rectangle1));
    }

    @Test
    public void shouldHoldMultipleRectangles(){
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(3, 4);

        RectangleManager rectangleManager = new RectangleManager(rectangle1);
        rectangleManager.add(rectangle2);
        assertTrue(rectangleManager.contains(rectangle1) && rectangleManager.contains(rectangle2));
    }
}
