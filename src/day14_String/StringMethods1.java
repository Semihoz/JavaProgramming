package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {


        String str1 = "            batch 25              ";
        str1 = str1.trim(); // creates a new string without all the spaces above "batch 25"

        System.out.println(str1);

        String str2 = "Cydeo School";

        int n1 =str2.indexOf("h");

        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");

        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("an");

        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua");

        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");

        System.out.println("n5 = " + n5);


        System.out.println("=====================================================");

    String s = "Java Nova Cava Wawa Orange";

    int firsta = s.indexOf("a");
    int lasta = s.lastIndexOf("a");
    int seca = s.indexOf("a N");
    int thirda = s.indexOf("a C");
    int fortha = s.indexOf("Ca") + 1;
    int fiftha = s.lastIndexOf("a W");
    int sixtha = s.indexOf("aw");
    int seventha = s.indexOf("a O");
    int eightha = s.indexOf("ang");

        System.out.println("firsta = " + firsta);
        System.out.println("lasta = " + lasta);
        System.out.println("seca = " + seca);
        System.out.println("thirda = " + thirda);
        System.out.println("fortha = " + fortha);
        System.out.println("fiftha = " + fiftha);
        System.out.println("sixtha = " + sixtha);
        System.out.println("seventha = " + seventha);
        System.out.println("eightha = " + eightha);

























    }
}
