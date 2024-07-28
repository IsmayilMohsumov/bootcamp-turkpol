package turkpol.org.pl.bootcamp_turkpol.lesson13.utils;

public enum Query {

    CREATE_USERS_TABLE("CREATE TABLE USERS(id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(50) NOT NULL UNIQUE, password VARCHAR(50) NOT NULL, email VARCHAR(100))"),
    INSERT_INTO_USERS("INSERT INTO USERS (username, password, email) VALUES (?, ?, ?)"),
    SELECT_WITH_USERNAME_AND_PASSWORD("SELECT * FROM USERS WHERE username = ? AND password = ? ");

    private final String query;

    Query(String query) {
        this.query = query;
    }

    public String getQuery(){
        return query;
    }
}
