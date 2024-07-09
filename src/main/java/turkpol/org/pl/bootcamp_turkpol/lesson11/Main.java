package turkpol.org.pl.bootcamp_turkpol.lesson11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try{

            // get all the fullnames of teachers from database;
            //JDBC - Java Database Connection

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/turkpol","root","root");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("Select * from teachers");

            while (resultSet.next()){
                System.out.println(resultSet.getString("fullname"));
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
