package practice_12_15_2021;

public class SumOfEven_Odd {
    public static void main(String[] args) {


        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i = 0;

        do {
        if (i % 2 == 0) {
            sumOfEven += i;
        } else {
            sumOfOdd += i;
        }
        i++;
    }
    while(i<=10);
        System.out.println("Sum of even number are "+ sumOfEven);
        System.out.println("Sym of odd numbers are " + sumOfOdd);
    }
}
