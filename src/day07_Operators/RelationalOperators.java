package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 200 > 40;  //True

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;  //True

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;  //True

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;  //False

        System.out.println("result4 = " + result4);

        // credit score of 720
        int score = 745;

        boolean isEligibleForLoan = score >= 720;  //If credit score is 720 or greater, then it would've been eligible

        boolean result5 = 100 <120; //True
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180;  //False

        System.out.println("result6 = " + result6);

      boolean result7 = 45 <= 60;

        System.out.println("result7 = " + result7);

        System.out.println("__________________________________________________________");

        int x = 100;
        int y = 200;

       boolean equal = x == y;

        System.out.println("equal = " + equal);

        boolean result8 = "muhtar" == "goodguy";  //False

        boolean result9 = "Java" == "Java";  //True

        System.out.println("result9 = " + result9);

        System.out.println("_____________________________________________________________________________-");

        boolean result11 = 100 != 200;  //True

        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break";  //True

        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300;  //False

        System.out.println("result13 = " + result13);













    }














































































































}
