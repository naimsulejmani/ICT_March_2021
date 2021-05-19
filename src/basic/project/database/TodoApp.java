package basic.project.database;

import basic.project.database.models.TodoItem;
import basic.project.database.repository.TodoItemRepository;

public class TodoApp {
    public static void main(String[] args) {
        //lidhja e aplikacionit - form/web e jone lidhur me kete burim te dhanave
        TodoItemRepository repository = new TodoItemRepository();

        //test insert new item
        TodoItem newItem = new TodoItem("Create TodoApp Mini Project", "naimsulejmani");
        newItem.setDescription("Create a simple app  to learn a CRUD techniques using JDBC");

        boolean isRegistered = repository.add(newItem);
        if (isRegistered)
            System.out.println("New Item succesfully registered!");
        else
            System.out.println("Failed to register!!!!");


        //test get todo item
//        TodoItem item = repository.get(1);
//        System.out.println(item);


        //test get all
        var items = repository.getAll();
        for(TodoItem item: items) {
            System.out.println(item);
            System.out.println("------------------------------------");
        }


        //test delete by id
//        boolean isDeleted = repository.removeById(2);
//        if(isDeleted)
//            System.out.println("U fshi");
//        else System.out.println("nuk mundet te fshihet!!!");

    }
}
