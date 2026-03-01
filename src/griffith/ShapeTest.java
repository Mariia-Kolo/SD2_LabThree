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

        Rhombus r = new Rhombus("Rhombus", 6, 8, 5);

        assertEquals(24, r.area(), EPSILON);
        assertEquals(20, r.perimeter(), EPSILON);
        assertTrue(r.toString().contains("Side"));

    }

    @Test
    void testTriangle(){

        RightAngledTriangle t = new RightAngledTriangle("Triangle", 6, 8);

        assertEquals(24, t.area(), EPSILON);
        assertEquals(24, t.perimeter(), EPSILON);
        assertTrue(t.toString().contains("Base"));

    }

}