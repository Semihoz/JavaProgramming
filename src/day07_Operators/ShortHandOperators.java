package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment: =
        int number = 100;

        System.out.println("number = " + number);  // 100

        number = 200;

        System.out.println("number = " + number);  // 200

        System.out.println("___________________________________________________");

        String word = "Java Programming";

        System.out.println("word = " + word); // Java Programming

        word = "Wooden Spoon";

        System.out.println("word = " + word);

        word = "Cydeo";

        System.out.println("word = " + word);

        word = "Java Programming";

        System.out.println("word = " + word);

        System.out.println("____________________________________________________________");

        int x = 100;

        System.out.println("x =" + x);

        System.out.println(x + 200);  // 300

        x = x + 200;
        System.out.println("x = " + x);

        int s = 100;
        System.out.println("________________________________________________________");
        s += 200;

        System.out.println("s =" + s);


        String str = "Wooden";

        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 =" + num1);  //2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1);

        double balance = 1000.50;

        balance += 300;  // balance = $1000.50 to $1300.50

        System.out.println("balance = " + balance);

        System.out.println("_______________________________________________");

        //withdrawing 500 dollars from account

        balance -= 500;

        System.out.println("balance = " + balance);


        //withdrawing $200 dollars then depositing $400

        balance -= 200; // balance = 600.50
        balance += 400; // balance = 1000.50

        System.out.println("balance = " + balance);

        double salary = 50000.50;

        System.out.println("salary = " + salary);
        System.out.println("________________________________________________");
        salary *= 2;

        System.out.println("salary = " + salary);

        double doge = 0.00000001;

        System.out.println("doge = " + doge);

        doge *= 1000000;

        System.out.println("doge = " + doge);


        double num2 = 25000;
        System.out.println("__________________________________________________________");


        num2 /= 2;

        System.out.println("num2 = " + num2);

        double num3 = 100;

        // %=

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("________________________________________");

        int amount = 127;  //cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("_______________________________________________");

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("____________________________________");

        int j = 300;

        j = j %= 16;

        System.out.println("j = " + j); //the remainder of 300/16 = 12

        System.out.println("_____________________________________________-");

        int bank = 3500;
                                    //insurance fee
        bank %= 153;

        System.out.println("bank = " + bank);













    }

}
