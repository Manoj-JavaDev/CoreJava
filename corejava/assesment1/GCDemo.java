package corejava.assesment1;



public class GCDemo {
    public static void main(String[] args) {

        Student1 s1 = new Student1("Rakesh");
        Student1 s2 = new Student1("Manoj");


        s1 = null;
        s2 = null; // Now these are ready to be removed because these are pointing to null

        System.out.println("Requesting garbage collection...");
        System.gc();


        System.out.println("End of program");

        System.out.println("Now s1 pointing to null");
    }
}


class Student1 {
    String name;

    Student1(String name) {
        this.name = name;
    }

}


