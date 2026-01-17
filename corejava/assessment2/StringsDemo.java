package corejava.assessment2;

public class StringsDemo {
    public static void main(String[] args) {

        /*
            String : String is immutable object that we can't modify the characters in it.
            StringBuilder : It is class that acts as a mutable string .
                    -We can add all the types of data in stringBuilder object,All the methods
                     of string are accessed by stringBuilder.
                     Example Methods : toString(),reverse(),setCharAt(),charAt(),length()..etc.
            StringBuffer : It is similar to StringBuilder that it can acts as mutable string .
                The main difference b/t the StringBuilder and StringBuffer is ,
                    -StringBuilder is used in single threaded environments as it is not synchronized
                    -StringBUffer is used in multi threaded environments asit is synchronized.
         */

        String str1 = "Apple";
        System.out.println("str1.length() : " + str1.length());
        System.out.println("str1.charAt(2) : " + str1.charAt(2));
        str1 = str1.concat(" Cat");
        StringBuilder str2 = new StringBuilder(str1);

        str2.append(" Ball");
        System.out.println("StringBuilder str2 : " + str2.toString());

        StringBuffer sb = new StringBuffer(str2);
        sb.append(' ');
        sb.append(120);

        System.out.println("StringBuffer : " + sb.toString());
        System.out.println("sb.indexOf(' ') : " + sb.indexOf(" "));

        System.out.println("Str1 : " + str1);

    }
}
