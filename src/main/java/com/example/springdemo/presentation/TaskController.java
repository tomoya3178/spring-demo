package com.example.springdemo.presentation;

import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.TaskInput;
import com.example.springdemo.application.TaskCreateUseCase;
import com.example.springdemo.application.TaskFindByIdUseCase;
import com.example.springdemo.application.TaskUpdateUseCase;
import com.example.springdemo.domain.Task;
import com.example.springdemo.domain.TaskName;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
class TaskController {
    private final TaskCreateUseCase createUseCase;
    private final TaskFindByIdUseCase findByIdUseCase;
    private final TaskUpdateUseCase updateUseCase;
    TaskController(
        TaskCreateUseCase createUseCase,
        TaskFindByIdUseCase findByIdUseCase,
        TaskUpdateUseCase updateUseCase
    ) {
        this.createUseCase = createUseCase;
        this.findByIdUseCase = findByIdUseCase;
        this.updateUseCase = updateUseCase;
    }
    @PostMapping()
    void add(@RequestBody TaskInput input) {
        this.createUseCase.execute(input.id, new TaskName(input.name));
    }
    @GetMapping("{id}")
    Task findById(@PathVariable("id") UUID id) {
        return this.findByIdUseCase.execute(id);
    }
    @PatchMapping("{id}")
    void updateStatus(@PathVariable("id") UUID id, @RequestBody TaskInput input) {
        this.updateUseCase.execute(id, input);
    }
    
}
