package array;

public class SearchingAnElementFromArray{

    public static void main(String[] args) {
        int[] a = {3,9,7,8,12,6,15,5,4,10,6};
        int key = 6;
        boolean flag = false;
        int i = 0;
        for(int x : a){
            if(x == key){
                flag = true;
                i+=1;
            }
            flag = false;
        }
        if(i > 0){
            System.out.println("The searching element is present in the given array");
            System.out.println("The searching element is present " + i + " times in given array");
        }else {
            System.out.println("The searching element is not present in the given array");
        }

    }


}
