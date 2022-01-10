package day21_ForEachLoop;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {


        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "IPhone 12 Case"};
        //                  0          1        2          3         4            5
        Double[] prices = {99.99,    150.0,   9.99,      250.0,     439.50,     39.99};

int[] itemIDs = {12345, 12346 ,12347, 12348, 12349, 12350};

for (int i = 0; i < items.length; i++){
    String item = items[i];
    double price = prices[i];
    int id = itemIDs[i];
    System.out.println(item+ " - " + Arrays.toString(prices) );
}



    }

}
