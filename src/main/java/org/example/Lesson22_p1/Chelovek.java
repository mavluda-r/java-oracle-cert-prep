package org.example.Lesson22_p1;

public class Chelovek {

  final String pol;

  public Chelovek(String pol) {
    this.pol = pol;
  }

  private boolean clever;

  public boolean isClever() {
    return clever;
  }

  private StringBuilder name;

  public StringBuilder getName() {
    StringBuilder sb = new StringBuilder(name);
    return sb;
  }

  public void setName(StringBuilder name) {
    this.name = name;
  }

  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private int height;

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    if (height > 0) {
      this.height = height;
    }
  }
}

class Test {

  public static void main(String[] args) {
    Chelovek ch = new Chelovek("male");
    ch.setName(new StringBuilder ("Petya"));
    ch.getName().append("!!!");
    System.out.println(ch.getName());
    ch.setAge(25);
    ch.setHeight(80);
    System.out.println(ch.getName());
    System.out.println(ch.getAge());
    System.out.println(ch.getHeight());
    ch.setHeight(-20);
    System.out.println(ch.getHeight());
  }
}
/*
* get method orqali yuborilgan ma`lumotni o`zagrtirish imkonsiz bo`lishi kerak*/