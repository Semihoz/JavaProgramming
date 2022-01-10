package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        int s = 195;

        String result = (s >= 0 && s <= 100)? (s >= 90)? "Excellent" :(s >= 80)? "great" :(s >= 70)? "Good"
        :(s >= 60)? "Passed" : "failed"       : "invalid score";
        System.out.println(result);
    }
}
