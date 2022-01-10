package Replit_confusions.Muhtars_Delight;

import java.util.Locale;
import java.util.Scanner;

public class intitals {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your First name: ");
        String firstname = scan.next();
        System.out.println("What is your Last name: ");
        String lastname = scan.next();

        String initials = firstname.toUpperCase().charAt(0) + "." + lastname.toUpperCase().charAt(0);

        System.out.println("initials = " + initials);
        /*
        2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output

         */
    }
}
