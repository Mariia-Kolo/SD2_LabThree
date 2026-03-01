//Mariia Kolodiazhna
//3149166

package griffith;

public class Circle extends Shape {

    //declare variables
    private double radius;
    private static final double PI = 3.14;

    //constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    //getters
    public double getRadius() {
        return radius;
    }

    //override to use needed formula
    @Override
    public double area(){
        return PI * radius * radius;
    }

    //override to use needed formula
    @Override
    public double perimeter(){
        return 2 * PI * radius;
    }

    //override to display declared values
    @Override
    public String toString (){
        return super.toString() + " Radius: " + radius;
    }
}
