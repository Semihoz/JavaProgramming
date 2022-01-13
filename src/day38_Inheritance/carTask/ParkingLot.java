package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Supra" ,"White", 1994, 79000,24000);

        Tesla tesla = new Tesla("Plaid", "Blue", 2022, 100000,0);

        BMW bmw = new BMW("M3", "Dark Grey", 2022, 90000,0);



        bmw.start();
        toyota.start();
        tesla.start();
    }

}
