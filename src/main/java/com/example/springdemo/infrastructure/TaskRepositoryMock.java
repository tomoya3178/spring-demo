package com.example.springdemo.infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.springdemo.domain.Task;
import com.example.springdemo.domain.TaskRepositoryInterface;

@Repository
public class TaskRepositoryMock implements TaskRepositoryInterface {
    private List<Task> tasks;
    TaskRepositoryMock () {
        this.tasks = new ArrayList<>();
    }
    public void save(Task task) {
        this.tasks.add(task);
    }
    public Task findById(UUID id) {
        return this.tasks.stream().filter(task -> task.equals(id)).findFirst().orElse(null);
    }
    public void update(Task task) {
        this.tasks = this.tasks.stream().map(e -> e.equals(task.id) ? task : e).collect(Collectors.toList());
    }
}
