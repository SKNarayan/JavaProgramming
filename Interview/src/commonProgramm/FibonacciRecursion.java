package commonProgramm;

import java.util.Scanner;

public class FibonacciRecursion {

    static long n1 =0, n2 = 1, n3;
    static long num;
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print(n1 + " " + n2);
        FibonacciRecursion.fib(num);


    }


    public static void fib(long num){
       if(num >=1){
           n3 = n2 + n1;
           System.out.print(" " + n3);
           n1 = n2;
           n2 = n3;
           FibonacciRecursion.fib(num-1);
       }
    }

}
