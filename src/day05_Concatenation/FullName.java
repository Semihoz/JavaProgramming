package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String first = "Semih";
        String last = "Ozdemir";
        int age =19;
        String jobtitle = "SDET";
        String companyName = "Apple Inc";
        String salary = "120,000";

        String fullName = first + " " + last;


        System.out.println(first + " " + last);
        System.out.println(last + " " + first);

        System.out.println("full name of the person is " + fullName);

        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is " + jobtitle +", works at " + companyName + ", and " + fullName
                + " salary is " + "$" + salary);

    }


}
