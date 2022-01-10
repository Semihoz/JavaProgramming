package day24_CustomMethod_Return;

public class ReturnMethodsPractice4 {
    public static void main(String[] args) {
        String str = "aaaaaaaaabbbbbbbbbbbbbbbbbbbcccccccccccccc";
      str = removeDuplicates(str);
        System.out.println(str);
    }

    public static String removeDuplicates(String str) {
String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)){
                result += each;
            }

        }
    return result;
    }
}
