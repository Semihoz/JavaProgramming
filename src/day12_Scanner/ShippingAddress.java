package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
   String fullname = scan.nextLine();

        System.out.println("Enter your building number");
   String bulidingnum = scan.next();

        scan.nextLine();
        System.out.println("Enter Street Name: ");
   String StreetName = scan.nextLine();

        System.out.println("Enter your city name: ");
        String Cityname = scan.nextLine();

        System.out.println("Enter your State");
        String State = scan.nextLine();

        System.out.println("Enter your Zipcode: ");
        int zipcode = scan.nextInt();

        System.out.println("fullname = " + fullname);
        System.out.println("bulidingnum = " + bulidingnum);
        System.out.println("StreetName = " + StreetName);
        System.out.println("Cityname = " + Cityname);
        System.out.println("State = " + State);
        System.out.println("zipcode = " + zipcode);
    }
}