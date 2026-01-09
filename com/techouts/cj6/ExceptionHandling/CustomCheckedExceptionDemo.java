package com.techouts.cj6.ExceptionHandling;

public class CustomCheckedExceptionDemo {

    static void main(String[] args) throws CompileTimeException {

        Demo d = new Demo(10);
        try {
            d.checkValue(30);
        } catch (CompileTimeException e) {
            System.out.println(e);
        }
    }

}

class CompileTimeException extends Exception {


    CompileTimeException() {
        super("you must handle the error before compiling !!");
    }

    CompileTimeException(String msg) {
        super(msg);
    }

}

class Demo {

    int value;
    Demo(int val) {
        this.value = val;
    }

    public void checkValue(int val) throws CompileTimeException{
        if(this.value < val) {
            throw new CompileTimeException();
        }

        System.out.println("Value is ok !!!");

    }

}

