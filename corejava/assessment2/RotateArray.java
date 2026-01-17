package corejava.assessment2;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter number of positions : ");
        int k = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(rotateArray(arr,k)));

    }

    public static int[] rotateArray(int[] arr,int k) {

        if(arr.length <= 1) return arr;

        int newK = k % arr.length;
        System.out.println("newK = " + newK);

        reverse(arr,0,newK - 1);
        reverse(arr,k,arr.length - 1);

        reverse(arr,0,arr.length - 1);

        return arr;

    }

    public static void reverse(int arr[],int low,int high) {

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }

}
