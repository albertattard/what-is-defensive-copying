package com.javacreed.examples.oop.part1;

public class Example1 {
  public static void main(final String[] args) {
    final Data data = new Data(10);
    data.setValue(0, 5);

    /* This will fail as you cannot set negative numbers */
    data.setValue(0, -10);
  }
}
