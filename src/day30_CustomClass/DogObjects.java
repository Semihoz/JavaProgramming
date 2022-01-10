package day30_CustomClass;

import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println((dog1));

   Dog dog2 = new Dog();
   dog2.setInfo("Togo", "Pitbull", 9, 'M', "Medium", "Grey");

        System.out.println(dog2);

    }
}
