package Day26_CustomMethod_Practice;

import utilities.ArraysUtility;

public class MergeTwoArrays2 {

    // merge two int arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    // merge two double arrays
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    // merge two String Arrays
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge two chars arrays
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;


    }


}