package com.techouts.cj6.iopackage;

import java.io.*;

public class FileInputStreamDemo {


    static void main(String[] args) throws IOException {


        try (FileInputStream fin = new FileInputStream("src/com/techouts/cj6/iopackage/FirstFile.txt")){

            System.out.println("File Opened successfully!!!");

            int value;
            while ((value = fin.read()) != -1)
            {
                System.out.print((char) value);
            }
            System.out.println();
            System.out.println(fin.available());
        }
        catch (IOException e) {
            System.out.println("File Cant Open !!");
            e.printStackTrace();
        }

    }

}
