package string;

import java.util.List;
import java.util.Arrays;

public class SortString {

    public static void main(String[] args){
        System.out.println("Programm Name :  Write code to sort the list of strings using Java collection");

        String[] inputString = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

        //Display un-sorted list
        System.out.println("------Un-sorted list------");
        showList(inputString);

        //Call to sort the input list
        Arrays.sort(inputString);
        //Display sorted list
        System.out.println("\n-------sorted list--------");
        showList(inputString);

        //Call to sort the input list in case sensetive-order
        System.out.println("\n--------sorted list in case sensetive-order--------");
        Arrays.sort(inputString, String.CASE_INSENSITIVE_ORDER);
        //Display the sorted list
        showList(inputString);



    }
        public static void showList(String[] array){
        for(String str : array){
            System.out.println(str);
        }
            System.out.println();
        }

}
