package org.example.Lesson30;

import java.util.ArrayList;
import java.util.function.*;

public class Test6 {

}


class Student6 {

  String name;
  char sex;
  int age;
  int course;
  double avgGrade;

  Student6(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;

  }
}

class StudentInfo6 {

  void printStudent(Student6 st) {
    System.out.println(
        "Students name: " + st.name + " pol: " + st.sex + " age: " + st.age + " course: "
            + st.course + " avgGrade: " + st.avgGrade);
  }

  void testStudents6(ArrayList<Student6> aL, Predicate<Student6> predicate) {
    for (Student6 st : aL) {
      if (predicate.test(st)) {
        printStudent(st);
      }
    }

  }

  public static void main(String[] args) {
    ArrayList<Student6> list = new ArrayList<>();
    Student6 st1 = new Student6("Ivan", 'm', 22, 3, 8.3);
    Student6 st2 = new Student6("Nikolay", 'm', 20, 2, 6.4);
    Student6 st3 = new Student6("Elena", 'f', 19, 1, 8.9);
    Student6 st4 = new Student6("Petr", 'm', 35, 4, 7);
    Student6 st5 = new Student6("Mariya", 'f', 23, 3, 9.1);
    list.add(st1);
    list.add(st2);
    list.add(st3);
    list.add(st4);
    list.add(st5);
    StudentInfo6 si = new StudentInfo6();
    for (Student6 st : list) {
      System.out.println(st.name);
    }
    System.out.println("-------------");
    list.removeIf(x -> x.name.endsWith("a"));

  }
}


