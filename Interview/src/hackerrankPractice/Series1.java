package hackerrankPractice;
import java.util.Scanner;
import java.lang.*;

public class Series1 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double sj=a;

            for(int j=0; j<= n-1; j++){
             sj = sj+ (Math.pow(2,j) * b);
                System.out.print((int)sj+" ");
        }


    }
        in.close();
}


}
