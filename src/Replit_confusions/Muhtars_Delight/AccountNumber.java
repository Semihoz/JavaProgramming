package Replit_confusions.Muhtars_Delight;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Account number:");

    String acountnum = scan.nextLine(); ;

    int num = acountnum.length();
    char enter = acountnum.charAt(0);

    boolean isValid = (enter == '2' && num == 7 ) || (enter == '5' && num == 10);

    /*
     6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”


     */

    }
}
