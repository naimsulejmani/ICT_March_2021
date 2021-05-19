package basic.project.database.repository;

import basic.project.database.interfaces.RepositoryBase;
import basic.project.database.models.TodoItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class TodoItemRepository implements RepositoryBase<TodoItem, Integer> {

    private static String connectionString =
            "jdbc:sqlserver://localhost:1433;databaseName=TodoTask;user=ictuser;password=123456";

    @Override
    public boolean add(TodoItem item) {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(connectionString);//provo me u konektu
            statement = connection.createStatement();//krijo nje sql deklarate
            String sqlInsertQuery =
                    String.format("INSERT INTO dbo.TodoItems(Name, Description,InsertBy) VALUES ('%s','%s','%s');",
                            item.getName(), item.getDescription(), item.getInsertBy());

            int rowAffected = statement.executeUpdate(sqlInsertQuery);

            return rowAffected > 0;

        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            return false;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection!=null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }

    @Override
    public boolean modify(TodoItem item) {
        return false;
    }

    @Override
    public boolean remove(TodoItem item) {
        return false;
    }

    @Override
    public boolean removeById(Integer id) {
        return false;
    }

    @Override
    public TodoItem get(Integer id) {
        return null;
    }

    @Override
    public List<TodoItem> getAll() {
        return null;
    }
}
