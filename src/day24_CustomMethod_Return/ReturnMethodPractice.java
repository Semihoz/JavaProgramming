package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
int maxnumof2 = max(100, 200);

        System.out.println(maxnumof2);

      int multiplecation = maxnumof2 * 2;
        System.out.println("multiplecation = " + multiplecation);
    }

    public static int max(int a, int b) {

        int result = 0;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
return result;

    }












}