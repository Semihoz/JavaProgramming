package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

       Car car1 = new Car();
       car1.setInfo("BMW", "M3", "Matte Black", 2022, 90000.00);

       Car car2 = new Car();
       car2.setInfo("Infinti", "Q50RS", "Red", 2021, 35000.00);

       Car car3 = new Car();
       car3.setInfo("Audi", "RS4", "Grey", 2020, 140000.00);


       ArrayList<Car> carsList = new ArrayList<>();
       carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each:carsList) {
            System.out.println(each.brand + " : " + each.price);
        }


    }
}