package com.techouts.cj6.iopackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamDemo {

    public static void main(String[] args) throws IOException {

        byte[] arr = {65,66,67,122};
        InputStream in = new ByteArrayInputStream(arr);

        System.out.println("Mark Supported ? : " + in.markSupported());
        System.out.println();

        System.out.println(in.available());

        int k = 0;
        while((k = in.read()) != -1) {
            char ch = (char) k;
            System.out.println("ASCII value = " + k + " & Character = " + ch);
        }



        byte[] b = {3,4,2,4};
        InputStream ip = new ByteArrayInputStream(b);
        byte[] a = {10,12,11,12,14};
        System.out.println(ip.read(a,1,2));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        in.close();


    }

}
