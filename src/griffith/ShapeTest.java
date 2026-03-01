//Mariia Kolodiazhna
//3149166

package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeTest {

    private static final double EPSILON = 1.0;

    @Test
    void testCircle(){

        Circle c = new Circle("Circle", 3);

        assertEquals(28.27, c.area(), EPSILON);
        assertEquals(18.85,  c.perimeter(), EPSILON);
        assertTrue(c.toString().contains("Radius"));
    }

    @Test
    void testRhombus(){

    }

    @Test
    void testTriangle(){

    }

}