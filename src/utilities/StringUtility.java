package utilities;

import java.util.Arrays;

public class StringUtility {

    // prints each character of the given String
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

// Reverses the given String and returns the reversed String
public static String reverse(String str){
String result = "";

    for (int i = str.length()-1; i >= 0; i--) {
        result += str.charAt(i);
    }
    return result;
}

//Checks if the given string is a Palindrome or not ,As a boolean
public static boolean isPalindrome(String str){
       return reverse(str).equalsIgnoreCase(str);

}

//checks if the given String is an anagram, returns as a boolean
public static boolean anagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);

    Arrays.equals(ch1,ch2);
    return false;
}

//Removes duplicates from the given String, returns as a String     "AAAAAAAAABBBBBBBBBBCCCCCCCCC" ===> "ABC"
public static String removeDuplicates(String str){

        String result = "";

    for (int i = 0; i < str.length(); i++) {
        char each = str.charAt(i);

        if (!result.contains(""+each)){
            result += each;
        }
    }
    return result;
}




}
