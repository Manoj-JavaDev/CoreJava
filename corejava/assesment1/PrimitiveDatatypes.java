package corejava.assesment1;

public class PrimitiveDatatypes {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char ch;
    boolean bool;
    public static void main(String args[]) {

        /*
            Totally there are 8 primitive datatypes in java which are used directly without creating any objects
            Datatype            bytes               defaultValue
            byte                  1                     0
            short                 2                     0
            int                   4                     0
            long                  8                     0
            float                 4                     0.0f
            double                8                     0.0d
            char                  2                     '/u000'
            boolean               1                     false
         */

        // default values are assigned only for instance variables and static variables not fot local variables.
        // If we try to use local variable without initialization , it givens an compile error
        PrimitiveDatatypes object = new PrimitiveDatatypes();

        System.out.println("Byte Default value = " + object.b);
        System.out.println("Short Default value = " + object.s);
        System.out.println("Int Default value = " + object.i);
        System.out.println("Long Default value = " + object.l);
        System.out.println("Float Default value = " + object.f);
        System.out.println("Double Default value = " + object.d);
        System.out.println("Character Default value = " + object.ch); //'/u0000'
        System.out.println("Boolean Default value = " + object.bool);


    }

}
