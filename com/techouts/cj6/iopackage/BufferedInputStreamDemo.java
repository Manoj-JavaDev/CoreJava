package com.techouts.cj6.iopackage;

import java.io.*;

public class BufferedInputStreamDemo {

    static void main(String[] args) {

        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("src/com/techouts/cj6/iopackage/outputDemo1.txt"));
             BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("src/com/techouts/cj6/iopackage/outputDemo2.txt"))) {

            int ch ;
            while((ch = bin.read()) != -1) {
                bout.write((char) ch);
            }

        }

        catch (IOException io) {
            io.printStackTrace();
        }

    }

}
