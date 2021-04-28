package oop.ict.kosovo.growth.ushtrimi8_interface.sql;

import java.util.ArrayList;

public class MSSQLDbConnection implements IDbConnection {
    @Override
    public void connect(String connectionString) throws SQLConnectionStringException {
        //ketu me kriju lidhjen me serverin
        //me i kontrollu parameterat se a jane ne rregull duke i be split (;)
        //nese nuk janew spaku database, datasource, username dhe password gjuaj gabim
        throw new SQLConnectionStringException("Nuk jane specifikuar te gjitha parameterat");
    }

    @Override
    public void open() throws SQLException {
        throw new SQLException("Firewall is not open, blocks the connection!");
    }

    @Override
    public void close() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public IDbConnection getConnection() {
        return new MSSQLDbConnection();
    }

    @Override
    public int execute(String query) {
        //0 ose ma e madhe se zero ne rregull
        //nese negativ nuk eshte ne rregull
        return 0;
    }

    @Override
    public ArrayList<Object> executeReader(String query) {
        return null;
    }
}
