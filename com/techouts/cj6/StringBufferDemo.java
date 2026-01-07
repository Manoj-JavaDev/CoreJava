package com.techouts.cj6;

public class StringBufferDemo {

    static void main(String[] args) {

        /*
            StringBuffer is a class that implements CharSequence, Appendable, Serializable interfaces.
            It is used to represent sequence of characters that can easily modifiable within a place
            instead of creating new objects.
            It is mutable in nature ...
            We can delete , add , insert a new chars,strings and numeric values also.
            All the methods of StringBuffer are synchronized ,, these are used in environmet

         */

        // It creates a StringBuffer object with 16 characters of space.
        StringBuffer sb = new StringBuffer();

        // It creates a StringBuffer object with value provided in it's constructor
        StringBuffer sb1 = new StringBuffer(20);// 20 characters capacity

        // This constructor creates a string with extra 16 characters.
        StringBuffer sb2 = new StringBuffer("Java Program");


        System.out.println("Capacity of sb = " + sb.capacity());//16
        System.out.println("Capacity of sb1 = " + sb1.capacity());//20
        System.out.println("Capacity of sb2 = " + sb2.capacity());//28

        // append() is used to add char, int, double and othar datatype values into stringBuffer
        sb.append(7);
        sb.append("-");
        sb.append(1);
        sb.append("-");
        sb.append(2026);
        sb.append(" Wednesday");
        sb.append(" Techouts");

        System.out.println(sb);

        //insert is used to insert a string at specific index

        sb1.insert(0,"Hi");
        System.out.println(sb1.insert(2,' '));
        System.out.println(sb1.replace(2,2,"Super !!"));

        sb2.append("Welcome to Java!!");
        sb2.delete(9,10);

        System.out.println(sb2);

        System.out.println(sb2.indexOf("o"));
        System.out.println(sb2.getClass());
    }

}
