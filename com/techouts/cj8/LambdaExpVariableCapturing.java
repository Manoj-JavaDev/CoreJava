package com.techouts.cj8;

import java.awt.event.WindowStateListener;

public class LambdaExpVariableCapturing {

    public int instancevariable = 10;
    public static int staticVariable = 12;


    static void main(String[] args) {
        LambdaExpVariableCapturing lam = new LambdaExpVariableCapturing();

        lam.instancevariable++;
        int localVariable = 10;
        //number++; // Throws Compile - time Error because local variables which are used by

        Runnable runnable = () -> {
            System.out.println("Capturing number variable = " + localVariable);
            System.out.println("Capturing number variable = " + lam.instancevariable);
            System.out.println("Capturing number variable = " + ++staticVariable);
        };

        runnable.run();

    }

}
