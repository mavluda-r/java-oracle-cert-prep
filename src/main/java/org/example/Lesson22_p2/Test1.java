package org.example.Lesson22_p2;

import org.example.Lesson22_p1.Chelovek;

public class Test1 {

  public static void main(String[] args) {
    Chelovek ch = new Chelovek("male");
    ch.setName(new StringBuilder("Petya"));
    ch.setAge(25);
    ch.setHeight(80);
  }
}
