//Mariia Kolodiazhna
//3149166

package griffith;

public class RightAngledTriangle extends Shape {

    private double base;
    private double height;

    public RightAngledTriangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area(){
        return (base * height)/2;
    }

    @Override
    public double perimeter(){
        double hypotenuse = Math.sqrt(base*base + height*height);
        return hypotenuse + base + height;
    }

    @Override
    public String toString(){
        return super.toString()
                +"Base: " + base
                +"Height: " + height;
    }

}
