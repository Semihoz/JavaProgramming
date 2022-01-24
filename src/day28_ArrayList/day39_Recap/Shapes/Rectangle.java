package day28_ArrayList.day39_Recap.Shapes;

public class Rectangle extends Shape {

    private double length, width;

    public double getLength() {
      if (length <= 0){
          System.err.println("Invalid length " + length);
          System.exit(1);
      }
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<= 0){
            System.err.println("Invalid Width " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle(String name, double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);

    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * ( length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}


