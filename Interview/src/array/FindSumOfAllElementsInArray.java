package array;

public class FindSumOfAllElementsInArray {

    public static void main(String[] args) {
        int[] a = {3,9,7,8,12,6,15,5,4,10};
        int sum = 0;
        for(int x : a){
            sum += x;
        }
        System.out.println(sum);


    }



}
