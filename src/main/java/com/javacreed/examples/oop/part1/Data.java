package com.javacreed.examples.oop.part1;

import java.util.Arrays;

public class Data {

  private final int[] values;

  public Data(final int size) {
    values = new int[size];
  }

  public int[] getValues() {
    return values;
  }

  public void setValue(final int index, final int value) throws IllegalArgumentException {
    if (value < 0) {
      throw new IllegalArgumentException("The value must be positive");
    }

    values[index] = value;
  }

  @Override
  public String toString() {
    return Arrays.toString(values);
  }
}
