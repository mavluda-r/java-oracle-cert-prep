package org.example.Lesson22_p1;

public class Human3 {

  Human3() {
  }

  String name;
  String surname;

}

class Student3 extends Human3 {

  Student3(String s){
    System.out.println("Hello");
  }


  public static void main(String[] args) {
    Student3 s = new Student3("ok");
  }
}