package commonProgramm;

import java.util.Scanner;

public class primeNumber {


    public static void main(String agrs[]){
        int m = 0, flag = 0;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        m = num/2;
        if(num == 0 || num == 1){
            System.out.println(num + " is not a prime number");
        }else{
            for(int i = 2; i <= m; i++){
                if(num % i == 0){
                    System.out.println(num + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.println(num + " is prime number");
        }

    }




}
