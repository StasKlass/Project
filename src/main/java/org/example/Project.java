package org.example;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String id;
    private String name;
    private List<Task> tasks;
    private List<Employee> employees;

    public Project(String id, String name) {
        this.id = id;
        this.name = name;
        this.tasks = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void displayInfo() {
        System.out.println("Project ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Tasks:");
        for (Task task : tasks) {
            System.out.println("- " + task.getDescription() + " (" + task.getStatus() + ") Deadline: " + task.getDeadline());
        }
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println("- " + employee.getName());
        }
    }
}
