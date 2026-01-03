package com.techouts.cj4;

public class AssociationDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Rakesh","telugu");
        Student s1 = new Student("manoj",t1);

        System.out.println(s1.getStudentName());
        System.out.println(s1.getTeacherName());

    }
}

class Student {
    String sName;
    Teacher studentTeacher;

    Student(String sname,Teacher teacher){
        this.sName = sname;
        this.studentTeacher = teacher;
    }

    String getStudentName(){
        return this.sName;
    }

    String getTeacherName() {
        return studentTeacher.name;
    }
}


class Teacher {
    String name;
    String subject;

    Teacher(String name,String subject) {
        this.name = name;
        this.subject = subject;
    }
}
