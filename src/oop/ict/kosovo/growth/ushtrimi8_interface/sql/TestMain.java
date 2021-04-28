package oop.ict.kosovo.growth.ushtrimi8_interface.sql;

public class TestMain {
    public static void main(String[] args) {
        //simulim se keto argumente na vijen nga jashte
        args = new String[]{"mysql", "Server:192.168.100.100;Database:NORTHWIND;User Id=sa;Password=sa"};
        if (args != null && args.length == 2) {
            IDbConnection connection = null;
            try {
                switch (args[0].toLowerCase()) {
                    case "mysql":
                        connection = new MYSQLDbConnection();
                        break;
                    case "mssql":
                        connection = new MSSQLDbConnection();
                        break;
//                    case "mariadb":
//                        connection = new MSSQLDbConnection();
//                        break;
                    default:
                        throw new SQLException("Ska connection per kete lloj te SQL");
                }

                connection.connect(args[1]);
                int returnValue = connection.execute("INSERT INTO tbl(Id,Name) VALUES(1,'Naim')");

                if (returnValue >= 0) System.out.println("U ekzekutua me sukses!!!");
                else System.out.println("Deshtoi te regjistohet, provoni perseri!!!");


            } catch (SQLConnectionStringException ex) {
                System.out.println("Parametrat nuk jane dhene sakt!!!");
            } catch (SQLException ex) {
                System.out.println("Gabim ne SQL dicka!!!");
            } finally {
                if (connection != null) {
                    connection.close();
                    connection.dispose();
                }
            }
        } else {
            System.out.println("Nuk keni dhene parametrat e sistemit!!!");
        }
    }
}
