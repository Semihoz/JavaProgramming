package day43_Abstaction.Car;

public abstract class Car {

    private final String brand,model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        setColor(color);
        if (year < 1886){
            throw new RuntimeException("Invalid year: " + year);
        }
        this.year = year;
        this.price = price;
    }


    public String getBrand() {  return brand;   }

    public String getModel() {  return model;   }

    public String getColor() {  return color;   }

    public int getYear() {  return year;    }

    public double getPrice() {  return price;   }

    public void setColor(String color) {    this.color = color;    }

    public void setPrice(double price) {    this.price = price;    }


public void stop(){
    System.out.println("Press on the brake");
}

public abstract void start();


    @Override
    public String toString() {
        return "Car{" +
                "brand= " + brand + '\'' +
                ", model= " + model + '\'' +
                ", color= " + color + '\'' +
                ", year= " + year +
                ", price= $" + price +
                '}';
    }
}
