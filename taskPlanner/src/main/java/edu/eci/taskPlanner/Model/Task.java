package edu.eci.taskPlanner.Model;

/**
 * Task
 */
public class Task {
    private String id;
    private String state;
    private String description;
    private String dueDate;
    private User responsible;

    public Task (String id, String state, String description, String dueDate, User responsible) {
        this.id = id;
        this.state = state;
        this.description = description;
        this.dueDate = dueDate;
        this.responsible = responsible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }

}