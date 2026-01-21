package corejava.assessment3;

import java.util.Arrays;
import java.util.List;

public class AllMatchDemo {

    static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,2,3,2,10);

        // It checks all the elements in list are lesser than 20 or not . It returns boolean value .
        System.out.println(list.stream().allMatch(n -> n < 20));

        // Checks whether all the elements in list are even numbers or not !
        System.out.println(list.stream().allMatch(n -> n % 2 == 0));


    }

}
