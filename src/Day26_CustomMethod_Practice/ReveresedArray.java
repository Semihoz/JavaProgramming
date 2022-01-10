package Day26_CustomMethod_Practice;

public class ReveresedArray {

    //revese any int array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        {
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = array[i];
            }
        }

        return result;
    }

    //reverse any char array
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];
        {
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = array[i];
            }
        }

        return result;
    }

    //reverse any String array
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        {
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = array[i];
            }
        }

        return result;
    }

    //reverse any double array
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];
        {
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = array[i];
            }
        }

        return result;
    }











}