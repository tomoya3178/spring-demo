package com.example.springdemo.domain;

import java.util.UUID;

public class Task {
  public final UUID id;
  public final TaskName name;
  public final TaskStatus status;
  private Task (UUID id, TaskName name, TaskStatus status) {
    this.id = id;
    this.name = name;
    this.status = status;
  }
  public static Task create(UUID id, TaskName name) {
    return new Task(id, name, TaskStatus.Undone);
  }
  public Boolean equals(UUID id) {
    return this.id == id;
  }
  public Task update(TaskName name, TaskStatus status) {
    return new Task(this.id, name, status);
  }
}
