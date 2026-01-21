package com.techouts.cj8;

import corejava.assesment1.example.pack1.A;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Gatherer;

public class StudentSortUsingComparable {

    static void main(String[] args) {

        List<Student> studentList= Arrays.asList(new Student(1,"Manoj",43),new Student(2,"Sudharshan",21),new Student(50,"Karthik",34),
                        new Student(9,"Krishna",44),new Student(5,"Pavan",46));

        System.out.println("Sorting Student in ascending order based on their marks : ");
        Collections.sort(studentList);

        System.out.println(studentList);

    }

}

class Student implements Comparable<Student> {

    Integer rollNo;
    String name;
    Integer marks;

    Student (Integer rollNo,String name,Integer marks) {

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }

    @Override
    public String toString() {

        return "Student [ rollNo = " + this.rollNo +" , Name = " + this.name + " , Marks = " + this.marks + " ] \n";
    }

    @Override
    public int compareTo(Student other) {

        int val = Integer.compare(this.marks,other.marks);

        if(val == 0) {
            return this.name.compareTo(other.name);
        }

        return val;
    }
}