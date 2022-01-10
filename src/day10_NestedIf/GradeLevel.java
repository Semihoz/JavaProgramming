package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        String result = "";
        int grade = 3;


        if (grade >= 1 && grade <= 18) {
            if (grade >= 1 && grade <= 5) {
                result = "Elementary";
            } else if (grade >= 6 && grade <= 8) {
                result = "Middle School";
            } else if (grade >= 9 && grade <= 12) {
                result = "high School";
            } else if (grade >= 13 && grade <= 16) {
                result = "College";
            } else {
                result = "Grad School";
            }
        }else {
            result = "Invalid Grade";
            }
        System.out.println(result);
        }

    }
