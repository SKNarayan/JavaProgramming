package commonProgramm;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String args[]){
        HashSet hs = new HashSet();

        System.out.println(hs);
        hs.add("M");
        hs.add("a");
        hs.add("c");
        hs.add("D");
        hs.add("Z");
        hs.add(null);
        hs.add(10);
        System.out.println(hs);

        System.out.println(hs.add("Z"));

    }

}
