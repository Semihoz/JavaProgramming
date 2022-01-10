package Replit_confusions.Muhtars_Delight;

import java.util.ArrayList;

public class SwapFirstAndLastArrayList {
    /*
    2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];

     */
    public static void main(String[] args) {
        ArrayList<Integer> scroll = new ArrayList<>();

        scroll.add(1);
        scroll.add(2);
        scroll.add(3);
        scroll.add(4);
        scroll.add(5);

        System.out.println(scroll);

        scroll.set(0,5);
        scroll.set(4,0);
        System.out.println(scroll);
    }
}
