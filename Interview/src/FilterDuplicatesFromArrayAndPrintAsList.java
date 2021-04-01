import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class FilterDuplicatesFromArrayAndPrintAsList {

    public static void main(String[] args){
        System.out.println("Program Name: Write code to filter duplicate elements from an array and print as a list");

        ArrayList<String> alist = new ArrayList<String>();

        //form a list of a number 0-10
        for(int i=0; i <10; i++){
            alist.add(String.valueOf(i));
        }
        System.out.println(alist);

        //insert a new set of numbers from 0-5
        for(int i=0; i<5; i++){
            alist.add(String.valueOf(i));
        }
        System.out.println(alist);

        System.out.println("\nFiltered Duplicates : " + processList(alist));

    }

    public static Set<String> processList(List<String> listContainingDuplicates){
        final Set<String> resultSet = new HashSet<String>();
        final Set<String> tempSet = new HashSet<String>();

        for(String yourInt : listContainingDuplicates){
            if(!tempSet.add(yourInt)){
                resultSet.add(yourInt);
            }
        }
        return resultSet;
    }


}
