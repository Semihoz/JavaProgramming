package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {

    public static void main(String[] args) {

        byte a = 100;
       short b = a;
       // short b = (short)a;
       //           (short)a

       int c = b; // implicit casting
       // imt c = (int)b

        long d = c ;
        //      (long)c

        float e = d;
        double f = e;

        System.out.println("__________________________________________________________________________________________");

        int x = 55;
        short y = (short)x;

        System.out.println(x + " : " + y);

        long J = 1000000;
        short k = (short)J;

        System.out.println(J + " : " + k);


    }











}
