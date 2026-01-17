package corejava.assessment2;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Enter a String :  ");
        String str="";
        try (Scanner sc = new Scanner(System.in)){
            str = sc.nextLine();
        }

        System.out.println("Reverse Of a String : " + getReverseString(str));

    }

    public static String getReverseString(String str) {

        if(str.length() == 0) return "";
        else if(str.length() == 1) return str;

        int low = 0;
        int high = str.length() - 1;

        char[] arr = str.toCharArray();

        while (low < high) {
            char ch = arr[low];
            arr[low] = arr[high];
            arr[high] = ch;
            low++;
            high--;
        }
        String s = new String(arr);
        return s;
    }

}
