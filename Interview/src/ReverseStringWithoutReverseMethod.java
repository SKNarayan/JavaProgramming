import java.util.Scanner;

public class ReverseStringWithoutReverseMethod {
    public static void main(String[] args){
        System.out.println("Program Name: Write a Java Program to reverse a string without using String inbuilt function reverse().");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter your string, Please !! ");

        String inputString = scanner.nextLine();
        char chars[] = inputString.toCharArray();
        for(int i=chars.length; i>=0; i--){
            System.out.println(chars[i]);
        }

    }

}
