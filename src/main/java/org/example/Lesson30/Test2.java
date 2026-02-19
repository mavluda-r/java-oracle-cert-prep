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

  void testStudent(ArrayList <Student1> aL, StudentChecks studentChecks) {
    for (Student1 st : aL) {
      if(studentChecks.test(st)){
        printStudent(st);
      }
    }

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
    FindStudentOverGrade findStudentOverGrade = new FindStudentOverGrade();
    FindStudentUnderGrade findStudentUnderGrade = new FindStudentUnderGrade();
    FindStudentOverAge findStudentOverAge = new FindStudentOverAge();
    FindStudentUnderAge findStudentUnderAge = new FindStudentUnderAge();
    FindStudentBySex findStudentBySex = new FindStudentBySex();
    FindStudentMixCondition findStudentMixCondition = new FindStudentMixCondition();

    System.out.println("---------find student over grade--------");
    si.testStudent(list, findStudentOverGrade);
    System.out.println("---------find student under grade--------");
    si.testStudent(list, findStudentUnderGrade);
    System.out.println("---------find student over age--------");
    si.testStudent(list, findStudentOverAge);
    System.out.println("---------find student under age--------");
    si.testStudent(list, findStudentUnderGrade);
    System.out.println("---------find student by sex--------");
    si.testStudent(list, findStudentBySex);
    System.out.println("---------find student mix condition--------");
    si.testStudent(list, findStudentMixCondition);

  }
}

interface StudentChecks {

  boolean test(Student1 s);
}

class FindStudentOverGrade implements StudentChecks {

  public boolean test(Student1 s) {
    return s.avgGrade > 8.4;
  }
}

class FindStudentUnderGrade implements StudentChecks {

  public boolean test(Student1 s) {
    return s.avgGrade < 9;
  }
}

class FindStudentOverAge implements StudentChecks {

  public boolean test(Student1 s) {
    return s.age > 25;
  }
}

class FindStudentUnderAge implements StudentChecks {

  public boolean test(Student1 s) {
    return s.age < 25;
  }
}

class FindStudentBySex implements StudentChecks {

  public boolean test(Student1 s) {
    return s.sex == 'm';
  }
}

class FindStudentMixCondition implements StudentChecks {

  public boolean test(Student1 s) {
    return (s.avgGrade > 7.1 && s.age < 23 && s.sex == 'm');
  }
}