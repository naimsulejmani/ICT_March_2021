package basic.project.database.repository;

import basic.project.database.interfaces.RepositoryBase;
import basic.project.database.models.TodoItem;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        //vazhdojme ne oren 19:00
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
        TodoItem item = null;
        String sqlQuery = "EXEC dbo.usp_TodoItems_Get ?";
        try (Connection connection = DriverManager.getConnection(connectionString);
             PreparedStatement statement = connection.prepareStatement(sqlQuery)) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String name = result.getNString("Name");
                String description = result.getNString("Description");
                LocalDate date = result.getDate("DueDate").toLocalDate();
                boolean isCompleted = result.getBoolean("IsCompleted");
                LocalDateTime insertDate = result.getObject("InsertDate", LocalDateTime.class);
                String insertBy = result.getString("InsertBy");
                LocalDateTime updateDate = result.getObject("UpdateDate", LocalDateTime.class);
                String updateBy = result.getString("UpdateBy");
                int updateNo = result.getInt("UpdateNo");

                item = new TodoItem(id, name, description, date, isCompleted, insertDate, insertBy,
                        updateDate, updateBy, updateNo);
            }
            return item;

        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            return item;
        }
    }

    @Override
    public List<TodoItem> getAll() {
        return null;
    }
}
