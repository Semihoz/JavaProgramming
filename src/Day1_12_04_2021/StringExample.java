package Day1_12_04_2021;

public class StringExample {
    public static void main(String[] args) {


/*


        String Word =" CYDEO";

        int lastindexchar = Word.length()-1;
        int lestsecondchat = Word.length()-2;

        String result = "" + Word.charAt(lastindexchar) + Word.charAt(lestsecondchat);

        System.out.println("result = " + result.repeat(3));

 */


   String str = "CYDEO";
   int lastsecondsofChar = str.length()-2;
   String chars = str.substring(lastsecondsofChar);
        System.out.println(chars.repeat(3));







    }
}
