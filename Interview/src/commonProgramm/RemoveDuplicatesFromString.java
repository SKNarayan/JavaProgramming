package commonProgramm;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    public static void main(String[] args){
        System.out.println("Program Name: Remove duplicates from give String ");
        String givenString = "java";
       // System.out.println(removeDuplicatesFromGivenString(givenString));
        String rds = RemoveDuplicatesFromString.removeDuplicatesFromGivenString(givenString);
        System.out.println(rds);

    }

    public static String removeDuplicatesFromGivenString(String givenString){
        Set<Character> set = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0; i<givenString.length(); i++){
            Character c = givenString.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                stringBuffer.append(c);
            }

        }
        return stringBuffer.toString();
    }

}
