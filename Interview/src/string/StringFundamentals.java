package string;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class StringFundamentals {

    public static void main(String[] args){

        System.out.println("----------------convert chars into a string----------------");
        char[] chars = {'s', 'h','a', 's','h','i'};
        String charToString = new String(chars);
        System.out.println("Conversion from chars to a String: " + charToString);

        System.out.println("----------------find the length of the string----------------");
        int length = charToString.length();
        System.out.println("Length of the given string: " + length);

        System.out.println("----------------Concatenation of string----------------");
        String firstName = "Shashi ";
        String middleName = "Kant ";
        String lastName = "Narayan ";
        System.out.println("Concatenated string: " +firstName + middleName + lastName);


        System.out.println("----------------Difference between print and format of the string----------------");
        //You have printf() and format() methods to print output with formatted numbers. The String class has an equivalent class method, format(), that returns a String object rather than a PrintStream object.
        //Using String's static format() method allows you to create a formatted string that you can reuse, as opposed to a one-time print statement.
        try {
            String fs;
            fs = String.format("The value of the float variable is " +
                    "%f, while the value of the integer " +
                    "variable is %d, and the string " +
                    "is %s");
            System.out.println(fs);
        }catch(MissingFormatArgumentException e){
            System.out.println("Exception ignored");
        }

        System.out.println("---------------charAt(int index) returns the character located at the String's specified index-----------------");
        //charAt(int index) returns the character located at the String's specified index. The string indexes start from zero.
        char resultChar = charToString.charAt(4);
        System.out.println("Char at specified index: " + resultChar);
        String statement = "String is immutable ";
        char charOfAString = statement.charAt(10);
        System.out.println("Char of a given string: " + charOfAString);

        System.out.println("----------------string lexicographically equal to another string----------------");
        //int compareTo(Object o) or int compareTo(String anotherString)
        //The value 0 if the argument is a string lexicographically equal to this string;
        // a value less than 0(-ve) if the argument is a string lexicographically greater than this string;
        // and a value greater than 0(+ve) if the argument is a string lexicographically less than this string.
        String str1 = "Shashi Kant Narayan";
        String str2 = new String("Shashi Kant Narayan");
        String str3 = new String("Shashi Zant Narayan");
        String str4 = new String("Shashi Bant Narayan");
        String str5 = new String("Shashi Kant Narayan");
        int compareResult1 = str1.compareTo(str2);
        System.out.println("The value 0 if the argument is a string lexicographically equal to this string: " + compareResult1);
        int compareResult2 = str1.compareTo(str3);
        System.out.println("The value <0 if the argument is a string lexicographically greater than this string: " + compareResult2);
        int compareResult3 = str1.compareTo(str4);
        System.out.println("The value >0 if the argument is a string lexicographically less than this string: " + compareResult3);

        System.out.println("----------------Print the input string in camel case and concatenate both of the string----------------");
        System.out.println("Enter first string followed by second string: ");
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        try {
            System.out.println("First String concat Second string: " + firstString.concat(" ").concat(secondString));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("You should write something else bigger");
        }

        System.out.println("-----------Print the title of string or capitalize each first char of the string------------");
        StringBuilder stringBuilder = new StringBuilder(firstString.length()+secondString.length());
        String firstStringChar[] = firstString.split("\\ ");
        String secondStringChar[] = secondString.split("\\ ");

        for(int i = 0; i < firstStringChar.length; i++){

            stringBuilder.append(Character.toUpperCase(firstStringChar[i].charAt(0))).append(firstStringChar[i].substring(1)).append(" ");
        }
        for(int j = 0; j < secondStringChar.length; j++){

            stringBuilder.append(Character.toUpperCase(secondStringChar[j].charAt(0))).append(secondStringChar[j].substring(1)).append(" ");
        }
        System.out.println(stringBuilder);

        System.out.println("----------------Print sub string----------------");
        String substring = null;
        for(int k = 0; k < firstString.length(); k++){
             substring = firstString.substring(2, 8);
        }
        System.out.println(substring);

        System.out.println("-----------------Declaration of string --------------------");
        //declaring string without new operator
        String s1 = "shashi is in Bangalore";
        System.out.println("declaring string without new operator: " + s1);
        //declaring string with new operator
        String s2 = new String("Karnatka");
        System.out.println("declaring string with new operator: " + s2);


    }

}
