package array;

public class FindSecondLargestElementInArray{

    public static void main(String[] args) {
        int[] a = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max, secondLargest;
        max = secondLargest = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                secondLargest = max;
                max = a[i];
            }else if(a[i] > secondLargest){
                secondLargest = a[i];
            }
        }
        System.out.println("Largest number is: " + max);
        System.out.println("Second largest number is: " + secondLargest);
    }


}
