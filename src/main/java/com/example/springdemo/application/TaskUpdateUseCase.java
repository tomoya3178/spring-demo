package com.example.springdemo.application;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.springdemo.TaskInput;
import com.example.springdemo.domain.Task;
import com.example.springdemo.domain.TaskName;
import com.example.springdemo.domain.TaskRepositoryInterface;

@Service
public class TaskUpdateUseCase {
    private final TaskRepositoryInterface repository;
    TaskUpdateUseCase (TaskRepositoryInterface repository) {
        this.repository = repository;
    }
    public void execute(UUID id, TaskInput input) {
        Task task = this.repository.findById(id);
        this.repository.update(task.update(new TaskName(input.name), input.status));
    }
}
