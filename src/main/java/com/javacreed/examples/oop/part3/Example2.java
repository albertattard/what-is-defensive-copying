package com.javacreed.examples.oop.part3;

import java.util.List;

public class Example2 {
  public static void main(final String[] args) {
    final Data data = new Data();
    final List<Integer> values = data.getValues();

    data.addValue(5);

    System.out.println(data);
    System.out.println(values);
  }
}
