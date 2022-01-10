package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3, 4, 5};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println();

   int[] scores = {95, 100, 55, 65, 95,78};

       Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        System.out.println("Min num:" + scores[0] );
        System.out.println("Max num: " + scores[scores.length-1]);

        String[] names = {"Gunay", "Anna", "Zuhal" , "Ahmet" , "Maria", "sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
    }
}
