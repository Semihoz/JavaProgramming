package day45_Abstraction.Shape;

public class Cube extends Shape{

    public Cube(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cube{}";
    }
}
