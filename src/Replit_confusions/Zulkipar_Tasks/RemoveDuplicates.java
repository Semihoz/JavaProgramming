package Replit_confusions.Zulkipar_Tasks;

public class RemoveDuplicates {

    //3️⃣ String - Remove Duplicates
    //Write a return method that can remove the duplicated values from String
    //Ex:  removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {

        String str = "AAABBBCCC";

        String result = "";

        for (int i = 0; i < str.length()-1; i++) {
            String ch = "" + str.charAt(i);

            if (!result.contains(ch))
                result+= ch;
        }
        System.out.println(result);










    }
}
