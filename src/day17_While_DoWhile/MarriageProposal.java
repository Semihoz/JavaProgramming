package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me: Yes/No");

        String a = scan.next().toLowerCase();

        while ( !(a.equals("Yes") || a.equals("No" )) ){
            System.out.println("Invalid answer, Please re-enter");
        a = scan.nextLine().toLowerCase();
        }
        if (a.equals("Yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }




    }
}
