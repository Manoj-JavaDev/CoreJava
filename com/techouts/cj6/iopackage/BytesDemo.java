package com.techouts.cj6.iopackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class BytesDemo {

    static void main(String[] args) throws IOException {
        byte[] arr1 = {71,72,73,74,75,76};
        ByteArrayInputStream by2 = new ByteArrayInputStream(arr1);
        byte[] arr2={81,82,83,84,85,86};
        arr1[5]=80;
        arr2[5]=90;
        System.out.println(by2.read(arr2));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        byte[] m = "9".getBytes();
        System.out.println(Arrays.toString(m));

    }
}

