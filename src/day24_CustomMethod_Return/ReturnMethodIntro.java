package day24_CustomMethod_Return;

import org.w3c.dom.ls.LSOutput;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        String str = "Level";
        String result = reverse(str);

        System.out.println(result);
        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " Is Palindrome");
        }else{
            System.out.println(str + " Is not a Palindrome");
        }
    }
public static String reverse(String str){
        String reverse = "";
    for (int i = str.length()-1; i >= 0; i--) {
        reverse += str.charAt(i);

    }
return reverse;

    }






}
