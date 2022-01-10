package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 30;
        int b = 7;

        int count = 0; // variable "count = (0)"

        while (a >= b){ // if 30 is greater or equal to 7
            a -=b; // u subtra
            count++;
        }
        System.out.println(count);
    }
}
