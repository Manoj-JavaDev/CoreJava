package corejava.assessment2;

public class StringImmutableDemo {
    public static void main(String[] args) {

    /*
        String : String is an object that contains sequence of unicode character where each character take
                 2 bytes of memory.
        String is a immutable object that we can't modify , it we try to modify the string again it creates
        new string in new memory location.
        Example :
     */
        String str = "Hi";
        System.out.println("Initial String : " + str);
        str = str.concat( " Manoj");
        String s1 = "Hi Manoj";
        System.out.println("str : " + str);
        System.out.println("s1 : " + s1);
        System.out.println("s1 == str : " + (s1 == str));

        // If the above strings are same then both points to the same memory reference,,
        // We can check the equality of references of string using == operator

    }
}
