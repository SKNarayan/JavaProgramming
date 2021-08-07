package patternPractice;

public class Pattern19 {

    public static void main(String args[]){
            for(char ch = 'E'; ch >= 'A'; ch--){
                for(char c = 'A'; c <= ch; c++ ){
                System.out.print(c+" ");
            }

            System.out.println();
        }
    }

}
