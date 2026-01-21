package corejava.assessment3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToMap {

    static void main(String[] args) {

        List<Integer> list = Arrays.asList(223,23,23,24,32,45,6);


        // The Operation converts the list elements into Map <Integer,Integer> with same key and same value.
        System.out.println(list.stream().distinct().collect(Collectors.toMap(Integer::intValue,Integer::intValue)));

    }

}
