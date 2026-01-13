package com.techouts.cj6.iopackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) {

        try (FileOutputStream fout = new FileOutputStream("src/com/techouts/cj6/iopackage/outputDemo1.txt",true))
        {

            System.out.println("Enter a Text : ");
            byte[] arr = new byte[100];
            int bytesRead = System.in.read(arr);
            System.out.println(bytesRead);
            fout.write(arr,0,bytesRead);

            try (FileInputStream fin = new FileInputStream("src/com/techouts/cj6/iopackage/outputDemo1.txt")) {

                int ch ;
                while((ch = fin.read()) != -1){
                    System.out.print((char) ch);
                }
                System.out.println("File Reading Done !!");
            }

        }

        catch (IOException iio) {
            iio.printStackTrace();
        }



    }

}
