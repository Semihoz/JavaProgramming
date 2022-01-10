package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browswerName = "Chrome";

        String result = "";

        boolean validBrowser = browswerName == "Chrome" || browswerName == "Firefox"
                || browswerName == "Safari" || browswerName == "Brave";

        if (validBrowser){
            if (browswerName == "Chrome"){
                result = "Chrome is the Brpwser";
            }else if (browswerName == "FireFox"){
                result = "Firefox is the browser";
            }else if (browswerName == "Safari"){
                result = "Safari";
            }else{
                result = "Brave";
            }

        }else{
            result = "Invalid Browser name";
        }
        System.out.println(result);

    }
}
