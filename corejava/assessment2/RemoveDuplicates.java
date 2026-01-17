package corejava.assessment2;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));

    }

    public static ArrayList<Integer> removeDuplicates(int arr[]) {

        ArrayList<Integer> al = new ArrayList<>();
        if(arr.length <= 1) return al;
        for(int i = 0;i < arr.length;i++) {
            int count = 1;
            for(int j = i + 1;j < arr.length;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
                if(count > 1) break;
            }
            if(count == 1) {
                al.add(arr[i]);
            }
        }
        return al;
    }

}
