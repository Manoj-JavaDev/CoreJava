package corejava.assesment1;

// Save this file with name JVMDemo.java
public class JVMDemo {

    /* When we run a command javac JVMDemo.java file, then automatically java compiler converts
    this java code into byte code which is stored in .class file .
    -> After we write a command as java JVMDemo,, then JVM can converts this .class file byte code
      into a native machine language code and it gives an output in high level language to understand the user.
     */

    // JVM is outside the class and some another location,,, so main() is is declared as a public to be invoked by the JVM
    // "static" keyword is written to execute a main method without creating an object
    // void is written that main method doesn't returning anything
    // String[] args --> is a string array that is used to take command line inputs
    public static void main(String args[]) {
        // System is a static class in java.lang package.
        // out is static member fof printStream class and println() print output to the monitor
        System.out.println("Hello JVM !!!");
    }

}
