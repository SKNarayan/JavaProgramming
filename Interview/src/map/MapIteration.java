package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

    public static void main(String[] args){
        Map<Integer, String> studentDetails = new HashMap<>();
        studentDetails.put(101, "Divit");
        studentDetails.put(108, "Lokesh");
        studentDetails.put(112, "Praveen");
        studentDetails.put(129, "Pankaj");
        studentDetails.put(137, "Raghav");
        studentDetails.put(140, "Dinesh");
        studentDetails.put(144, "Amish");

        System.out.println("Iterating hashmap using keySet() method");
        keySetIteration(studentDetails);
        System.out.println("----------------------------------");
        System.out.println("Iterating hashmap using Iterator() method");
        iteratorInMap(studentDetails);
        System.out.println("-----------------------------------");
        System.out.println("Iterating hashmap using EntrySet() method");
        entrySetMap(studentDetails);
        System.out.println("-------------------------------------");
        System.out.println("Iterating hashmap using Streams of java8");
        streams(studentDetails);
        System.out.println("---------------------------------------");




    }


    //Iterating hashmap using keySet() method
    private static void keySetIteration(Map<Integer, String> studentDetails) {

        for(Integer rollNumber : studentDetails.keySet()){
            System.out.println("RollNumber = " + rollNumber + " " + "StudentName = " + studentDetails.get(rollNumber));
        }

    }

    //Iterating hashmap using Iterator() method
    private static void iteratorInMap(Map<Integer, String> studentDetails) {

        Iterator<Map.Entry<Integer, String>> iterator = studentDetails.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("RollNumber = " + entry.getKey() + " " + "StudentName = " + entry.getValue());
        }

    }

    //Iterating hashmap using EntrySet() method
    private static void entrySetMap(Map<Integer, String> studentDetails) {

        for (Map.Entry<Integer, String> stringEntry :studentDetails.entrySet()) {
            System.out.println("key = " + stringEntry.getKey());
            System.out.println("value = " + stringEntry.getValue());
        }


    }

    //Iterating hashmap using streams of java8
    private static void streams(Map<Integer, String> studentDetails){


    }


}
