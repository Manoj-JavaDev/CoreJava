package corejava.assessment3;

import corejava.assesment1.example.pack1.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingThroughJava8 {

    static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList(new Student(1,"Manoj"),new Student(4,"Rakesh")
        ,new Student(6,"Ganesh"),new Student(8,"Chandu")));
        System.out.println("Sorting Through Name : ");
        arrayList.stream().sorted(Comparator.comparing(Student :: getName)).forEach(System.out :: println);
        System.out.println();
        System.out.println("Sorting Through roll_no : ");
        arrayList.stream().sorted(Comparator.comparing(Student :: getRoll_no)).forEach(System.out :: println);

    }

}

class Student {

    int roll_no;
    String name ;

    public int getRoll_no() {
        return roll_no;
    }

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "roll_No = " + this.getRoll_no() + " name = " + this.getName();
    }
}