package commonProgramm;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args){

         String reverseString = "";

        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();

        for(int i = originalString.length()-1; i>=0; i--){
            reverseString = reverseString + originalString.charAt(i);
        }

        if(originalString.equals(reverseString)){
            System.out.println("Entered string is Palindrome");
        }else {
            System.out.println("Entered string is not a palindrome ");
        }


    }

}
