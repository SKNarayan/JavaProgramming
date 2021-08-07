package hackerrankPractice;
import java.util.Scanner;

public class StringBasic {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        /* Enter your code here. Print output to STDOUT. */
        int a = A.length();
        int b = B.length();
        System.out.println(a+b);

        int wordASCIIValueOfA = 0;
        for(int i=0; i<A.length(); i++) {
            char chOfA = A.charAt(i);
            int charValueOfA = (int)chOfA;
            wordASCIIValueOfA = wordASCIIValueOfA + charValueOfA;

            char ch0 = A.charAt(0);
            char chCapital = Character.toUpperCase(ch0);
            char[] chRest = A.toCharArray();
            for(int j=1; j < A.length(); j++){
                char[] nch = A.toCharArray();
                for(char cc : nch);
              // String newStr = chCapital+cc;
            }
        }

        int wordASCIIValueOfB = 0;
        for(int i=0; i < B.length(); i++){
            char chOfB = B.charAt(i);
            int charValueOfB = (int)chOfB;
            wordASCIIValueOfB = wordASCIIValueOfB + charValueOfB;


        }

        if(wordASCIIValueOfA > wordASCIIValueOfB){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}
