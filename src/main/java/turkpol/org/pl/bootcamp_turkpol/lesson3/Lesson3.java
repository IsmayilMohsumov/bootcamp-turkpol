package turkpol.org.pl.bootcamp_turkpol.lesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        /*
        //variables
        int age = 5; // -2,147,483,648 to 2,147,483,647
        double pi = 3.14;
        char letter = 'a';
        String name = "Adam";
        boolean isAdult = false;

        System.out.println("age: " + age);
        System.out.println("pi: " + pi);
        System.out.println("letter: " + letter);
        System.out.println("name: " + name + " age: " + age);

        int a = 3;

        // naming conventions
        boolean isOutsideSunny = false;
        Integer number = 3;
        String numToString = "string";
        System.out.println(numToString.toUpperCase());

        // operators
        int num1 = 3;
        int num2 = 5;

        int sum = num1 * num2;
        System.out.println(sum);
        System.out.print(5);
        System.out.print(5);
        */

        // inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + "! You are " + age + " years old!");

    }
}
