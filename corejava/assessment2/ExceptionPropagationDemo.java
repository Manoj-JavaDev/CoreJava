package corejava.assessment2;

public class ExceptionPropagationDemo {

    static void main(String[] args) {

        ExceptionDemo ed = new ExceptionDemo();
        ed.getChar(10);
        /*
            When an exception occurred in a method and if it not is not handled by the method, then it searches in its calling method to check if it is handled or not .

            In this example when getChar() is called , then it gives control to its calling functions.
            It searches for the exception handled code in any of one method thent it sops normally !!

            Basically Exception is occurred in m1() but it is not handled .. This is exception Propagation
         */
    }

}


class ExceptionDemo {

    String str = "techouts";

    public void m1(int index) {
        System.out.println(str.charAt(index));
    }

    public void m2(int index) {
        try {
            m1(index);
        } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            System.out.println("Exception is handled in m2 method!!");
            stringIndexOutOfBoundsException.printStackTrace();
        }

    }

    public void m3(int index) {
        m2(index);
    }

    public void getChar(int index) {
        m3(index);
    }

}