package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println( num1 < 0 ); // false
        System.out.println( num2 < 0);  // true

        System.out.println("___________________________________");

        int a = 5;
        ++a; // pre increment: increases the value by 1 right away

        System.out.println( a );

        --a; // pre decrement: decreases the value by 1 right away

        System.out.println( a );

        System.out.println("______________________________________________-");

        int b = 100;

        System.out.println( ++b );  // pre increment: increases the value by 1 right away

        int c = 100;

        System.out.println( c++ );  // post increment: first passes the current value, then increase the value by 1
        System.out.println( c );  // 101

        System.out.println("_____________________________________________________");

        int x = 200;

        System.out.println( x-- ); //200
        System.out.println( x++ );  //199
        System.out.println( x );  //200
        System.out.println( ++x );  //201
        System.out.println( --x );  //200
        System.out.println( -x );  //-200
        System.out.println( x );  //200

        System.out.println("______________________________________________________");

        int z = 45;

        System.out.println( ++z ); //46
        System.out.println( z++);  // 47
        System.out.println( z );  //47
        System.out.println("_______________________________________________");
        int q = 30;
        System.out.println( --q );  //29
        System.out.println( q-- );  //29
        System.out.println( q ); //28

    }















}
