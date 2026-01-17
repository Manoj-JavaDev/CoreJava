package corejava.assessment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        /*
            ArrayList : It is class which implements List Interface,, it stores the elements in contiguous memory locations
                -> It is implemented by resizable array,, so if we do insertion and deletion operations
                    it takes O(n) time.
                -> It is efficient for fast retrieval
            LinkedList : It is a class which implements both List Interface and Deque Interface,,
                -> It is a collection of nodes where each node contains pointer to its previous and next nodes,
                    internally it uses doubly linkedlist.
                 -> It stores elements in non -continous memory locations.
         */

        ArrayList<Integer> al = new ArrayList<>();

        al.add(100);
        al.add(300);
        al.add(3000);
        al.remove(1); // After rremoving the element again it shifts all elements to its left

        System.out.println(al);

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(280);
        ll.add(28);
        ll.add(2);
        ll.addFirst(20);// we can add elements wherever we want within less time complexity!
        ll.addFirst(80);

        ll.remove(); // it removes the elements faster

        System.out.println(ll);


    }

}
