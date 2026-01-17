package corejava.assessment2;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter String1 : ");
            s1 = sc.next();
            System.out.println("Enter String2 : ");
            s2 = sc.next();
        }

        System.out.println((checkAnagrams(s1,s2)) ? "Yes, Both are anagrams" : "No, Not anagrams");


    }

    public static boolean checkAnagrams(String str1, String str2) {

        if(str1.length() != str2.length()) return false;

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

}
