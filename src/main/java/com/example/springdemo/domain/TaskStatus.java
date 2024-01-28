package com.example.springdemo.domain;

public enum TaskStatus {
    Undone("Undone"),
    Done("Done");
    private final String value;
    private TaskStatus(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
};
