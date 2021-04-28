package oop.ict.kosovo.growth.ushtrimi8_interface.sql;

import java.util.ArrayList;

//ICT-Database-Driver
public interface IDbConnection {
    //connectionString=Data Source=locahost;Port=1433;Database=Northwind;User Id=user;Password=123456
    void connect(String connectionString) throws SQLConnectionStringException;

    void open() throws SQLException;

    void close();

    void dispose();

    IDbConnection getConnection();//qe kthen koneksioin nese nuk eshte shkatru


    int execute(String query); //"INSERT INTO tbl" - CREATE, UPDATE, DELETE

    ArrayList<Object> executeReader(String query); //"SELECT * FROM "
}
