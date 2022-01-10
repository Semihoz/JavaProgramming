package Replit_confusions.Muhtars_Delight;

import java.util.Arrays;

public class TwoDimensional {
    public static void main(String[] args) {
        /*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
         */
int[][] arr =  { {1,2,3}, {4,5,6}};

        int[][] reverse = new int[arr.length][arr[0].length];
        int first = arr.length-1;
        for (int i = 0; i < arr.length; i++){
            int second = arr[i].length -1;
            for (int j = 0; j < arr[i].length; j++) {
                reverse[i][j] = arr[first][second];
                second--;
            }
        first--;
        }
        System.out.println(Arrays.deepToString(reverse));





    }
}
