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
