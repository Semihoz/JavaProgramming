package day15_ForLoop;


public class StringMethods {

    public static void main(String[] args) {
        String str = "   ";

        boolean r = str.isEmpty();

        System.out.println(r);

    boolean r1 = str.isBlank();

        System.out.println(r1);
        System.out.println("=======================================================================");
        String s1 = "SEMIH";
        String s2 = "semih";

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.equals(s2));

        System.out.println("===============================");
String sentence = "My favorite programming language is Java";

boolean hasCSharp = sentence.contains("C#");
boolean hasJava = sentence.contains("Java");
boolean hasJava2 = sentence.contains("java");
boolean hasJava3 = sentence.toLowerCase().contains("java");
boolean r3 = sentence.contains("java") || sentence.contains("Java");


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("=============================================");

String input1 = "I love JAvA";
String inout2 = "Java";

        System.out.println(input1.equals(inout2));              //for to use the equal tool they have to be the same
        System.out.println(input1.equalsIgnoreCase(inout2));    //amount of characters and size of letters

        System.out.println(input1.contains("Java"));

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println("==========================");

    String a = "Wooden Spoon";

    boolean x = a.startsWith("Woo");
    boolean y = a.endsWith("Spoon");
    boolean z = a.toLowerCase().startsWith("wooden");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);








    }



}












