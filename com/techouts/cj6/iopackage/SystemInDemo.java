package com.techouts.cj6.iopackage;

import java.io.IOException;
import java.util.Scanner;

public class SystemInDemo {

    static void main(String[] args) throws IOException {

        /*
            Stream -> It is a path or a pipeline that helps to read or write the
            data to various input and output devices !!

                System.in : It is a InputStream class ,, so this also gets all the
                methods of it .
                i) int read() --> Reads one byte of data.
                ii) int read(byte[] b) --> reads bytes into an array
                ii) void close() --> closes the stream.
        */
        System.out.println("Enter Input Value or character!!");
        int a = 0;
        try {
            a = System.in.read();

        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        System.out.println(System.in.available());
        System.out.println("The ASCII value of a is  : " + a);
        System.out.println("The value you have entered is : " + (char)a);

        // It gives how many characters are available in the input line!!
        System.out.println(System.in.available());



    }
}
