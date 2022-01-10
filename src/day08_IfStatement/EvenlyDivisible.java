package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        boolean divisbleBy2 = number % 2 == 0;
        boolean divisbleBy3 = number % 3 ==0;
        boolean divisbleBy5 = number % 5 ==0;

        System.out.println(number + " is divisble by 2: " + divisbleBy2);
        System.out.println(number + " is divisble by 3: " + divisbleBy3);
        System.out.println(number + " is divisble by 5: " + divisbleBy5);

        System.out.println("_______________________________________________________________________");

        int year = 2000;

        boolean isLeapYear = year % 4 == 0;

        System.out.println(year + " is leap year " + isLeapYear);












    }


















}
