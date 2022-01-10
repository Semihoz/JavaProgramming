package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {

    System.out.println("Enter your first number"); // the Question
    int num1 = scan.nextInt(); // the users answer

    System.out.println("Enter your second number "); //the question
    int num2 = scan.nextInt(); // the users answer

    System.out.println("Addition: " + (num1 + num2)); // the solution of the two questions combined

    System.out.println("would you like to continue?"); //question
    String a = scan.next().toLowerCase(); // answer

    while ( a.equals("yes") || !a.equals("no")){ // the answer is yes  or no
        System.err.println("Invalid entry pleas re-enter"); // if not yes or no makes re-enter
        a= scan.next().toLowerCase(); //makes it not uppercase/lowercase senstive
 break; // done
    }


    if (a.equals("no")) {// if answer no
        break; // done
    }

}










    }

}
