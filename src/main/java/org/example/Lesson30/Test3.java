package org.example.Lesson30;

import java.util.ArrayList;

public class Test3 {

  public static void main(String[] args) {

  }

}

class Student3 {

  String name;
  char sex;
  int age;
  int course;
  double avgGrade;

  Student3(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;

  }
}

class StudentInfo3 {

  void printStudent(Student3 st) {
    System.out.println(
        "Students name: " + st.name + " pol: " + st.sex + " age: " + st.age + " course: "
            + st.course + " avgGrade: " + st.avgGrade);
  }

  void testStudents3(ArrayList<Student3> aL, StudentChecks3 studentChecks) {
    for (Student3 st : aL) {
      if (studentChecks.test3(st)) {
        printStudent(st);
      }
    }

  }

  public static void main(String[] args) {
    ArrayList<Student3> list = new ArrayList<>();
    Student3 st1 = new Student3("Ivan", 'm', 22, 3, 8.3);
    Student3 st2 = new Student3("Nikolay", 'm', 20, 2, 6.4);
    Student3 st3 = new Student3("Elena", 'f', 19, 1, 8.9);
    Student3 st4 = new Student3("Petr", 'm', 35, 4, 7);
    Student3 st5 = new Student3("Mariya", 'f', 23, 3, 9.1);
    list.add(st1);
    list.add(st2);
    list.add(st3);
    list.add(st4);
    list.add(st5);
    StudentInfo3 si = new StudentInfo3();

    // bu usul ishlashi uchun Interface ichida faqat
    // bitta abstract method bo‘lishi kerak — shunda u lambda bilan ishlaydi
    System.out.println("---------find student over grade--------");
    si.testStudents3(list, (Student3 st) -> {
      return st.avgGrade > 0.5;
    });
    System.out.println("---------find student under grade--------");
    si.testStudents3(list, st -> st.avgGrade <= 0.5);
    System.out.println("---------find student over age--------");
    si.testStudents3(list, st -> {
      int z = 5;
      return st.age > 25;
    });
    System.out.println("---------find student under age--------");
    si.testStudents3(list, (Student3 st) -> {
      return st.age <= 25;
    });
    System.out.println("---------find student by sex--------");
    si.testStudents3(list, (Student3 st) -> {
      return st.sex == 'm';
    });
    System.out.println("---------find student mix condition--------");
    si.testStudents3(list, (Student3 st) -> {
      return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f';
    });

  }
}

// Functional Interface
interface StudentChecks3 {

  boolean test3(Student3 s);
}



/*
*
Functional interface’da:

✔ 1 ta abstract method bo‘lishi shart
✔ lekin boshqa methodlar bo‘lishi mumkin:

default methodlar

static methodlar

Object dan kelgan methodlar (toString, equals va h.k.)

Masalan bu ham ishlaydi:

@FunctionalInterface
interface StudentChecks3 {

  boolean test3(Student3 s);

  default void hello() {
    System.out.println("Hi");
  }

  static void test() {}
}

Baribir lambda ishlaydi.*/