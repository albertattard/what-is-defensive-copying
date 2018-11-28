package com.javacreed.examples.oop.part3;

import java.util.List;

public class Example1 {
  public static void main(final String[] args) {
    final Data data = new Data();
    data.addValue(5);

    final List<Integer> values = data.getValues();
    values.set(0, -10);

    System.out.println(data);
  }
}
