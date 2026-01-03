package corejava.assesment1.example.pack2;

import corejava.assesment1.example.pack1.A;

public class B extends A {
    public static void main(String[] args) {
        A obj = new A();

        // System.out.println(obj.privateVar);   // Not accessible
        // System.out.println(obj.defaultVar);   // Not accessible

        // Access through inheritance
        B b = new B();
        System.out.println("Protected: " + b.protectedVar);

        // Public is accessible everywhere
        System.out.println("Public: " + obj.publicVar);
    }
}

