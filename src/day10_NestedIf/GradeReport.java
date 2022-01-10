package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
String result = ""; //temporary
        int score  = 98;

        if (score >= 0 && score <= 100){
            if (score >= 90 ){
                result ="Excellent";
            }else if (score >= 80){
                result = "Great";
            }else if (score >= 70){
                result = "Good";
            }else if (score >= 60 ){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else {
            result = "Invalid Grade";
        }
        System.out.println(result);
    }
}
