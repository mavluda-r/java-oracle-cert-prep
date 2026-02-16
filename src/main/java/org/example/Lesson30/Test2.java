package org.example.Lesson30;

import java.util.ArrayList;

public class Test2 {

  public static void main(String[] args) {

  }

}

class Student1 {

  String name;
  char sex;
  int age;
  int course;
  double avgGrade;

  Student1(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;

  }
}

class StudentInfo1 {

  void printStudent(Student1 st) {
    System.out.println(
        "Students name: " + st.name + " pol: " + st.sex + " age: " + st.age + " course: "
            + st.course + " avgGrade: " + st.avgGrade);
  }

  void testStudent(ArrayList <Student1> ast) {

  }
  public static void main(String[] args) {
    ArrayList<Student1> list = new ArrayList<>();
    Student1 st1 = new Student1("Ivan", 'm', 22, 3, 8.3);
    Student1 st2 = new Student1("Nikolay", 'm', 20, 2, 6.4);
    Student1 st3 = new Student1("Elena", 'f', 19, 1, 8.9);
    Student1 st4 = new Student1("Petr", 'm', 35, 4, 7);
    Student1 st5 = new Student1("Mariya", 'f', 23, 3, 9.1);
    list.add(st1);
    list.add(st2);
    list.add(st3);
    list.add(st4);
    list.add(st5);
    StudentInfo1 si = new StudentInfo1();

  }
}

interface StudentChecks {

  boolean testStudent(Student1 s);
}

class FindStudentOverGrade implements StudentChecks {

  public boolean testStudent(Student1 s) {
    return s.avgGrade > 8.4;
  }
}