package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String myGroup[] = new String[5];

      //  System.out.println( myGroup);  hash code this is wrong
myGroup[0] = "Gunay";
myGroup[1] = "Neira";
myGroup[2] = "Suat";
myGroup[3] = "Hulya";
myGroup[4] =  "Mikael";

        System.out.println(Arrays.toString(myGroup)); // this is how you print arrays!!!!!
        System.out.println("=====================================================================");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        System.out.println("====================================================================");

int number = 5;

if (number < 1 || number > 7){
    System.err.println("Invalid number");
    System.exit(0);
}
        System.out.println(days[number-1]);











    }
}
