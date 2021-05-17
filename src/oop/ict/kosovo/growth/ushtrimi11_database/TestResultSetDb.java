package oop.ict.kosovo.growth.ushtrimi11_database;

import java.sql.*;

public class TestResultSetDb {
    public static void main(String[] args) {


        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Test;user=ictuser;password=123456";
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Urime jeni konektuar ne SQL Databazen e specifikuar!");

            String sqlQuery = "SELECT * FROM topic";
            Statement statement = connection.createStatement();

            ResultSet results = statement.executeQuery(sqlQuery);
            while (results.next()) {
                System.out.printf("%s - %s - %s%n",
                        results.getString(1),
                        results.getString("name"),
                        results.getObject(3, String.class)
                );
            }


        } catch (SQLException throwables) {
            System.out.println("Lidhja me databaze deshtoi!!!");
            throwables.printStackTrace();
        } finally {

        }
    }
}
