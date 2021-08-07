package patternPractice;

public class Pattern22 {

    public static void main(String args[]){
        for(char c = 'E'; c >= 'A'; c--){
            for(char ch = 'A'; ch <= c; ch++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

}
