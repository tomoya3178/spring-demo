package com.example.springdemo.domain;

public class TaskName {
  private final String value;
  public TaskName(String value) {
    if (value.length() <= 0) {
      throw new Error();
    }
    if (value.length() > 5) {
      throw new Error();
    }
    this.value = value;
  }
  @Override
  public String toString() {
    return this.value;
  }
}
