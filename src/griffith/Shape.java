//Mariia Kolodiazhna
//3149166

package griffith;

public abstract class Shape {

    //declare variables
    private String name;

    //constructor
    public Shape (String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //declaring abstract methods to override
    public abstract double area();
    public abstract double perimeter();


    @Override
    public String toString() {
        return "Shape: " + name;
    }
}
