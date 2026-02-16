package org.example.Lesson30;

import java.util.ArrayList;

public class Test1 {

}

class Student {

  String name;
  char sex;
  int age;
  int course;
  double avgGrade;

  Student(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;

  }
}

class StudentInfo {

  void printStudent(Student st) {
    System.out.println(
        "Students name: " + st.name + " pol: " + st.sex + " age: " + st.age + " course: "
            + st.course + " avgGrade: " + st.avgGrade);
  }

  void printStudentsOverGrade(ArrayList <Student> aL, double avgGrade){
    for(Student s : aL){
      if(s.avgGrade >= avgGrade){
        printStudent(s);
      }
    }
  }

  void printStudentsUnderGrade(ArrayList <Student> aL, double avgGrade){
    for(Student s : aL){
      if(s.avgGrade < avgGrade){
        printStudent(s);
      }
    }
  }

  void printStudentsOverAge(ArrayList <Student> aL, int age){
    for(Student s : aL){
      if(s.age >= age){
        printStudent(s);
      }
    }
  }
  void printStudentsUnderAge(ArrayList <Student> aL, int age){
    for(Student s : aL){
      if(s.age < age){
        printStudent(s);
      }
    }
  }
  void printStudentsBySex(ArrayList <Student> aL, char sex){
    for(Student s : aL){
      if(s.sex == sex){
        printStudent(s);
      }
    }
  }
  void printStudentsMixConditions(ArrayList <Student> aL, double avgGrade, int age, char sex){
    for(Student s : aL){
      if(s.avgGrade > avgGrade && s.age < age && s.sex == sex){
        printStudent(s);
      }
    }
  }

  public static void main(String[] args) {
    ArrayList <Student> list = new ArrayList<>();
    Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
    Student st2 = new Student("Nikolay", 'm', 20, 2, 6.4);
    Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
    Student st4 = new Student("Petr", 'm', 35, 4, 7);
    Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
    list.add(st1);
    list.add(st2);
    list.add(st3);
    list.add(st4);
    list.add(st5);
    StudentInfo sti = new StudentInfo();
    System.out.println("-----Printing students over grade 8-----");
    sti.printStudentsOverGrade(list, 8);
    System.out.println("-----Printing students under grade 8-----");
    sti.printStudentsUnderGrade(list, 8);
    System.out.println("-----Printing students over age 23-----");
    sti.printStudentsOverAge(list, 23);
    System.out.println("-----Printing students under age 23-----");
    sti.printStudentsUnderAge(list, 23);
    System.out.println("-----Printing students mix conditions (avgGrade > 8.4, age < 25, sex: female)-----");
    sti.printStudentsMixConditions(list, 8.4, 25, 'f');
  }
}