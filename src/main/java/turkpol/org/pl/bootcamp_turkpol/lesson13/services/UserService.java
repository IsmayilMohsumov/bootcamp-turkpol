package turkpol.org.pl.bootcamp_turkpol.lesson13.services;

import turkpol.org.pl.bootcamp_turkpol.lesson13.db.MySQLConnection;
import turkpol.org.pl.bootcamp_turkpol.lesson13.model.User;
import turkpol.org.pl.bootcamp_turkpol.lesson13.utils.Query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

    public UserService() {

    }

    private void createTables() {
        try(Connection connection = MySQLConnection.getConnection();
            PreparedStatement createUsers = connection.prepareStatement(Query.CREATE_USERS_TABLE.getQuery())) {

            createUsers.executeUpdate();
            System.out.println("Created  succesfully");


        } catch (SQLException e){
            e.printStackTrace();
        }
    }


    // registration:
        // void method
        // one parameter -> User model class
        // name registerUser
    public void registerUser(User user){


        //Query
        String insertQuery = Query.INSERT_INTO_USERS.getQuery();

        // open connection & provide query
        try (Connection connection = MySQLConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)){

            // set string
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());


            //run query
            int isSuccessful = preparedStatement.executeUpdate();

            if (isSuccessful > 0) {
                System.out.println("A new user was inserted successfully!");
            }



        }catch (SQLException e){
            e.printStackTrace();
        }


    }



    // login
        // return type - >User
        // method name - > loginUser
        // params -> username, password

    public User loginUser(String username, String password){

        //Query
        String selectQuery = Query.SELECT_WITH_USERNAME_AND_PASSWORD.getQuery();


        // open connection
        try (Connection connection = MySQLConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)){

            // set string
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            // iterate resultSet
            if (resultSet.next()) {

                //create instance of User model & return
                User user = new User();
                user.setId(resultSet.getString("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));

                return user;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }


}
