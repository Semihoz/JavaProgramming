package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("Enter your Gender?");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("What is your Name?");
        String fullname = scan.nextLine();

        System.out.println("Enter your Phone number?");
        Long number = scan.nextLong();


        System.out.println("Enter your ZIPCODE?");
        int zip = scan.nextInt();

        scan.nextLine();

        System.out.println("What school do you attend?");
        String School = scan.nextLine();

        System.out.println("What is your city name?");
        String city = scan.nextLine();

        System.out.println("Whats your building number?");
        String Bnum = scan.nextLine();

        System.out.println("Enter your street name?");
        String Street = scan.nextLine();





        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("fullname = " + fullname);
        System.out.println("number = " + number);
        System.out.println("zip = " + zip);
        System.out.println("School = " + School);
        System.out.println("city = " + city);
        System.out.println("Bnum = " + Bnum);
        System.out.println("Street = " + Street);










    }
}
