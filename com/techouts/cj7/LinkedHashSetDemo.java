package com.techouts.cj7;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(256);
        set.add(-1010);
        set.add(0);

        set.add(10);
        set.add(256);
        set.add(-1010);
        set.add(0);

        System.out.println(set);
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set.toString());

        System.out.println(set.size());

        System.out.println(set.remove(-1010));

        System.out.println(set);


    }

}
