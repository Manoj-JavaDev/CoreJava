package com.techouts.cj7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(getFirstNonRepeatingChar(str));


    }

    public static Character getFirstNonRepeatingChar(String s) {

        if(s == null) {
            return '\u0000';
        }

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i = 0;i < s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\u0000';

    }

}
