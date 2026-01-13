package com.techouts.cj6.iopackage;

import java.io.*;

public class WriteDataUsingDataStream {

    static void main(String[] args) throws IOException {


        try(FileOutputStream fout = new FileOutputStream("src/com/techouts/cj6/iopackage/DataFile.dat");
        DataOutputStream din = new DataOutputStream(fout)){
            din.writeInt(100);
            din.writeUTF("Manoj");
            din.writeBoolean(false);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }

}
