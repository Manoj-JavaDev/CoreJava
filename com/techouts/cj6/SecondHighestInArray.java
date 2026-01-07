package com.techouts.cj6;

import com.techouts.cj5.InterfaceDemo;

import java.util.Scanner;

public class SecondHighestInArray {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int highest = Integer.MIN_VALUE;

        int secondHighest = Integer.MIN_VALUE;

        for(int i = 0;i < n;i++) {
            if(arr[i] > highest) {
                if(secondHighest < highest) {
                    secondHighest = highest;
                }
                highest = arr[i];
            }
            else if(secondHighest != highest && secondHighest < arr[i]){
                secondHighest = arr[i];
            }
        }



        System.out.println("highest = " + highest);
        if(secondHighest == Integer.MIN_VALUE)
            System.out.println("There is no second Highest in the given array !!");
        else
        System.out.println("SecondHighest = " + secondHighest);

    }

}
