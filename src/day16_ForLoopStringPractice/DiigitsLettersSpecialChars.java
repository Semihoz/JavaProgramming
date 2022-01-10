package day16_ForLoopStringPractice;

public class DiigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^ &*()_+{}:";

        String digits = "";//12345
        String letters = "";//CydeoWoodenSpoon
        String Specialchars = "";//!@#$%

        for (int i = 0; i <= str.length() - 1; i++) { // i: index number from the first letter to very last.

            char ch = str.charAt(i); // ch: owns each and every string "str".

            if (ch >= '0' && ch <= '9') { // if the characters uses the digits 0~9.
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') { //the solution to collect the letters.
                letters += ch;
            } else {
                if (ch != ' ') {
                    Specialchars += ch; // if the characters are neither digits, or letters.
                }
            }
            System.out.println("digits = " + digits);
            System.out.println("letters = " + letters);
            System.out.println("Specialchars = " + Specialchars);


        }
    }
}