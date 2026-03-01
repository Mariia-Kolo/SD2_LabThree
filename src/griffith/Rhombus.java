//Mariia Kolodiazhna
//3149166

package griffith;

public class Rhombus extends Shape{

    private double diagonal1;
    private double diagonal2;
    private double side;

    public Rhombus(String name, double diagonal1, double diagonal2, double side) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
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
    public String toString(){
        return super.toString();
    }

}
