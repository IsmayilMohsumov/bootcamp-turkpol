package turkpol.org.pl.bootcamp_turkpol.lesson13.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements DatabaseConnection{
    private static final String URL = "jdbc:mysql://localhost:3307/turkpol";
    private static final String USER = "root";
    private static final String PASSWORD = "root";


    @Override
    public Connection connect() {
        return getConnection();
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }


}
