/**
package com.example.springdemo.infrastructure;

import org.springframework.stereotype.Repository;

import com.example.springdemo.domain.Task;
import com.example.springdemo.domain.TaskRepositoryInterface;

@Repository
public class TaskRepository implements TaskRepositoryInterface {
    private final TaskMapper mapper;
    TaskRepository (TaskMapper mapper) {
        this.mapper = mapper;
    }
    public void save(Task task) {
        this.mapper.create(task);
    }
    public Task findById(String id) {
        return this.mapper.findById(id);
    }
}
*/