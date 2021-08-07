package commonProgramm;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String args[]){
        ArrayList l = new ArrayList();
        l.add("A");
        l.add(101);
        l.add("A");
        l.add(null);

        System.out.println(l);
        System.out.println(l.indexOf(101));

        l.remove(2);

        System.out.println(l);

        l.add(2, "M");
        l.add("N");

        System.out.println(l);

    }

}
