package Replit_confusions.Zulkipar_Tasks;

public class frequencyOfCharacters {

    public static void main(String[] args) {

//1️⃣ String - Frequency of Characters
//Write a return method that can find the frequency of characters
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2




        String given = "AAABBCDD";
        String expected = ""; //A3B2C1D2

        for (int i = 0; i < given.length(); i++) {

            char ch = given.charAt(i);
            int count = 0;

            for (int j = 0; j < given.length(); j++) {

                char each = given.charAt(j);
                if (ch == each){
                    count++;
                }
            }

       if (expected.contains(""+ch)){
           continue;
       }


            expected += ch;
            expected += count;

            System.out.println(expected);

        }



    }
}
