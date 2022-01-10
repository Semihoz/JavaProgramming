package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

       int num = Integer.parseInt(str);

        System.out.println(num + 1); //124
        System.out.println(str + 1); //1231

        String str2 = "10.5";

       double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 1.74); //12.24
        System.out.println(str2 + 1.74); //10.51.74

      int max = Integer.MAX_VALUE;
      int min = Integer.MIN_VALUE;

        System.out.println(min);
        System.out.println(max);

        System.out.println("=============================");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); // integer
        int y = Integer.valueOf(s2); // integer

        System.out.println(x + 1); //124
        System.out.println(y + 2); //125

        String s3 = "1.5";
        double z = Double.valueOf(s3); // double

        System.out.println(z + 2.3); // 3.8
    }
}
