package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programing Language";

        StringUtility.printEachChar(str);


        System.out.println("=====================================");

   String s1 = "Wooden Spoon";

  String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("================================");

String word = "Civic";

boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println(palindrome);


        System.out.println("==========================================");

        String[] names = {"Anna", "Java", "Python", "RaceCar", "Mom","Cydeo"};

int count = 0;
        for (String each: names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
            System.out.println();
        }

    }
}
