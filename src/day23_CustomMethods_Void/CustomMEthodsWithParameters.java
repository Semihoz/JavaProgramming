package day23_CustomMethods_Void;

public class CustomMEthodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(19);

ageOfPerson(2002);





    }

    public static void oddOrEven(int number){
        if (number % 2 == 0 ){
            System.out.println(number + " is a Even number");
        }else {
            System.out.println(number + " is a Odd number");
        }
    }

    public static void ageOfPerson(int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Your age is " + age);
    }

    public static void printNumbers(int x, int y){

    }





}
