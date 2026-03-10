package org.example.Lesson31;

import java.util.ArrayList;

public class Test2 {

  public static void main(String[] args) {


    ArrayList<Integer> a1 = new ArrayList<>();
    a1.add(1);
    a1.add(2);
    a1.add(3);
    a1.add(4);
    a1.add(5);
    a1.add(6);
    a1.add(7);
    int a = GetMethod.getSecondElement(a1);
    System.out.println(a);

    ArrayList<String> a2 = new ArrayList<>();
    a2.add("a");
    a2.add("b");
    a2.add("c");
    a2.add("d");
    a2.add("e");
    a2.add("f");
    a2.add("g");
    String b = GetMethod.getSecondElement(a2);
    System.out.println(b);
  }
}

class GetMethod{
  public static <T> T getSecondElement(ArrayList<T> list) {
    return list.get(1);
  }
}
