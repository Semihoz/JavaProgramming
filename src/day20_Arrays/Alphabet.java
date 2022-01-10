package day20_Arrays;

import day06_PrimitiveTypeCastings.HappyBirthDay;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet = new char[26];


        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
           alphabet[i] = ch;
        }
alphabet[0] = 'Z';
alphabet[1] = 'Y';
alphabet[2] = 'X';
        System.out.println(Arrays.toString(alphabet));



















































    }
}
