package corejava.assesment1;

public class LoopsDemo {

    public static void main(String args[]) {

        /*Loops are used to execute a block of statements multiple times!!
         There are 3 loops in java :
            1) for loop
            2) while loop
            3) do while loop
        */

        // for loop is used when the number of iterations are known.
        // Example - print the numbers from 1 to 10 .
        System.out.print("for loop :");
        for(int i = 1;i <= 10;i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("While Loop : ");
        // while loop is used when number of iterations are not known
        int i = 1;
        while(i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        // do while is exit controlled loop, it check condition after executing block of statements once.
        System.out.print("do while Loop : ");
        int num = 1;
        do {
           System.out.print(num + " ");
           num++;
        } while (num <= 10);

    }

}
