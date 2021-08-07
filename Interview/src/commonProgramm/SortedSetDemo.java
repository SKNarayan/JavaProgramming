package commonProgramm;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String args[]){
        TreeSet ts = new TreeSet();

        //ts.add(1200);
        ts.add(100);
        ts.add(200);
        ts.add(300);
        ts.add(400);
        ts.add(500);
        ts.add(600);
        ts.add(700);
        ts.add(800);
        ts.add(900);
        ts.add(1000);

        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.headSet(400));
        System.out.println(ts.tailSet(600));

        System.out.println(ts.subSet(300, 800));
        System.out.println(ts.comparator());


    }

}
