package day20_Arrays;

import java.util.Arrays;

public class OneToHundred {

    public static void main(String[] args) {


        int number[] = new int[100];

        int j = 100;

        for (int i = 0; i < number.length ; i++) {
            number[i] = j--;
        }
        System.out.println(Arrays.toString(number));

        System.out.println("====================================================================");

   int p = 1;

        for (int i = 0; i < number.length; i++) {
            number[i] = p++;
        }
        System.out.println(Arrays.toString(number));












    }
}