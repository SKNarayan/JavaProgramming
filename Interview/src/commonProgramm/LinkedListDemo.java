package commonProgramm;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.add("shashi");
        ll.add("kant");
        ll.add(null);
        ll.add("narayan");
        ll.add("shashi");

        System.out.println(ll);

        ll.set(0, "LinkedListProgram");
        ll.add(0, "narayan");

        ll.removeLast();
        ll.addFirst("Kant");

        System.out.println(ll);
        System.out.println(ll.getLast());

    }

}
