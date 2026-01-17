package corejava.assessment2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0;i < n;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of Second array : ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter array elements : ");
        for(int i = 0;i < m;i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(mergeTwoSortedArrays(arr1,arr2)));

    }

    public static int[] mergeTwoSortedArrays(int[] arr1,int[] arr2) {

        int result[] = new int[arr1.length + arr2.length] ;

        int left = 0;
        int right = 0;
        int index = 0;
        while (left < arr1.length && right < arr2.length) {

            if(arr1[left] <= arr2[right])
            {
                result[index++] = arr1[left];
                left++;
            }
            else
            {
                result[index++] = arr2[right];
                right++;
            }
        }

        while (left < arr1.length) {
            result[index++] = arr1[left++];
        }
        while (right < arr2.length) {
            result[index++] = arr2[right++];
        }

        return result;
    }

}
