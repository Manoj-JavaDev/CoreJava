package corejava.assessment2;

import java.io.*;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        /*
        Try-with-resources is a feature of exception handling that introducing after java 6,
           -> It is used alternatively to skip the writing all closeable statements in finally block
           -> All the closing objects are created inside a try () parenthesis that automatically
              closes those objects in reverse order without explicitly writing finally block.
         */

        // Example Program

        try (FileInputStream fin = new FileInputStream("src/corejava/assessment2/checkedException.txt")){
            int ch;
            while((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }
        }
        catch (IOException io) {
            io.printStackTrace();
        }

    }

}
