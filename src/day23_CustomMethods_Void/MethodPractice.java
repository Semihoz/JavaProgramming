package day23_CustomMethods_Void;

public class MethodPractice {

    public static void main(String[] args) {
        helloCydeo();
        System.out.println("========================");
        helloWorld();
        System.out.println("========================");
        evenNumbers();
    }



    public static void helloWorld() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void helloCydeo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    public static void evenNumbers(){
        for (int i = 2; i < 11; i+=2) {
            System.out.print(i);
        }
    }


}
