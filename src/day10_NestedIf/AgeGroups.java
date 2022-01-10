package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
       int age = 43;
       String agegroup = "";

       if (age <= 21) {
           agegroup = "Teenager";
       }else if (age >= 21 && age <= 55){
           agegroup = "Adult";
       }else if (age >= 55 && age <= 150){
           agegroup = "Senior";
        }
       else if (age > 150 || age < 0){
            agegroup = "invalid";

        }
        /*
       4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
        System.out.println(agegroup);
    }
}
