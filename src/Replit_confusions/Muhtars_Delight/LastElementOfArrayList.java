package Replit_confusions.Muhtars_Delight;

import java.util.ArrayList;

public class LastElementOfArrayList {
    /*
    1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
     */
    public static void main(String[] args) {

        ArrayList<Integer> scroll = new ArrayList<>();
scroll.add(1);
scroll.add(2);
scroll.add(3);
scroll.add(4);
scroll.add(5);

        System.out.println(scroll);

scroll.set(4,0);
        System.out.println(scroll);

    }


}
