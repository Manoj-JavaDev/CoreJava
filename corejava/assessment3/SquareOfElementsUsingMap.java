package corejava.assessment3;

import javax.swing.plaf.SliderUI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfElementsUsingMap {

    static void main(String[] args) {


        List<Integer> list = Arrays.asList(3, 4, 12, 2, 379, 45, 46);

        List<Integer> squaredList =
                list.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println("OriginalList ;: " + list);
        System.out.println("SquaredList : " + squaredList);

    }


}
