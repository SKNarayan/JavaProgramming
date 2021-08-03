package array;

import java.util.Scanner;

public class SearchingAnElementFromArray{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //for searching element in array, ideally the element should not be duplicate
        int[] a = {3,9,7,8,12,6,15,5,4,10};
        System.out.println("Enter a key");
        int key = scanner.nextInt();

        for(int i = 0; i < a.length-1; i++){
            if(key == a[i]){
                System.out.println("The key element is at index " + i);
                System.exit(0);
            }
        }
        System.out.println("The key element in not found");

    }


}
