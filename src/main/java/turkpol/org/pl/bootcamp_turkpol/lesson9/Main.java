package turkpol.org.pl.bootcamp_turkpol.lesson9;

import turkpol.org.pl.bootcamp_turkpol.lesson9.exceptions.UserNotFoundInTurkpolException;

public class Main {

    public static void checkUserName(String userName) throws UserNotFoundInTurkpolException {
        if (!"TurkpolUser".equals(userName)) {
            throw new UserNotFoundInTurkpolException("User not found: " + userName);
        }
    }

    public static void main(String[] args) {
        try {
            checkUserName("TurkpolUser");
        } catch (UserNotFoundInTurkpolException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("User searched");
        }
    }
}
