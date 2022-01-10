package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age =38;
        String citizen = "USA";

        boolean isEligble = age >=21 && citizen == "USA";

        //Eligible
       if (isEligble){
           System.out.println("Eligble");
       }


        //Not Eligible
        if(!isEligble) {
            System.out.println("Not Eligible");
        }


    }







}
