package day19_LoopPractices;

public class FirstUnique {
    public static void main(String[] args) {
        //  4. Write a program that can return the index number of the first unique character.

   String abc = "aaabbsaddw";
String result = "";

   int count = 0;
        for (int i = 0; i < abc.length(); i++) {
            char ch =  abc.charAt(i);

            char each = abc.charAt(i);
        if (ch == each){
            count++;
        }
        result += ch;



        System.out.println(result);


        }












    }
}
