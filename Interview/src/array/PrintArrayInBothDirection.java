package array;

public class PrintArrayInBothDirection {
    public static void main(String[] args) {
        int[] a = {3,9,7,8,12,6,15,5,4,10};
        System.out.print( "Array printed in foreword direction : ");
        for(int x : a){
            System.out.print(x + ", ");
        }
        System.out.println();

        System.out.print("Array printed in backward direction : ");
        for(int i = a.length-1; i >= 0; i--){
            System.out.print(a[i] + ", ");
        }
    }


}
