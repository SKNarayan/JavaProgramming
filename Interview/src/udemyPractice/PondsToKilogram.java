package udemyPractice;

import java.util.Scanner;

public class PondsToKilogram {

    public static void main(String[] args) {

        int intValue = 10/3;
        float floatValue = 10/3;
        double doubleValue = 10/3;
        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("-----------------------");

        float fValue = 10f/3f;
        double dValue = 10d/3d;
        System.out.println("fValue = " + fValue); //up to 7 decimal value
        System.out.println("dValue = " + dValue); //up to 16 decimal value


        System.out.println("------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pond value :");
        double pondValue = sc.nextDouble();
        double kilogram = pondValue * 0.45359237d;

        System.out.println(pondValue + " Pond is equal to " + kilogram + " Kilogram "); //check the answer in google
    }


}
