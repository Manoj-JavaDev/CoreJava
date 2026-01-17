package corejava.assessment2;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getMissingNumber(arr));


    }
    public static int getMissingNumber(int arr[]) {

        int i = 0;
        for(i = 0;i < arr.length ;i++)
        {
            if(i + 1 != arr[i])
            {
                return (i + 1);
            }
        }
        return i + 1;
    }

}
