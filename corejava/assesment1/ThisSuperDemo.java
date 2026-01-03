package corejava.assesment1;

public class ThisSuperDemo {
    public static void main(String[] args) {
        Student s = new Student("Manoj", 16, 101);
        s.display();
    }
}

/*
this keyword in java used to call the current class constructor , variables, methods.
'super' keyword in java is used to call super class constructor, variables and methods without using parent class object.

 */



class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    int rollNumber;


    Student(String name, int age, int rollNumber) {
        super(name, age);          // super calls parent constructor
        this.rollNumber = rollNumber; // this refers to Student's variable
    }

    void display() {
        super.display();
        System.out.println("Roll Number: " + rollNumber);
    }
}





