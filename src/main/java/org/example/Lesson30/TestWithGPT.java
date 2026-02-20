package org.example.Lesson30;

public class TestWithGPT {

  //Anonymous class
  void show() {
    TestWithGPTInterface t1 = new TestWithGPTInterface() {
      @Override
      public int abc(String x) {
        System.out.println("Anonymous this = " + this);
        return x.length();
      }
    };

    // Lambda
    TestWithGPTInterface t2 = x -> {
      System.out.println("Anonymous this = " + this);
      return x.length();
    };
    t1.abc("hello");
    t2.abc("hello");
  }

  public static void main(String[] args) {
    new TestWithGPT().show();
  }

}

interface TestWithGPTInterface {

  int abc(String s);
}

/*
* Output
*
Anonymous this = org.example.Lesson30.TestWithGPT$1@10f87f48
Anonymous this = org.example.Lesson30.TestWithGPT@4e50df2e
*
* $1 yashirin classni bildiradi*/