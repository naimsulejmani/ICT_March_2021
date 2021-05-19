package basic.project.database.repository;

import java.sql.*;

/*
       1. Lexo conneciton URL prej ndonje config file (file binar, xml, json,....)
       2. me ruajt koneksion dh eme kriju te ri
       3. me kriju nje metode e cila ben ekzekutimin dhe menaxhon try...catch dhe kthen resultset
        3.1 -> me pranu sqlQuery, me i pranu parameterat objektin
 */
public class DataConnection {
    private static String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=TodoTask;user=ictuser;password=123456";

    private static Connection connection = null;

    public static Connection getConnection() {

        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
            connection = DriverManager.getConnection(connectionUrl);
            return connection;
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            return null;
        }
    }

    public static String getConnectionUrl() {
        return connectionUrl;
    }

    public static void setConnectionUrl(String connectionUrl) {
        DataConnection.connectionUrl = connectionUrl;
    }

    // Mentor Ilazi
    // Kur kemi me ekzektu ndonje procedure e cila ska nevoje per parametra
    //sqlQuery = "EXEC dbo.usp_TEST ?,?;"
    public ResultSet getResultSet(String sqlQuery) throws SQLException {
        Connection connection = DriverManager.getConnection(connectionUrl);
        PreparedStatement statement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = statement.executeQuery();
        return resultSet;
    }

//    public ResultSet executeProcedure(String procedureName, T object) {
//
//    }
}
