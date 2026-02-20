package org.example.Lesson30;

public class Test4 {

  static void def(Test5 t) {
    System.out.println(t.abc("hello"));
  }

  public static void main(String[] args) {
    Test5 t = new Test5(){
      @Override
      public int abc(String x){
        return x.length();
      }
    };
    def(t);
    def(x -> x.length());
  }
}

interface Test5 {

  int abc(String s);
}