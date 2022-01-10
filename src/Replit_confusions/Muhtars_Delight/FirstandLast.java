package Replit_confusions.Muhtars_Delight;

import java.util.Scanner;

public class FirstandLast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

                System.out.println("Enter a sentence: ");
                String sentence = scan.nextLine();
                char firstChar = sentence.charAt(0);
                char lastChar= sentence.charAt(sentence.length()-1);
                System.out.println("firstChar = " + firstChar);
                System.out.println("lastChar = " + lastChar);


            }
        }
/*
   1. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

    */