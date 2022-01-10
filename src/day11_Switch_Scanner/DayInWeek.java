package day11_Switch_Scanner;

public class DayInWeek {
    public static void main(String[] args) {

        int number = 9;                                            //Case number MUST match with switch' Data type
        //      You can not use (Float, Long, Double, and Boolean)                   and it must be unique
        switch (number){          //      You cant use decimals while using "Switch"
            case 1:
                System.out.println("Monday");

                break;  //exits the switch after executing the case block.

            case 2 :
                System.out.println("Tuesday");

                break;  //exits the switch after executing the case block.

            case 3 :
                System.out.println("Wednesday");

                break;  //exits the switch after executing the case block.

            case 4 :
                System.out.println("Thursday");

                break;  //exits the switch after executing the case block.

            case 5 :
                System.out.println("Friday");

                break;  //exits the switch after executing the case block.

            case 6 :
                System.out.println("Saturday");

                break;  //exits the switch after executing the case block.

            case 7 :
                System.out.println("Sunday");

                break;  //exits the switch after executing the case block.

            default:  // only gets executed if none of the case blocks are matching.
                System.out.println("Invalid");
         // and theres no need of break at the end because the curly brace also considered as a closing statement.
        }     //     <--------




















    }
}
