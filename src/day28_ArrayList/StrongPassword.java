package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Semih2882!";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has UpperCase
        boolean r3 = false; // has LowerCase
        boolean r4 = false; // has SpecialCharacter
        boolean r5 = false; // has a Digit

  char[] chars = password.toCharArray();

        for (char each: chars) {
            if (Character.isUpperCase(each)){
                r2= true;
            }else if (Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{ // special char
                r4 = true;
        }

        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);


    }
public static boolean IsStrongPassword(String password){

    boolean r1 = password.length() >= 8 && !password.contains(" ");
    boolean r2 = false; // has UpperCase
    boolean r3 = false; // has LowerCase
    boolean r4 = false; // has SpecialCharacter
    boolean r5 = false; // has a Digit

    char[] chars = password.toCharArray();

    for (char each: chars) {
        if (Character.isUpperCase(each)){
            r2= true;
        }else if (Character.isLowerCase(each)){
            r3 = true;
        }else if(Character.isDigit(each)){
            r5 = true;
        }else{ // special char
            r4 = true;
        }

    }

    boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
    System.out.println("isStrongPassword = " + isStrongPassword);


    return isStrongPassword;
}
}
