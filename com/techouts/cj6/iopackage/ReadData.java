package com.techouts.cj6.iopackage;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
    static void main(String[] args) throws IOException {

        try (FileInputStream fin = new FileInputStream("src/com/techouts/cj6/iopackage/DataFile.dat");
             DataInputStream din = new DataInputStream(fin)){
            int i = din.readInt();
            String str = din.readUTF();
            boolean b = din.readBoolean();

            System.out.println(i);
            System.out.println(str);
            System.out.println(b);
        }

        catch (IOException io) {
            io.printStackTrace();
        }

    }
}
