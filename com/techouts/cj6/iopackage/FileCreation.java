package com.techouts.cj6.iopackage;

import java.io.File;
import java.io.IOException;

public class FileCreation {


    public static void main(String[] args) {

        File file = new File("C:/Users/Manoj.M/IdeaProjects/CoreJava/src/com/techouts/cj6/iopackage","FirstFile.txt");

        try {
            file.createNewFile();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Is it a file ? " + file.isFile());

        System.out.println("Does this file exists ? " + file.exists());

        System.out.println("Is it a absolute path ? " + file.isAbsolute());

        System.out.println("Parent of this file : " + file.getParent());

        System.out.println("Name of the file  :  " + file.getName());

        System.out.println(file.setReadable(true));

        System.out.println("Is it readable  ? : " + file.canRead());
    }

}
