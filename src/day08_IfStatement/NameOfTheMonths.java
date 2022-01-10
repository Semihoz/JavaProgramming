package day08_IfStatement;

public class NameOfTheMonths {

    public static void main(String[] args) {

        int number = 7;

        int January = 1;
        int Febuary = 2;
        int March = 3;
        int April = 4;
        int May = 5;
        int June = 6;
        int July = 7;
        int August = 8;
        int September = 9;
        int October = 10;
        int November = 11;
        int December = 12;

        if (number == 1) {
            System.out.println("January");
        }

        if (number == 2) {
            System.out.println("Febuary");
        }
        if (number == 3) {
            System.out.println("March");
        }
        if (number == 4) {
            System.out.println("April");
        }
        if (number == 5) {
            System.out.println("May");
        }
        if (number == 6) {
            System.out.println("June");
        }
        if (number == 7) {
            System.out.println("July");
        }
        if (number == 8) {
            System.out.println("August");
            if (number == 9) {
                System.out.println("September");
            }
            if (number == 10) {
                System.out.println("October");
            }
            if (number == 11) {
                System.out.println("November");
                if (number == 12) {
                    System.out.println("December");
                }
            }
        }


    }
}