package com.techouts.cj6.iopackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomAccessFileDemo {
    static void main(String[] args) {
        /*
            RandomAccessFile is a class in java that heps to read and write the data randomly in a file .
            It implements DataInputStream, DataOutputStream interfaces .. that helps to take data as
            normal primitive datatype elements.
         */
        try(RandomAccessFile raf = new RandomAccessFile("src/com/techouts/cj6/iopackage/raf.txt","rw"))
        {
            raf.writeUTF("Happy Sankranthi !!");
            System.out.println(raf.length());
            raf.seek(0);
            System.out.println(raf.readUTF());

            raf.seek(0);

            byte[] b = new byte[10];
            System.out.println(raf.read(b));
            System.out.println(Arrays.toString(b));

            raf.seek(raf.length());
            raf.writeBytes("Welcome to techouts family !");
            raf.seek(0);
            int ch;
            while ((ch = raf.read()) != -1) {
                System.out.print((char) ch);
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch(IOException io) {
            io.printStackTrace();
        }
    }
}
