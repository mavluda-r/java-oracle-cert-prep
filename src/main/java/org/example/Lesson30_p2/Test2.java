package org.example.Lesson30_p2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

  public static void main(String[] args) {
    List<String> list = List.of("hello", "bye", "how are you ?", "are you OK?");
    String str = "klsdfdsf";
//    str = "sdfds";
    for (String s : list) {
//      Predicate<String> p = s1 -> s1.length() > 4;
//      System.out.println(p.test(s));

      Predicate<String> p = z -> {
        System.out.println(str.length());
        return z.length() > 4;
      };
    }
//  list.forEach(s -> System.out.println(s));
//
//    ArrayList<Integer> list1 = new ArrayList<>();
//    list1.add(6);
//    list1.add(3);
//    list1.add(7);
//    list1.add(5);
//    list1.add(2);
//    list1.add(1);
//    list1.add(4);
//    list1.removeIf(element -> element % 3 == 0);
//    System.out.println(list1);

//    Predicate<Integer> p = element -> element % 3 == 0;
//    list1.removeIf(p);
//    System.out.println(list1);
//
//    System.out.println(list1);
//
//    list1.sort((x, y) -> -x.compareTo(y));
//    System.out.println(list1);
  }
}