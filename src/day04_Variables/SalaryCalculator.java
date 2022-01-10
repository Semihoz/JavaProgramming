package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourly rate   = HR
        // weekly hours   =WH

        int HR = 65;
        int WH = 45;
        int NW = 52;

        int salary = HR * WH * NW;

       // System.out.println(salary);
        System.out.println("salary = $" + salary);
        System.out.println("WH = " + WH);
        System.out.println("HR = $" + HR);

    }




}
