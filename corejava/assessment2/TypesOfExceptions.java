package corejava.assessment2;

import java.io.FileWriter;
import java.io.IOException;

public class TypesOfExceptions {

    public static void main(String[] args) {

        /*
            Exception : It is a runtime error that terminates the execution of program abruptly.
            There are two types of Exceptions :
                i) Checked Exception : The Exception which are checked by the compiler during compile time.
                                      --> Programmer must handle the exception during compile time.
                ii) Unchecked Exception : The Exception which are checked are not checked by the compiler during compile time.
                                       --> Programmer doesn't need to handle the exception in compile time.
         */

        int arr[] = {1,2,3};

        System.out.println(arr[4]); // It gives ArrayIndexOutOfBoundsException but compiler can still execute the code without noticing it.

        // This line gives error message that it may get IOException so you must handle it .
        // We can handle CheckedExceptions in two ways as one with writing throws keyword and writing error code in try block with catch .
        try{
            FileWriter fw = new FileWriter("src/corejava/assessment2/checkedException.txt",true);
            fw.write("Hi This is an Example of checked Exception.");
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
