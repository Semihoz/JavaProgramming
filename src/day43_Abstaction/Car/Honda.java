package day43_Abstaction.Car;

import day43_Abstaction.Car.Car;

public class Honda extends Car {


    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

public void start(){
    System.out.println("Twist the key to ignition");
}




}