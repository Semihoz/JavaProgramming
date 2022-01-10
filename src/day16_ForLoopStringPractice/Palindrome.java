package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {


        String word = "level";

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
       reversed += word.charAt(i);
        }

  boolean isPalindorome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindorome = " + isPalindorome);;











    }
}
