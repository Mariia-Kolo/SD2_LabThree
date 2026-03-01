//Mariia Kolodiazhna
//3149166

package griffith;

public class RightAngledTriangle extends Shape {

    //declare variables
    private double base;
    private double height;

    //constructor
    public RightAngledTriangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }

    //override to use needed formula
    @Override
    public double area(){
        return (base * height)/2;
    }

    //override to use needed formula
    @Override
    public double perimeter(){
        double hypotenuse = Math.sqrt(base*base + height*height);
        return hypotenuse + base + height;
    }

    //override to display declared values
    @Override
    public String toString(){
        return super.toString()
                +"Base: " + base
                +"Height: " + height;
    }

}
