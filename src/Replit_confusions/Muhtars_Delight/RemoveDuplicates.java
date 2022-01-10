package Replit_confusions.Muhtars_Delight;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

       int[] strs = {12,35,63,28,12,11,10,54};
       int[] strs2 = {47,34,22,554,34,77,32,21,64};

        System.out.println(removeDuplicate("avdgeafasfaggdgdfdf"));
        System.out.println(Arrays.toString(strs));
        System.out.println(maxNum(strs));
        System.out.println(minNum(strs));

        int a1 = strs.length;
        int a2 = strs2.length;

        int c1 = a1+ a2;

        int[] c = new int[c1];
        // using the pre-defined function arraycopy
        System.arraycopy(strs, 0, c, 0, a1);
        System.arraycopy(strs2, 0, c, a1, a2);
        System.out.println(Arrays.toString(c));





    }
    // 1. create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDuplicate(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
        if (!result.contains("" + each)){
            result += each;
        }
        }
        return result;

    }

//  2. create a method that can return the maximum number from an array of integers
public static int maxNum(int[] arr){

        int max = arr[0];
        for (int each : arr){
            if (each>max){
                max=each;
            }
        }
return max;
    }

//3. create a method that can return the minimum number from an array of integers
public static int minNum(int[] arr){

        int min = arr[0];
    for (int each: arr) {
        if (each<min){
            min=each;
        }
    }
    return min;
}

// 4. create a method that return the reversed array
public static int[] reverseArray(int[] arr) {

        int[] reverse = new int[arr.length];

    for (int i = arr.length-1, j = 0; i >=0 ; i--,j++) {

    }
    return reverse;
}

//5.create a method that can merge two arrays and return the new array
public static int[] arrayMerger(int[] call1, int[] call2){

        int[] mergedArray = new int[call1.length+call2.length];
        int index = 0;

    for (int each: call1) {
        mergedArray[index] = each;
        index++;
    }
    for (int each:call2) {
        mergedArray[index] = each;
        index++;
    }
        return mergedArray;
}
















}
