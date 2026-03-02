//package org.example.Lesson22;
//
//public class Test3 {
//
//  void uvZarp(Employee e) {
//    e.salary = e.salary * 2;
//  }
//
//  public static void main(String[] args) {
//    Doctor doc = new Doctor();
//    doc.name = "Ivan";
//    doc.age = 50;
//    doc.experience = 25;
//    doc.eat();
//    doc.spetsializatsiya = "xirurg";
//    doc.sleep();
//    doc.lechit();
//
//  }
//}
//
//class Employee extends java.lang.Object{ // auto extends olingan bo`ladi
//
//  double salary;
//  String name;
//  int age;
//  int experience;
//
//  void eat() {
//    System.out.println("Kushat");
//  }
//
//  void sleep() {
//    System.out.println("Spat");
//  }
//}
//
//class Doctor extends Employee {
//
//  String spetsializatsiya;
//
//  void lechit() {
//    System.out.println("lechit");
//  }
//}
//
//class Xirurg extends Doctor {
//
//  String skalpel;
//
//  void operatsiya() {
//
//  }
//}
//
//class Dentist extends Doctor {
//
//}
//
///*
//*
//*
//*
//*
//*
//* */
//
//class Teacher extends Employee {
//
//  int kolvoUchenikov;
//
//  void uchit() {
//    System.out.println("uchit");
//  }
//
//}
//
//class Driver extends Employee {
//
//  String naznachenieMashin;
//
//  void vodit() {
//    System.out.println("vodit");
//  }
//}