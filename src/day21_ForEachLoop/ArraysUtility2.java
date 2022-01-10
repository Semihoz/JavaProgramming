package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students = {"elif", "sinem", "Gunay", "Cihad", "David"};
        String[] earlybirds = Arrays.copyOf(students, 5);

        System.out.println(Arrays.toString(earlybirds));
    }
}
