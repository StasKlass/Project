package org.example;

public class Task {
    private String id;
    private String description;
    private String status;
    private String deadline;

    public Task(String id, String description, String status, String deadline) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.deadline = deadline;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getDeadline() {
        return deadline;
    }
}
