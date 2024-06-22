package turkpol.org.pl.bootcamp_turkpol.lesson8;

public class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
        this.name = "John Doe";
        this.age = 30;
    }

    // Overloaded constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
