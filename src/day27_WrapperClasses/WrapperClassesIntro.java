package day27_WrapperClasses;

import com.sun.jdi.IntegerValue;
import jdk.swing.interop.SwingInterOpUtils;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; // AutoBoxing

        int num2 = n1; // unboxing

        System.out.println("===============================");

        Integer integerValue = 100;

        long longvalue = integerValue;

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("==========================================");

        int num3 = 200;
       // Long l2 = num3;
        Integer num4 = num3; // autoboxing

        System.out.println("===========================================");

Integer z = 900;
Integer y = z;

        System.out.println("=============================================");





    }
}
