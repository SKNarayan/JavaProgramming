package hackerrankPractice;
import java.util.Scanner;

public class InsertElementsInArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int j = 0; j < n; j++){
            a[j] = scan.nextInt();
        }
        //System.out.println(a.length);
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
