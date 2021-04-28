package oop.ict.kosovo.growth.ushtrimi8_interface.sql;

import java.util.ArrayList;

public class MYSQLDbConnection implements IDbConnection {
    //port=3306;
    @Override
    public void connect(String connectionString) throws SQLConnectionStringException {
        //kontrollo parametrat konektohu
        System.out.println("U konekuta ne: "+connectionString);
    }

    @Override
    public void open() throws SQLException {
        System.out.println("Koneksioni u hap me sukses!");
    }

    @Override
    public void close() {
        System.out.println("Koneksioni u mbyll!");
    }

    @Override
    public void dispose() {
        System.out.println("Objekti i koneksionit u shkatrua nga memoria!");
    }

    @Override
    public IDbConnection getConnection() {

        return new MYSQLDbConnection();
    }

    @Override
    public int execute(String query) {
        if(query!=null && query.startsWith("INSERT")) return 1;
        return -1;
    }

    @Override
    public ArrayList<Object> executeReader(String query) {
        return null;
    }
}
