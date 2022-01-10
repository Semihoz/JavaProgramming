package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
       /*
        String name = "semih";
        String buildingNumber ="1123B";
*/
String name ="Semih Ozdemir",
        buildingNumber = "N/A",
        streetName = "29 EastClover Circle",
        city = "Hamden",
        state = "CT",
        zipCode = "06514";
/*
        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city
                + ", " + state + " " + zipCode );
  */
        String shippingaddress = name + "\n" + buildingNumber + " " + streetName + "\n" + city
                + ", " + state + " " + zipCode;


        System.out.println("shippingaddress = " + shippingaddress);
    }









}
