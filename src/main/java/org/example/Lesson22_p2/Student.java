package org.example.Lesson22_p2;

import org.example.Lesson22_p1.Human;

public class Student extends Human {

  public static void main(String[] args) {
    Student s = new Student();
    System.out.println(s.name);
    System.out.println(Student.salary);
    s.work();
    Student.rest();

//    Human h = new Human();
//    System.out.println(h.name);
//    h.work();
  }
}

class Test {

  public static void main(String[] args) {
    Student s = new Student();
//    System.out.println(s.name);
//    System.out.println(Student.salary);
    /*agar super classda protected methodlar mavjud bo`lsa u faqat nasl olgan classlarda va shu package classlarida ko`rinadi
     * yani protected package ichida erkin, atshqarida nasl orqali qoidasi */

  }
}