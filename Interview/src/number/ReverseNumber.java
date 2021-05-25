package number;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args){
        System.out.println("Program Name: Write a java program to reverse a number in Java");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNumber = scanner.nextInt();

        reverseNumberUsingAlgorithm(inputNumber);
        System.out.println("---------------------");

        reverseNumberUsingStringBuffer(inputNumber);
        System.out.println("#########################");

        reverseNumberUsingStringBuilder(inputNumber);


    }

    public static void reverseNumberUsingAlgorithm(int number){

        int reverseNumber = 0;
        while(number != 0){

            reverseNumber = reverseNumber * 10 + number % 10;
            number = number / 10;

        }
        System.out.println("Reverse number is using Algorithm: " + reverseNumber);

    }

    public static void reverseNumberUsingStringBuffer(int number){


        //convert the number in string format using String.valueOf(num)
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        StringBuffer reverseNumber = stringBuffer.reverse();

        System.out.println("Reverse number using string buffer: " + reverseNumber);

    }

    public static void reverseNumberUsingStringBuilder(int number){
        //here we use reverse method of String Builder class
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);

        StringBuilder reverseNumber = stringBuilder.reverse();

        System.out.println("Reverse number using string builder: " + reverseNumber);


    }
}
