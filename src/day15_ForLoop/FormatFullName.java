package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        System.out.println("Enter your full name:");

        String FirstName = "seMIh";
        String LastName = "OZDEMIR";

      FirstName = FirstName.substring(0 , 1).toUpperCase() + FirstName.substring(1).toLowerCase();

        System.out.println(FirstName);

        LastName = (""+ LastName.charAt(0) ).toUpperCase() + LastName.substring(1).toLowerCase();

        System.out.println(LastName);




    }
}
