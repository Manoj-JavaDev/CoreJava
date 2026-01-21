package corejava.assessment3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementUsingStream {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,4,2,4,2,379);

        System.out.println("Given List : " + list);

        System.out.println("List after removing Duplicates : " +
                list.stream().distinct().collect(Collectors.toList()));

    }

}
