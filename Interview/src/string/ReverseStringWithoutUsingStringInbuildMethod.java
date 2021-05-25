package string;

import java.util.Scanner;

public class ReverseStringWithoutUsingStringInbuildMethod {

    public static void main(String[] args){
        System.out.println("Program Name: Write a Java Program to reverse a string without using String inbuilt function.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter your string below to reverse it, Please !!");
        String inputString = scanner.nextLine();

        //used string builder to reverse the string
        StringBuilder sb = new StringBuilder();
        sb.append(inputString);
        StringBuilder reversedString = sb.reverse();
        System.out.println("\nReversed string is: " + reversedString);

    }


}
