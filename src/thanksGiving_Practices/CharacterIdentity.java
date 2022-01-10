package thanksGiving_Practices;


        public class CharacterIdentity {
            public static void main(String[] args) {

                char x ='{';


                if(x>=48&& x<=57){System.out.println("Number");
                }else if((x>=65 && x<=90)||(x>=97 && x<=122)){System.out.println("Alphabetic");
                }else if((x>=33 && x<=47)||(x>=91 && x<=96)) {System.out.println("Special character");
                }else{System.out.println("Special character");
                }}}






        /*4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
         */


