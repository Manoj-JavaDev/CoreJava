package com.techouts.cj6;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

    static void main(String[] args) {
        /*
            Arrays are the important linear data structure that stores the elements in a
            contiguous memory locations...of similar data type elements.
            There three types of

            Arrays are created by the following ways :
                datype[] arr_name = new datype[int size];

                Examples :
                    int[] arr = new int[];
                    int arr[] = new int[2];
                    int arr[] = {1,2,3};
                    int[] arr = new int[] {11,2,1,2};
                    int arr[] = new int[] {2,3,2};
            These are used when we need to access the elements in the O(1) time
            Once the size of array is declared ,, we cant increase or the size of an array.

        */

        int arr[] = new int[4];
        int[] arr1 = new int[4];
        int[] arr2 = new int[] {10,20,30};
        int arr3[] = new int[] {2,2,2,2};
        int[][] arr4 = new int[4][];
        int[] arr5[] = new int[3][3];
        int arr6[][] = {{},{}};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
        int count = 1;

        char[][] ch = new char[3][];

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i < ch.length;i++) {
            ch[i] = (sc.next().toCharArray());
        }

        for(int i = 0;i < ch.length;i++)
        {
            for(int j = 0;j < ch[i].length;j++) {

                System.out.print(ch[i][j] + " ");

            }
            System.out.println();
        }





    }

}
