package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        String output = "";

        if (grade == 'A') {
            output = "'A' && excellent";
        } else if (grade == 'B') {
            output = "'B && Great Job";
        } else if (grade == 'C') {
            output = "'C && Good";
        }else if (grade == 'D') {
            output = "'D && passed";
        }else if (grade == 'F') {
            output = "'F && Failed";
        }else output = "Invalid Grade Level Given";
        System.out.println(output);
        /*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
    }
}
