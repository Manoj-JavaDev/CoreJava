package corejava.assessment3;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamRisk {

    static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(268);
        list.add(32);
        list.add(4623);
        /*
            Parallel Streams -> A Stream operations are performed by the multiple threads to speed up the execution
            and utilise multicore processors..
            -> Before making use of Parallel Streams the classes must be made as synchronized otherwise it give corrupted results.

         */
        System.out.println("Parallel Processing Elements are : ");
        list.parallelStream().forEach(System.out :: println);

        /*
            Stream() ->These stream elements are processed by a single thread. It Gives the results sequentially!!
         */
        System.out.println("Sequential Processing Elements are : ");
        list.stream().forEach(System.out :: println);

    }

}
