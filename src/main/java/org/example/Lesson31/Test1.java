package org.example.Lesson31;

public class Test1 {

  public static void main(String[] args) {
//    ArrayList<String> a1 = new ArrayList<>();
    Info<String> info1 = new Info<>("hello");
    System.out.println(info1);
    String s = info1.getValue();

    Info<Integer> info2 = new Info<>(100);
    System.out.println(info2);
    Integer i = info2.getValue();
  }
}

class Info<T> {

  private T value;

  public Info(T value) {
    this.value = value;
  }

  public String toString() {
    return "[{ " + value + " }]";
  }

  public T getValue(){
    return value;
  }
}