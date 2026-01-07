package com.techouts.cj6;

public class StringsDemo {

    public static void main(String[] args) {

        /*
        String is a object that stores the sequence of characters within double quotes.
        There are two ways to define String ...
            1) Using String Literal (Static memory) :
                It is a concept that is introduced for efficient memory management,,
                Syntax : String str = "Manoj";
                In the above example str is a variable that is stored in the stack and "Manoj" is
                created in the String Constant Pool (A place of memory in the heap), before creating
                it will check whether the string is present in the String Constant Pool or not .
                If it is found it just pass reference of the string instead of creating another string.
            2) Using new Keyword:
                We can also create strings by using new keyword,, that the variable is stored in stack and
                string is stored in the heap outside of string constant pool irrespective of it is already
                found or not !
                Example : String str = new String("Techouts");
         */

        String str = "manoj";
        String str1 = "manoj";

        // Here two hashcode of strings are same beacause they are pointing to a single reference !!
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

        String s = new String("manoj");

        System.out.println("str == s : " + (str == s)); // False


        // == operator check whether the two objects are in same location or not !!
        System.out.println("str == str1 : " + (str == str1));//true


        System.out.println("str.equals(s) = " + (str.equals(s))); // True
        // .equals() methods check just the contents of the objects !!
        System.out.println("str.equals(str1) : " + str.equals(str1)); //true

        /*
            String objects are immutable means we cant perform modifications to it ,,
            if we try to modify the string it will creates new another string in the heap.

         */

    }

}
