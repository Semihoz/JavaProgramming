package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;
    static int b = 200;




    static void method2(){
        System.out.println("Static method");
    }

void method3();

    default void method4(){
        System.out.println("Default method");
    }

class Test implements PropertiesOfInterface{

        public void method3() {

        }
        }

    public static void main(String[] args) {
        new Test().method4();
    }


}
