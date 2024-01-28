package com.example.springdemo.application;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.springdemo.domain.Task;
import com.example.springdemo.domain.TaskRepositoryInterface;

@Service
public class TaskFindByIdUseCase {
    private final TaskRepositoryInterface repository;
    TaskFindByIdUseCase (TaskRepositoryInterface repository) {
        this.repository = repository;
    }
    public Task execute(UUID id) {
        return this.repository.findById(id);
    }
}
