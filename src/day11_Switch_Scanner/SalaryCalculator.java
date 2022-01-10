package day11_Switch_Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 75_000;
        boolean ismarried = true;

        double taxrate = 0;

        if (salary >= 130000) { //false: salary < $130,000
            taxrate = 0.35;
        } else if (salary >= 100000) { // false : salary < $ 100,000
            taxrate = 0.30;
        } else if (salary >= 80000) {// false : salary < 80,000
            taxrate = 0.25;
        } else {
            taxrate = 0.20;
        }
        if (ismarried) { // if the person is married we subtract .05 %
            taxrate -= 0.05; //subtracting .05%
        }
 double salaryaftertax = salary - (salary*taxrate);

        System.out.println("Salary After Tax = " + salaryaftertax);


    }
}