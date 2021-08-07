package hackerrankPractice;

import java.util.Scanner;

public class AreaOfParallelogram {

//Write your code here
    public static boolean flag;
    public static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
   static {
       if ((B >= 0 & B <= 100) & (H >= 0 & H <= 100)) {
           flag = true;
       }
       else{
           System.out.println("java.lang.Exception: Breadth and height must be positive");
       }
   }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }


    }//end of main

}
