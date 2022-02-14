package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "aabcccd";
        String result = ""; //a2b1c3d1

        for (int j = 0; j < word.length(); j++) {

            char ch = word.charAt(j); // 'a'
            int count = 0;

            for (int i = 0; i < word.length(); i++) {

                char each = word.charAt(i); // "i" is representing all the characters in the string word
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;

            System.out.println(result);


        }





    }
}
