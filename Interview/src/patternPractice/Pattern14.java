package patternPractice;

public class Pattern14 {

    public static void main(String args[]){
        for(char c ='A'; c <='E'; c++){
            for(char ch='A'; ch<=c; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

}
