package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoManagerTest {
    @Test
    void testAddTodo() {
        TodoManager manager = new TodoManager();
        manager.addTodo("Learn Maven on Windows");
        assertEquals(1, manager.getTodos().size());
    }
}
