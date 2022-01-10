package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        byte grade = 11;
        String result = "";

        if (grade >= 1 && grade <= 18){

            switch (grade){
                case 6:
                    result = "Middle school";
                case 7:
                    result = "Middle school";
                case 8:
                    result = "Middle school";
                    break;
                case 9:
                    result = "High School";
                case 10:
                    result = "High School";
                case 11:
                    result = "High School";
                case 12:
                    result = "High School";
                    break;
                case 13:
                    result = "College";
                case 14:
                    result = "College";
                case 15:
                    result = "College";
                case 16:
                    result = "College";
                    break;
                case 17:
                    result = "Grad School";
                case 18:
                    result = "Grad School";
                    break;
                default: // 1 ~ 5
           result = "Elementary School";
            }
        }else{
            result = "Invalid Grade";
        }
        System.out.println(result);
   }
}
