package com.example.springdemo.domain;

import java.util.UUID;

public interface TaskRepositoryInterface {
  void save(Task task);
  Task findById(UUID id);
  void update(Task task);
}
