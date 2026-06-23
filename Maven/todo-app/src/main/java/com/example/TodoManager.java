package com.example;

import java.util.ArrayList;
import java.util.List;

public class TodoManager {
    private final List<String> todos = new ArrayList<>();

    public void addTodo(String task) {
        if (task != null && !task.trim().isEmpty()) {
            todos.add(task);
        }
    }

    public List<String> getTodos() {
        return new ArrayList<>(todos);
    }
}
