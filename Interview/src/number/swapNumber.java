package number;

import java.util.Scanner;

public class swapNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number to swap");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number to swap");
        int secondNumber = scanner.nextInt();
        System.out.println("Numbers before swapping: \nFirst number is: " + firstNumber + " and \n" + "Second number is: " + secondNumber +"\n");

        swapNumbersUsingThirdVariable(firstNumber, secondNumber);

        swapNumbersWithoutUsingThirdVariable(firstNumber, secondNumber);

    }

    public static void swapNumbersUsingThirdVariable(int firstNumber, int secondNumber){
        System.out.println("Write a Java Program to swap two numbers using the third variable.");

        int temp;
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("Numbers after swapping: \nFirst number is: " + firstNumber + " and \n" + "Second number is: " + secondNumber);
        System.out.println();

    }

    public static void swapNumbersWithoutUsingThirdVariable(int firstNumber, int secondNumber){
        System.out.println("Write a Java Program to swap two numbers without using the third variable.");

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("Numbers after swapping: \nFirst number is: " + firstNumber + " and \n" + "Second number is: " + secondNumber);
        System.out.println();



    }

}
