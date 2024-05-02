package org.example;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String id;
    private String name;
    private String position;
    private List<Task> tasks;

    public Employee(String id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Tasks:");
        for (Task task : tasks) {
            System.out.println("- " + task.getDescription());
        }
    }
}
