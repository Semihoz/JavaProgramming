package day19_LoopPractices;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aabccdeef";

        String result = ""; //b,d,f


        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int count = 0; // represents the frequency of the variable "ch"

            for (int i = 0; i < str.length(); i++) { // compares the characters in the loop
                char each = str.charAt(i); // each character in str
                if (ch == each) {
                    count++;
                }
            }

      if (count != 1){
          continue;
      }

      result += ch;






        }

        System.out.println(result);























    }
}
