package turkpol.org.pl.bootcamp_turkpol.lesson8;

public class Lesson8 {
    public static void main(String[] args) {
        // methods
        // encapsulation
        // overloading
        // constructors
        // access modifiers

        // OOP
        // inheritance & polymorphism
        // abstract classes and interfaces
        // (optional) exceptions

        sayHello();
        System.out.println(sum(2, 3));

        System.out.println(area(5.0));
        System.out.println(area(4, 6));

        // initialize Person
        Person person1 = new Person();
        System.out.println(person1.name);

        Person person2 = new Person("Bootcamp student", 19);
        System.out.println(person2.name);

        BankAccount account = new BankAccount(15);
        System.out.println(account.getBalance());
        System.out.println("updating balance");
        account.setBalance(20);
        System.out.println(account.getBalance());

        Dog dog = new Dog();
//        dog.printColor("Blue");
        dog.eat();
        dog.sound();

        // casting
        Animal animal = new Dog();
        animal.eat();



    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // is a circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // is a rectangle
    public static int area(int length, int width) {
        return length * width;
    }
}
