package turkpol.org.pl.bootcamp_turkpol.lesson13;

import turkpol.org.pl.bootcamp_turkpol.lesson13.model.User;
import turkpol.org.pl.bootcamp_turkpol.lesson13.services.UserService;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();


        //create user class :
//        User user = new User();
//        user.setUsername("IsmayilM");
//        user.setPassword("12345");
//        user.setEmail("ismohsumo@gmail.com");
//
//        // pass to method
////        userService.registerUser( user );
//
//        System.out.println(user);



        // login part:
        final String USERNAME = "IsmayilM";
        final String PASSWORD = "12345";
        User user = userService.loginUser(USERNAME, PASSWORD);
        System.out.println(user);


    }
}
