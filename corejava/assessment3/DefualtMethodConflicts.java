package corejava.assessment3;

public class DefualtMethodConflicts {

    static void main(String[] args) {

       C cobj = new C();
       cobj.show();

    }

}

interface A {

    default void show() {
        System.out.println("This is default method in Interface A");
    }

}

interface B {
    default void show()
    {
        System.out.println("This is default method in Interface B");
    }
}

class C implements A,B{

    // A class Which implements two interfaces having same methods with same type signatures should be override the above method.

    @Override
    public void show() {
        System.out.println("This is Overridden Show() in Class C");
        A.super.show();
        B.super.show();
    }

}