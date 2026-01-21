package corejava.assessment2;

import java.util.*;

public class FailFastFailSafeIterators {

    public static void main(String[] args) {

        /*
            Fail - Fast Iterators --> These are the iterators that throws  ConcurrentModificationException if we try to
            modify the elements after passing iterator to the collection.
                Example: Iterator

            Fail - Safe Iterator --> These are the iterators that doesnt throws ConcurrentModificationException
                after performing modifications.
                ListIterator , Iterator
         */

        Vector<Integer> v = new Vector<>();

        v.add(100);
        v.add(200);
        v.add(300);
        v.add(478);


        Iterator<Integer> it = v.iterator();

        v.add(100);
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        ListIterator<Integer> listIterator = v.listIterator();

        v.add(1000); // Doesn't give any error!!!
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }

}
