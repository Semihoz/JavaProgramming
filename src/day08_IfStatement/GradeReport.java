package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {


        int score = 85;
        boolean A = score >= 90  && score <= 100;
        boolean B = score >= 80 && score <= 89;
        // boolean B = score >= 80 && !A;  // if score is A, But score is greater then 80
        boolean C = score >= 70 && score <= 79;
        // boolean C = !A && !B && score >= 70  // another way of writing the "C" code
        boolean D = score >= 60 && score <= 69;
        boolean F = score >= 0 && score <= 59;
        //boolean F = !A && !B && !C && !D;

if (A) { //if Student gets an A
    System.out.println("Excellent");}

if (B) {  //if student gets an B
    System.out.println("Great");}

if (C) {  // if student gets an C
    System.out.println("Good");}

if (D){  // if student gets an D
        System.out.println("Passed");}

if (F){  //if student gets an F
        System.out.println("Failed");}





    }








}
