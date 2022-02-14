package day47_Polymorphism;

import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Dog;
import day46_Polymorphism.Shape.Circle;
import day46_Polymorphism.Shape.Shape;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


        //   Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        // WebDriver driver = (WebDriver) new ChromeDriver();

        // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;


        Animal animal = new Dog("Togo", "Blue Nose", 'M', 1, "Medium", "Dark Grey");

        // Dog dog = (Dog)animal; // downcasting
        //  dog.bark();

        System.out.println( animal.getName() );
        // System.out.println( dog.getName() );

        (  (Dog)animal  ).bark();




    }


}
