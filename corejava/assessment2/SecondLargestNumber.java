package corejava.assessment2;

import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }
        getSecondLargest(arr);


    }

    public static void getSecondLargest(int[] arr) {

        if(arr.length == 0)
        {
            System.out.println("There is no Second Largest in the given array!!!");
            return;
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i = 0;i < arr.length;i++) {
            if(arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            }
            if(secondHighest < arr[i] && arr[i] != highest)
            {
                secondHighest = arr[i];
            }
        }

        if(secondHighest != Integer.MIN_VALUE) {
            System.out.println("The second largest Number in the given array is : " + secondHighest);
        }
        else {
            System.out.println("There is no Second Largest in the given array!!!");
        }


    }

}
