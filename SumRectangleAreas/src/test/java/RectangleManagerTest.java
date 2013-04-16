package test.java;

import main.java.Rectangle;
import main.java.RectangleManager;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RectangleManagerTest {

    @Test
    public void shouldHoldMultipleRectangles(){
        Rectangle rectangle1 = new Rectangle(2, 3);

        RectangleManager rectangleManager = new RectangleManager(rectangle1);
        assertTrue(rectangleManager.contains(rectangle1));
    }
}
