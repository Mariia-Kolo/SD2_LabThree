//Mariia Kolodiazhna
//3149166

package griffith;

public class Rhombus extends Shape{

    //declare variables
    private double diagonal1;
    private double diagonal2;
    private double side;

    //constructor
    public Rhombus(String name, double diagonal1, double diagonal2, double side) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }

    //override to use needed formula
    @Override
    public double area(){
        return (diagonal1*diagonal2)/2;
    }

    //override to use needed formula
    @Override
    public double perimeter(){
        return 4*side;
    }

    //override to display declared values
    @Override
    public String toString(){
        return super.toString()
                + " Side: " + side
                + " Diagonal1: " + diagonal1
                + " Diagonal2: " + diagonal2;
    }

}
