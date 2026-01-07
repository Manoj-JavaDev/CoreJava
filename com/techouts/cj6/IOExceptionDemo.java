package com.techouts.cj6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOExceptionDemo {

    static void main(String[] args) {

        // FileInputStream file = new FileInputStream("manoj.txt");

        try {
            FileInputStream file = new FileInputStream("manoj.txt");
        }
        catch(FileNotFoundException e) {

            // System.out.println(e.getMessage());

            System.out.println("File not exists " + e);

        }



    }

}
