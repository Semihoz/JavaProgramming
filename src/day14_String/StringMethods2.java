package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fin, I love learning Java";
      String str2 = str.replace("Java" , "Python");  //  "Python is fin, I love learning Python";

        System.out.println(str);
        System.out.println(str2);

        System.out.println("=====================================================");
String email = "JohnSmith@Yahoo.com";
String google = email.replace("Yahoo" , "Gmail");

        System.out.println(email);
        System.out.println(google);

        System.out.println("==================================================");

        String sentence = "Java Java Python Python C# C# C++ C++ Pyhton Python Python Python";
        String sentence2 = sentence.replace("Python", "");
       sentence2.replace(" ", " ");

        System.out.println("sentence2 = " + sentence2);
        System.out.println("=======================================================");

        String s = "Dog Dog Dog Dog Dog Dog";
         s = s.replace("Dog", "Cat");

        System.out.println("s = " + s);

        System.out.println("======================================");

        String s2 = "C# is fun, C# is cool";

       s2 = s2.replace(" C#", " Java");

        System.out.println("s2 = " + s2);

        System.out.println("====================================================================");

        String s3 = "Java";

         s3 = s3.replace("J", "L");

        System.out.println("s3 = " + s3);

        System.out.println("=========================================================");

        String result = "Java Java Java";

        result = result.replaceFirst("Java", "Python");

        System.out.println("result = " + result);

        System.out.println("=============================================");

        String result2 = "C# is fun, C# is cool";

        result2 = result2.replaceFirst("C#", "Java");

        System.out.println("result2 = " + result2);

        System.out.println("========================================================");

        String result3 = "Java";

        result3 =result3.replace("va" , "vo");

        System.out.println(result3);


    }
}
