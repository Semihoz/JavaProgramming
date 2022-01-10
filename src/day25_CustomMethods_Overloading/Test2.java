package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);


        System.out.println("=========================");

double[] arr2 = {1.2,1.3,1.4,1.5,1.6};

ArraysUtility.printEachElement(arr2);

        System.out.println("============================");

char[] arr3 = {'A','B','C','D'};

ArraysUtility.printEachElement(arr3);

        System.out.println("=============================");

String[] arr4 = {"David", "Elmira", "Ali", "Igor"};

ArraysUtility.printEachElement(arr4);
    }



}
