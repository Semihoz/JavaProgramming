package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i <= str.length() - 1; i++) { // the variable "i" is the indexes of the string of str
            char eachChar = str.charAt(i); // eachChar: each character of str

            if (ch == eachChar) {// if given char is matching with the eachChar, the ch is appeared in the string
                frequency++;
            }


            System.out.println(frequency);


        }
















    }

}
