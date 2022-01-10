package day37_Inheritance.AnimalTask;

import jdk.swing.interop.SwingInterOpUtils;

public class animal {

    public String name, breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){   System.out.println(name +" is Eating");    }








}


