package day25_CustomMethods_Overloading;

public class AddElementsToArray_OverLoading {
    public static void main(String[] args) {

        int[] number = {1,2,3,4,5,6}; // 7

        char[] chars = {'A','B','C','D'};// 'E'

    String[] names = {"Ahmet", "Oleksandir", "Sinem", "Cihad"};// "Layan

  int[]  numbers = addInteger(number, 7);

   chars = addChar(chars, 'E');

  // names = addString(chars, "Layan");
    }

    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static double[] adddouble(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
  /*  public static String[] addString(char[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each: array) {
            result[i++] = each;
        }
        result[result.length-1]= element;
        return result;


    }


   */
}









