package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: "); //asks what to integer to use in the print boxes

   int num1 = scan.nextInt();

        System.out.println("Enter a decimal");   // asks what decimal should be used in print boxes

        double num2 = scan.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1 * num2));

        scan.close();       //Cant use scanners after the close scan prints

/*
        System.out.println("Enter an Integer");

        int num3 = scan.nextInt();
        System.out.println(num3);
 */




    }


}
