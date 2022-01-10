package Day26_CustomMethod_Practice;

public class FrequencyOfElement {
    //returns the frequency of the given element to array,from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (int each:array) {
            count ++;
        }
        return count;
    }
    //returns the frequency of the given element to array,from the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each:array) {
            count ++;
        }
        return count;
    }
    //returns the frequency of the given element to array,from the given array
    public static double frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each:array) {
            count ++;
        }
        return count;
    }
    //returns the frequency of the given element to array,from the given array

    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each:array) {
            count ++;
        }
        return count;
    }
}
