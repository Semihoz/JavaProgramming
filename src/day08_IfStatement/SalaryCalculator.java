package day08_IfStatement;

public class SalaryCalculator {

    public static void main(String[] args) {

        int HourlyRates = 50;
        int weeklyhours = 45;

        double statetaxrate =  6.5;
        double federaltaxrate = 26.2;

        int salaryBeforeTax = weeklyhours * HourlyRates * 52;
        double  federaltax = salaryBeforeTax * federaltaxrate / 100;
        double  totaltax = statetaxrate * federaltax;
        double stateTax = salaryBeforeTax * statetaxrate / 100;
        double salaryaftertax = salaryBeforeTax - totaltax;

        System.out.println("Gross pay is: $ " + salaryBeforeTax);
        System.out.println("State tax = $ " + stateTax);
        System.out.println("Federal tax = $ " + federaltaxrate);
        System.out.println("Total tax = $ " + totaltax);
        System.out.println("salaryaftertax = " + salaryaftertax);












    }




}
