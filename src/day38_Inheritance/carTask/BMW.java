package day38_Inheritance.carTask;

public class BMW extends Car{


    public BMW(String model, String color, int year, double price, int miles) {
        super("BMW", model, color, year, price, miles);
    }

public void breaksDown(){
    System.out.println(brand + " " + model + " broke down");
}
public void racing(){

    System.out.println(brand + " " + model + " is raceing");
}










}
