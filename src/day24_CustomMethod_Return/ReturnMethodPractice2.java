package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {
    public static void grade(int score) {

        String result = "";
    if (score < 0 || score > 100){ // all of the invalid scores
        result = "Invalid";
    }else{
        result = (score >= 90)?"A":(score >= 80)?"B":(score >= 70)?"C":(score >= 60)?"D": "F"; // all of the valid scores
        }
        System.out.println(result);
    }



    }

