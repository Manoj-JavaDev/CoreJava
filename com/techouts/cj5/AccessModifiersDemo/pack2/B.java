package com.techouts.cj5.AccessModifiersDemo.pack2;
import com.techouts.cj5.AccessModifiersDemo.pack1.A;
public class B extends A{

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println("Public variable = " + a.publicVariable);
        // private variable can't be accessed
        //System.out.println("Private variable = " + a.privateVariable);
        // default variable can't be accessed in another Package !!
        //System.out.println("Default variable = " + b.defaultVariable);
        System.out.println("Protected variable = " + b.protectedVariable);

    }

}
