package corejava.assessment3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfList {

    static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,4,12,4,2,379,45,46);

        System.out.print("Average of above collection is  :  ");
        System.out.println(list.stream().collect(Collectors.averagingDouble(Integer :: intValue)));


    }

}
