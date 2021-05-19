package basic.project.database.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoItem {
    private int id;
    private String name;
    private String description;
    private LocalDate dueDate;
    private boolean isCompleted = false;
    private LocalDateTime insertDate;
    private String insertBy;
    private LocalDateTime updateDate;
    private String updateBy;
    private int updateNo = 0;

    public TodoItem(String name, String insertBy) {
        this.name = name;
        this.insertBy = insertBy;
        this.dueDate = LocalDate.now();
        this.insertDate = LocalDateTime.now();
    }

    public TodoItem(String name, String description, LocalDate dueDate, String insertBy) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.insertBy = insertBy;
    }

    public TodoItem(int id, String name, String description, LocalDate dueDate, boolean isCompleted, LocalDateTime insertDate, String insertBy, LocalDateTime updateDate, String updateBy, int updateNo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
        this.insertDate = insertDate;
        this.insertBy = insertBy;
        this.updateDate = updateDate;
        this.updateBy = updateBy;
        this.updateNo = updateNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public String getInsertBy() {
        return insertBy;
    }

    public void setInsertBy(String insertBy) {
        this.insertBy = insertBy;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public int getUpdateNo() {
        return updateNo;
    }

    public void setUpdateNo(int updateNo) {
        this.updateNo = updateNo;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo: %d%n" +
                        "Name: %s%n" +
                        "Description: %s%n" +
                        "DueDate: %s%n" +
                        "IsCompleted: %s%n",
                id, name, description, dueDate, isCompleted ? "YES" : "NO"
        );
    }
}
