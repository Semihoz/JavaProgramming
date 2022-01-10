package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); //90~100

        gradeOfA.removeIf(p -> !(p >= 90 && p <= 100) );
        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);

        gradeOfB.removeIf(p -> !(p >= 80 && p <= 89));
        System.out.println(gradeOfB);

        ArrayList<Integer>gradeOfC = new ArrayList<>();

        gradeOfC.removeIf(p -> !(p >=70 && p <= 79));
        System.out.println(gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>();
        gradeOfD.removeIf(p -> !(p >=60 && p <= 69));
        System.out.println(gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);
    gradeOfF.removeIf((Predicate<? super Integer>) gradeOfA);
    gradeOfF.removeIf((Predicate<? super Integer>) gradeOfB);
    gradeOfF.removeIf((Predicate<? super Integer>) gradeOfC);
    gradeOfF.removeIf((Predicate<? super Integer>) gradeOfD);

        System.out.println(gradeOfF);

        System.out.println("Total number of A's :" +gradeOfA);
        System.out.println("Total number of B's :" +gradeOfB);
        System.out.println("Total number of C's :" +gradeOfC);
        System.out.println("Total number of D's :" +gradeOfD);
        System.out.println("Total number of F's :" +gradeOfF);

    }
}
