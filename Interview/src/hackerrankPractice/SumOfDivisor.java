package hackerrankPractice;

public class SumOfDivisor {

    public static void main(String[] args){
        int n = 8;
        int sum = 0;
        for(int i=1; i<=n; i++)
            if(n%i == 0)
              //  System.out.println("%d ", i);
                 sum = sum + i ;
                System.out.println(sum);
        }
    }


