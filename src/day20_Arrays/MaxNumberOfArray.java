package day20_Arrays;

import java.util.Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] number = {10, 5, 4, 20, 1, 0};

        int max =number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] > max){
            max = number[i];
            }
            System.out.println(Arrays.toString(number));
        }


        System.out.println(max);









    }
}
