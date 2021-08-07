package hackerrankPractice;

import java.util.Scanner;

public class PrintInTwoColoumns{
    private static void printEachRowInTwoColoumns(String text, int number) {

        System.out.printf("%-15s%03d%n", text, number);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            printEachRowInTwoColoumns(s1, x);
        }
        System.out.println("================================");

    }
}


