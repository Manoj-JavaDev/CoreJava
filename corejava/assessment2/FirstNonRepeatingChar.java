package corejava.assessment2;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();

        System.out.println("First Non repeating Character in a given string : " + getFirstNonRepeatingChar(str));


    }

    public static char getFirstNonRepeatingChar(String str) {

        char ch = '\u0000';

        if(str == null) return ch;
        if(str.length() == 1)
            return str.charAt(0);

        int arr[] = new int[256];
        for(int i = 0;i < str.length();i++)
        {
            arr[str.charAt(i)]++;
        }

        for(int i = 0;i < str.length();i++)
        {
            if(arr[str.charAt(i)] == 1) return str.charAt(i);
        }

        return ch;
    }
}
