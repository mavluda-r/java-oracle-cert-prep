package org.example.Lesson30;

public class Test4 {

//  void method1(int a){
//    int a = 5;
//  }

  static void def(Test5 t) {
    System.out.println(t.abc("hello"));
  }

//  static void def(Test5 t) {
//    System.out.println(t.abc("hello", "bye"));
//  }

  public static void main(String[] args) {
//    Test5 t = new Test5(){
//      @Override
//      public int abc(String x){
//        return x.length();
//      }
//    };
//    def(t);
//    def((x, y) -> x.length());


//    def(x -> {String x = "ok"; return x.length();});
    def(x -> {x = "ok"; return x.length();});

    def(x -> x.length());


  }
}

interface Test5 {

  //  int abc(String s, String s2);
  int abc(String s);
}