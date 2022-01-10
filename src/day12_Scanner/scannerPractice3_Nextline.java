package day12_Scanner;

import java.util.Scanner;

public class scannerPractice3_Nextline {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String fullname = scan.nextLine();

        System.out.println("Enter your programming language");
        String programing = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your School Name");
        String SchoolName = scan.nextLine();


        System.out.println("fullname = " + fullname);
        System.out.println("programing = " + programing);
        System.out.println("age = " + age);

        System.out.println("SchoolName = " + SchoolName);
    }
}
