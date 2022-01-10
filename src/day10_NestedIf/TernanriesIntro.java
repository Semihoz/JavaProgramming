package day10_NestedIf;

public class TernanriesIntro {
    public static void main(String[] args) {


        int n = 100;

        if (n%2 == 0){
            System.out.println("even");  //String
        }else{
            System.out.println("Odd");  //String
        }
        System.out.println("_________________________________________________");
      String result1 =  (n%2 == 0)? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("______________________________________________");

int age = 23;

if (age >= 21){
    System.out.println("Eligible");
}else{
    System.out.println("Not eligible");
}

        System.out.println(  (age >= 21)? "Eligible": "Not elible");








    }






}
