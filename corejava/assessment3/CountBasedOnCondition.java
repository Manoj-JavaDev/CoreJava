package corejava.assessment3;

import java.util.Arrays;
import java.util.List;

public class CountBasedOnCondition {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,4,12,4,2,379,45,46);

        System.out.println("Number of elements that are greater than 10 are : ");

        System.out.println(list.stream().distinct().filter(n -> n > 10).count());

        System.out.println("Number of even elements in a given list are : ");

        System.out.println(list.stream().distinct().filter(n -> n % 2 == 0).count());

    }

}
