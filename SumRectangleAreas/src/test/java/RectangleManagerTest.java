package test.java;

import main.java.Rectangle;
import main.java.RectangleManager;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;


public class RectangleManagerTest {

    @Test
    public void shouldHoldARectangle(){
        Rectangle rectangle1 = new Rectangle(2, 3);

        RectangleManager rectangleManager = new RectangleManager();
        rectangleManager.add(rectangle1);
        assertTrue(rectangleManager.contains(rectangle1));
    }

    @Test
    public void shouldHoldMultipleRectangles(){
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(3, 4);

        RectangleManager rectangleManager = new RectangleManager();
        rectangleManager.add(rectangle1);
        rectangleManager.add(rectangle2);
        assertTrue(rectangleManager.contains(rectangle1) && rectangleManager.contains(rectangle2));
    }

    @Test
    public void shouldSumMultipleRectangleAreas(){
        RectangleManager rectangleManager = new RectangleManager();

        Rectangle rectangle1 = new Rectangle(2, 3);
        rectangleManager.add(rectangle1);

        Rectangle rectangle2 = new Rectangle(3, 4);
        rectangleManager.add(rectangle2);

        assertEquals(18.0, rectangleManager.sum());
    }
}
