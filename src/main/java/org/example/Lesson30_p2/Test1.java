package org.example.Lesson30_p2;

import java.util.ArrayList;

public class Test1 {

  public static void main(String[] args) {
    var testInterfaceType = new TestInterfaceType();
    var i = 10;
    var w = 1.5f;
    var array1 = new String[]{"a", "b"};
    var result = abc();
    Object obj1 = "hello";
    var obj2 = obj1;
    ArrayList<String> a1 = new ArrayList<>();
    for (var s : a1) {
      System.out.println(s);
    }
    var h = "bye";
    var array2 = new int[]{1, 2};
    var array3 = new int[]{};
    var var = "var";
  }

  static double abc() {
    return 3.14;
  }

  /*
   * var --> methodda parameter sifatida yozish mumkin emas
   * var --> methodda return type sifatida ishlatish mumkin emas
   *  */
}

class TestInterfaceType {

}

interface I {

  void abc();

  /*
  interface bittagina abstract method saqlasa bu funksional interface deb nomlanadi.
  ammo quyidagi methodlar bn ham ushbu interface funksional hisoblanaveradi
  */
  default void def() {
  }

  default void def2() {
  }

  static void def3() {
  }
}