package day07_Operators;

public class Castings {

    public static void main(String[] args) {
/*1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;

 */
        float avarageScore = 20.5F;

        byte num1 = (byte)avarageScore;
        short num2 = (short) avarageScore;
        int num3 = (int)avarageScore;
        long num4 = (long)avarageScore;
        float num5 = avarageScore;
        double num6 = avarageScore;

        System.out.println("num 1 = " + num1);
        System.out.println("num 2 = " + num2);
        System.out.println("num 3 = " + num3);
        System.out.println("num 4 = " + num4);
        System.out.println("num 5 = " + num5);
        System.out.println("num 6 = " + num6);


    }















}
