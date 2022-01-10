package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10); //0
numbers.add(20); //1
numbers.add(30); //2
numbers.add(40); //3
numbers.add(50); //4
numbers.add(60); //5
numbers.add(70); //6
numbers.add(80); //7

numbers.add(2,25);
numbers.add(5,45);

        System.out.println(numbers);

        System.out.println(numbers.size());

        int LastIndex = numbers.size()-1;

        System.out.println("LastIndex = " + LastIndex);

  int num = numbers.get(3);

        System.out.println("num = " + num);


        System.out.println("========================================");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.println("===========================================");

ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.add("Java");
list.add("C##");
list.add("Ruby");

list.set(2, "JavaScript");
list.set(3, "C++");
list.remove(2);
        System.out.println(list);



    }

}
