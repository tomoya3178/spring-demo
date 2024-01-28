package com.example.springdemo.application;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.springdemo.domain.Task;
import com.example.springdemo.domain.TaskName;
import com.example.springdemo.domain.TaskRepositoryInterface;

@Service
public class TaskCreateUseCase {
    private final TaskRepositoryInterface repository;
    TaskCreateUseCase (TaskRepositoryInterface repository) {
        this.repository = repository;
    }
    public void execute(UUID id, TaskName name) {
        this.repository.save(Task.create(id, name));
    }
}
