package day13_StringClass;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


/*


        String word = "CYDEO";

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        char tenthchar =word.charAt(9);

        System.out.println("tenthchar = " + tenthchar);
*/
        System.out.println("==========================================================");

    String s1 = "Batch 25 is the best batch. Java programming language";

    int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

    char lastchar = s1.charAt(   s1.length()-1);
        System.out.println("lastchar = " + lastchar);

        System.out.println("=======================================================");

        String str = " Wooden spoon";
      str = str.toLowerCase(); //WOODEN SPOON
        System.out.println(str);

    }
}
