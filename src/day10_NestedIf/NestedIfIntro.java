package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 0 && score <= 100) { // if score are wiithin 1 - 100

            if (score >= 60) { //if score is above 60 student passed
                System.out.println("Passed");
            } else { //if student fails exam student fails
                System.out.println("Failed");
            }
        } else { //if score is above 100 point or under 0 point answer is going to be "invalid score"
            System.out.println("Invalid score");
        }

        System.out.println("_________________________________________--");

        int age = 21;
        Boolean hasID = true;

        if (hasID) { // If the person has ID

            if (age >= 21) { // If the persons age 21 or older
                System.out.println("Yes you can buy alc");
            } else { // If the persons age is younger then 21
                System.out.println("No you cant buy alc");
            }
        }else{
            System.out.println("You must have ID");
        }

        System.out.println("_____________________________________");

    int number = 2;

    if (number >= 1 && number <= 7) { // makes numbers only 1 thru 7 valid

        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        }else if (number == 5){
            System.out.println("Friday");
        }else if (number == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }
    }else{ //if not a valid number it will give this output
        System.out.println("Invalid number");
    }


    }
}