package patternPractice;

public class Pattern18 {

    public static void main(String args[]){

        for(char c = 'A'; c <= 'E'; c++){
            for(char ch = 'E'; ch >= c; ch--){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

}
