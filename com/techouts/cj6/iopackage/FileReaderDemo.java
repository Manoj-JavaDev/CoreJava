package com.techouts.cj6.iopackage;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    static void main(String args[]) {


        try (FileReader reader = new FileReader("src/com/techouts/cj6/iopackage/outputDemo1.txt")){

            int ch ;
            while(-1 != (ch = reader.read())) {
                System.out.print((char)ch);
            }

        }

        catch (IOException io) {
            io.printStackTrace();
        }

    }

}
