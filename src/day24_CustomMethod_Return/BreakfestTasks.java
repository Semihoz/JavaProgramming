package day24_CustomMethod_Return;

public class BreakfestTasks {

    public static void main(String[] args) {
        initials("Semih", "Ozdemir");
        domain("Semihozdemir@gmail.com");
        System.out.println("==================================================");
        String[] emails = {"Josh@gmail.com", "Jim@Yahoo.com", "Elminur@gmail.com", "Gulsen@Gmail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("=================");
        nameOfMonths(3);

        nameOfDay(5);
    }
//1. Create a method that can display the initials of the person

    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    public static void domain(String Email) { // Semihozdemir02@gmail.com
        String domain = Email.substring(Email.indexOf('@') + 1, Email.lastIndexOf("."));
        System.out.println("Emails domain = " + domain);
    }

    public static void nameOfMonths(int number) {
        String name = "";

        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "June" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }
        System.out.println("months name = " + name);
    }

    public static void nameOfDay(int number) {
        String name1 = "";

        if (number >= 1 && number <= 7) {
            name1 = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday"
                    : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            name1 = "Invalid";

        }
        System.out.println("Name of the day = " + name1);

    }
}