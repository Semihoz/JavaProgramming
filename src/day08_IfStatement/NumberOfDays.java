package day08_IfStatement;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 5;

        boolean has28Days = number == 2;  // for the months that have 28 days
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11; //for the months the have 30 days
        boolean has31Days = number == 1 || number == 3 || number == 5 || number == 7 ||number == 8 || number ==10 || number == 12;
        /*                                                       ^
         boolean has31Days = !has28days && !has30days;         <-|  "easier way of writing of whats on top
        */

        if (has28Days){ // if the months has 28 days it wouldve printed this copy
        System.out.println("28 Days");}
        if (has30Days){  // if the months has 30 days it wouldve printed this copy
        System.out.println("30 Days");}
        if (has31Days){  // if the months have 31 days it would print this copy as it did
        System.out.println("31 Days");}
    }






}
