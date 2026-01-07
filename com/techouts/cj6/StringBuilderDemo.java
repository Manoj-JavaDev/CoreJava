package com.techouts.cj6;

public class StringBuilderDemo {

    static void main(String[] args) {

        /*
            StringBuilder is same as StringBuffer but it methods are not synchronized,,
            StringBuilder perform all the operations fast compared to stringBuffer
            All the methods of stringBuffer are also applicable in StringBuilder class also
            It is used in single threaded applications .

            It extends AbstractStringBuilder class, CharSequence, Serializable Interface.
        */

        StringBuilder sb = new StringBuilder("Hiiii");
        StringBuffer  buffer = new StringBuffer(sb);
        StringBuilder sb1= new StringBuilder(buffer);

        System.out.println(sb);
        System.out.println(buffer);
        System.out.println(sb1);

        System.out.println(sb.reverse());

        String s = "Manoj";
        String s1 = "Manoj";
        System.out.println("s == s1 " + s == s1); // False

    }

}


