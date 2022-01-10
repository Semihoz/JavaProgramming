package day10_NestedIf;

public class OxygenTank {
    /*   public static void main(String[] args) {
      int oxygen = 90;


         String result = (oxygen >= 100 && oxygen <= 0)?
          (oxygen >= 90)? " Your tank is full" :(oxygen >= 80)? "Still okay"
                  :(oxygen >= 70)? "Don't go to far" :(oxygen >= 60)? "Start to head back"
                  :(oxygen >= 50)? "Becareful now you at 50%" : "GO BACK" :
         System.out.println("result");
          */
          public static void main(String[] args) {
        int number = 12;
        String result = "";

        if(number >=90){
            result = "Full";
        }
        else if (number>=80 && number<=90){
            result = "Still okay";
        }
        else if (number>=70 && number<=80){
            result = "Don't go too far";

        }
        else if(number>=60 && number<=70){
            result = "Start to head back";
        }
        else {
            result = "Be careful now you are going to die";
        }
        System.out.println(result);
         /* 4. Create a class called OxygenTank. You are diving in the ocean.
        Your oxygen tank has a certain level (number) and you must print a message based on the level:

                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
         */




    }
}
