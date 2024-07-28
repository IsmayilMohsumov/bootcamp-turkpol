package turkpol.org.pl.bootcamp_turkpol.lesson13.services;

import turkpol.org.pl.bootcamp_turkpol.lesson13.db.DatabaseConnection;
import turkpol.org.pl.bootcamp_turkpol.lesson13.db.MySQLConnection;

import java.sql.Connection;

public class CheckDatabaseConnection {
    public static void main(String[] args) {
        DatabaseConnection db = new MySQLConnection();
        Connection connection = db.connect();

        if (connection != null){
            System.out.println("Success");
        }
    }
}
