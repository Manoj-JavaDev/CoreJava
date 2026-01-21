package com.techouts.cj8;
import com.techouts.cj8.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    static void main(String[] args) {


        List<Student> studentList = Arrays.asList(new Student(1, "Manoj", 43), new Student(2, "Sudharshan", 21), new Student(50, "Karthik", 34),
                new Student(9, "Krishna", 44),new Student(9, "Anand", 44), new Student(5, "Pavan", 46));

        System.out.println("Sorting Student in ascending order based on their marks : ");
        Collections.sort(studentList, new StudentComparator());

        System.out.println(studentList);



    }

}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        int compareByMarks = o1.marks.compareTo(o2.marks);
        int compareByName = o1.name.compareTo(o2.name);

        return (compareByMarks == 0) ? compareByName : compareByMarks;

    }
}


