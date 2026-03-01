//Mariia Kolodiazhna
//3149166

package griffith;

public class Circle extends Shape {

    private double radius;
    private static final double PI = 3.14;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area(){
        return 0;
    }
    @Override
    public double perimeter(){
        return 0;
    }
    @Override
    public String toString (){
        return super.toString();
    }
}
