package commonProgramm;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String args[]){
        LinkedHashSet lhs = new LinkedHashSet();
        System.out.println(lhs.size());

        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("Z");
        lhs.add(null);
        lhs.add(10);
        System.out.println(lhs.add("Z"));


        System.out.println(lhs);

    }

}
