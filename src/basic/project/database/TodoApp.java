package basic.project.database;

import basic.project.database.models.TodoItem;
import basic.project.database.repository.TodoItemRepository;

public class TodoApp {
    public static void main(String[] args) {
        //lidhja e aplikacionit - form/web e jone lidhur me kete burim te dhanave
        TodoItemRepository repository = new TodoItemRepository();

        TodoItem newItem = new TodoItem("Create TodoApp Mini Project", "naimsulejmani");
        newItem.setDescription("Create a simple app  to learn a CRUD techniques using JDBC");

        boolean isRegistered = repository.add(newItem);
        if (isRegistered)
            System.out.println("New Item succesfully registered!");
        else
            System.out.println("Failed to register!!!!");
    }
}
