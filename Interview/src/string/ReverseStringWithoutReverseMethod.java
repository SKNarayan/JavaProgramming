package string;

import java.util.Scanner;

public class ReverseStringWithoutReverseMethod {
    public static void main(String[] args){

        System.out.println("Program Name: Write a Java Program to reverse a string without using String inbuilt function reverse().");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter your string, Please !! ");
        String inputString = scanner.nextLine();
        System.out.println("\n Below is the Reversed String: " );

        reverseStringUsingForLoop(inputString);
        System.out.println();

        reverseStringUsingWhileLoop(inputString);
        System.out.println();

        String reversedString = reverseStringUsingStaticMethodCall(inputString);
        System.out.println(reversedString);

    }

    public static void reverseStringUsingForLoop(String inputString){

        System.out.println("Reversed string using for loop\n");
        char chars[] = inputString.toCharArray(); //converted to char array
        for(int i=chars.length-1; i>=0; i--){
            System.out.print(chars[i]);
        }

    }

    public static void reverseStringUsingWhileLoop(String inputString){
        System.out.println("Reversed string using while loop\n");
        int i = inputString.length();
        while(i>0){
            System.out.print(inputString.charAt(i-1));
            i--;
        }


    }

    public static String reverseStringUsingStaticMethodCall(String inputString){
        System.out.println("Reversed string by calling static method \n");
        String reversedString = "";

        for(int i=inputString.length(); i>0; i--){
            reversedString = reversedString + (inputString.charAt(i-1));
        }

        return reversedString;

    }

}
