package org.example.Lesson22_p1;

public class Test4 {

}

class Human2 {

    Human2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

//    Human2() {
//    }
//    Human2(String n) {
//        this(n, null);
//    }
//
//    Human2(String n, String s) {
//        this.name = n;
//        this.surname = s;
//    }

    String name;
    String surname;

}

class Student2 extends Human2 {
    int course;

    Student2(String name, String surname, int course) {
//        System.out.println("Hello");
        super(name, surname);
        this.course = course;
    }
//    Student2() {
//        this(5);
//        System.out.println("Hello");
//    }
//
//    Student2(int i) {
//        super("Petya");
//    }

    public static void main(String[] args) {
        Student2 s = new Student2("Petya", "Ivanov", 26);
        System.out.println(s.name);
    }
}