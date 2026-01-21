package corejava.assessment2;

import java.util.*;

public class SortMapBasedOnValues {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(2,"Two");
        map.put(1,"One0");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(100,"Hundred");

        List<Map.Entry<Integer,String>> sortedMap = new ArrayList<>(map.entrySet());

        sortedMap.sort(Comparator.comparing(Map.Entry::getValue));



        System.out.println(sortedMap);

    }

}
