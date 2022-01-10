package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c =20;


        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /* in order for a to be the median number
        1. if c is the maximun number & b is the minimum number
        2. if b is the maximun number & c is the minumum number
         */
        boolean bIsMedian = (b > a && b < c) || ( b > c && b < a);
        /* in order fo b to be the ,edian number
        1. if a is the maximum number & c is the minimum number
        2. if c is the maximum number & a is the minimum number
         */
        boolean cIsMedian = (c > a && c < b) || ( c > b && c < a);  // boolean = !aIsMedian && !bIsMedian
        /* in order for c to ber median
     1. b would be the maximum number & a would be the minimum number
     2. a would be the maximum number & b would be the minimum number
      */

if (aIsMedian){
    System.out.println(a + " Is the Median number");
}
if (bIsMedian){
    System.out.println(b + " Is the Median number");
}
if (cIsMedian){
    System.out.println(c + " Is the Median number");
}

        /*
        Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

        Ex:
        a = 10, b= 15, c = 20;

        Output:
        15 is the median number
 */








    }












}
