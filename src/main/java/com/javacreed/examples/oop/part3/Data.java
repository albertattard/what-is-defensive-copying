package com.javacreed.examples.oop.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data {

  private final List<Integer> values = new ArrayList<>();
  private final List<Integer> immutableValues = Collections.unmodifiableList(values);

  public void addValue(final int value) throws IllegalArgumentException {
    if (value < 0) {
      throw new IllegalArgumentException("The value must be positive");
    }

    values.add(value);
  }

  public List<Integer> getValues() {
    return immutableValues;
  }

  @Override
  public String toString() {
    return String.valueOf(values);
  }
}
