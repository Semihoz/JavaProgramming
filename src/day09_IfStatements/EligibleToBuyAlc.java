package day09_IfStatements;

public class EligibleToBuyAlc {
    public static void main(String[] args) {

        int age = 23;
        boolean b = age < 21;

        if (age >= 21) {
            System.out.println("Yes you can buy it ");
        } else{
            System.out.println("No you cannot");
            
        }

    }
}