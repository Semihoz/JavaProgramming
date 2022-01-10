package day17_While_DoWhile;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String un = "Cydeo";
        String pw = "Cydeo123";



        System.out.println("Enter your username: ");
        String u = scan.nextLine();

        System.out.println("enter your password: ");
        String p = scan.nextLine();

if (u.equals("Cydeo") && p.equals("Cydeo123") ){ // if the credentials are valid your logged in
    System.out.println("Logged in ");
}else{
    int attempt = 3;

    while (!(u.equals("Cydeo")&& p.equals("Cydeo123"))&& attempt > 0){// while the credentials are invalid
 if (attempt == 1){
     System.out.println("LAST ATTEMPT");
 }
    System.out.println("Incorrect username or password, please re-enter");
    System.out.println("Enter your username:");
    u = scan.next();

    System.out.println("Enter your password: ");
    p = scan.next();
attempt--;
}
if (u.equals("Cydeo") && p.equals("Cydeo123")){
    System.out.println("logged in");
}else{
    System.out.println("Your account is locked.");
}

scan.close();
}








































    }


























































}
