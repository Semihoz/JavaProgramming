package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;

        boolean leapyear = 2000%4 == 0;

        if (leapyear){
            System.out.println("Year " + year + " is leap year");
        }
  /*
        if (!leapyear){
            System.out.println("year " + year + " is a leap year");
        }
*/
        System.out.println("_________________________________________________");


        if (leapyear){
            System.out.println("year " + year + " is a leap year");
        }else{
            System.out.println("year " + year + " is not a leap year");
        }







    }













}
