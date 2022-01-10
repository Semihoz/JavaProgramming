package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your First number");
        int num1 = scan.nextInt();

        System.out.println("Enter your Second number");
        int num2 = scan.nextInt();

        System.out.println("Enter a valid symbol");
        char ch = scan.next().charAt(0);

        while (!( ch == '+' || ch == '-')){ // if the operator is invalid
            System.err.println("Invalid entry Please reenter");
            ch = scan.next().charAt(0);
        }
        System.out.println((ch == '+')? num1+num2 : num1-num2);


    }
}
