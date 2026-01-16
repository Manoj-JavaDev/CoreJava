package com.techouts.cj6.iopackage;

import java.io.*;

public class FileWriterDemo {

    public static void main(String[] args) {

        try (FileWriter fw =
                     new FileWriter("src/com/techouts/cj6/iopackage/filewriter.txt",true);
             BufferedReader br =
                     new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter Text (type Exit or Stop to stop):");

            String str;
            while ((str = br.readLine()) != null &&
                    !str.equalsIgnoreCase("exit") &&
                    !str.equalsIgnoreCase("stop")) {

                fw.write(str);
                fw.write(System.lineSeparator());
            }

            System.out.println("Data written successfully.");

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
