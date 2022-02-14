package day43_Abstaction.Car;

import day43_Abstaction.Car.Car;

public class Audi extends Car {

    public Audi(String model, String color, int year, double price){
        super("Audi", model, color,year,price);
    }

public void start(){
    System.out.println("push the start button");
}

public void autoPark(){
    System.out.println(getBrand()+ " " + getModel() + "is parking itself");
}








}
