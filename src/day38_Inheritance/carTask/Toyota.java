package day38_Inheritance.carTask;

public class Toyota extends Car{


    public Toyota(String model, String color, int year, double price, int miles) {
        super( "Toyota", model, color, year, price, miles);
    }

public void reliable(){    System.out.println(brand + " " + model + " is reliable ");   }

   public void start(){
       System.out.println("Twist the key in ignition to start ya " + brand + " " + model);
    }
}
