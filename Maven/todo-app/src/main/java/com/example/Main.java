package com.example;

public class Main {
    public static void main(String[] args) {
        TodoManager manager = new TodoManager();
        manager.addTodo("Learn Maven on Windows");
        System.out.println("Todo list size: " + manager.getTodos().size());
        manager.getTodos().forEach(todo -> System.out.println("- " + todo));
    }
}
