package com.example.springdemo;

import java.util.UUID;

import com.example.springdemo.domain.TaskStatus;

import lombok.Data;

@Data
public class TaskInput {
  public UUID id;
  public String name;
  public TaskStatus status;
}
