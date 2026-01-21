package corejava.assessment3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaximumAndMinimumOfList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,4,12,4,2,379,45,46);

        System.out.print("Maximum = " );

        System.out.println(list.stream().max(Comparator.naturalOrder()));

        System.out.println("Minimum = " + list.stream().min(Comparator.naturalOrder()));

    }

}
