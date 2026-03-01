//Mariia Kolodiazhna
//3149166

package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class ShapeTest {

    private static final double EPSILON = 1.0;

    //unit test for circle class
    @Test
    void testCircle(){

        Circle c = new Circle("Circle", 3);

        assertEquals(28.27, c.area(), EPSILON);
        assertEquals(18.85,  c.perimeter(), EPSILON);
        assertTrue(c.toString().contains("Radius"));
    }

    //unit test for rhombus class
    @Test
    void testRhombus(){

        Rhombus r = new Rhombus("Rhombus", 6, 8, 5);

        assertEquals(24, r.area(), EPSILON);
        assertEquals(20, r.perimeter(), EPSILON);
        assertTrue(r.toString().contains("Side"));

    }

    //unit test for triangle class
    @Test
    void testTriangle(){

        RightAngledTriangle t = new RightAngledTriangle("Triangle", 6, 8);

        assertEquals(24, t.area(), EPSILON);
        assertEquals(24, t.perimeter(), EPSILON);
        assertTrue(t.toString().contains("Base"));

    }

    //integration test for all sub classes
    @Test
    void integrationTestShapes() {

        ArrayList<Shape> shapes = new ArrayList<>();

        //two of each shapes
        shapes.add(new Circle("Circle", 3));
        shapes.add(new Circle("Circle", 4));

        shapes.add(new Rhombus("Rhombus", 6, 8, 5));
        shapes.add(new Rhombus("Rhombus", 10, 6, 4));


        shapes.add(new RightAngledTriangle("Triangle", 6, 8));
        shapes.add(new RightAngledTriangle("Triangle", 12, 5));


        //calculate expected values
        double[] expectedAreas = {
                28.27, 50.27,
                24, 30,
                24, 30
        };

        double[] expectedPerimeter = {
                18.85, 25.13,
                20, 16,
                24, 30
        };

        //looping until all shapes area and perimeter are calculated
        for (int i = 0; i < shapes.size(); i++) {
            assertEquals(expectedAreas[i], shapes.get(i).area(), EPSILON);
            assertEquals(expectedPerimeter[i], shapes.get(i).perimeter(), EPSILON);
        }

    }
}