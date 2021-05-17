package oop.ict.kosovo.growth.ushtrimi11_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
    public static void main(String[] args) {


        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Test;user=ictuser;password=123456";
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Urime jeni konektuar ne SQL Databazen e specifikuar!");

            String sqlQuery = "INSERT INTO topic VALUES ('A','Char A','ShkronjaA')";

            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(sqlQuery);

            System.out.printf("(%d) row affected%n", rowAffected);
            statement.close();//finally
            connection.close();//finally

        } catch (SQLException throwables) {
            System.out.println("Lidhja me databaze deshtoi!!!");
            throwables.printStackTrace();
        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        finally {

        }
    }
}
