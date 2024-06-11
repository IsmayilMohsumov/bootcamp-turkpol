package turkpol.org.pl.bootcamp_turkpol.lesson4;


public class Lesson4 {
    public static void main(String[] args) {
        /*
        * Operators
        * Conditional statements
        * Loops
        */

        // Operators
        // arithmetic operators
        /*
        int a = 10;
        int b = 5;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        // comparison operators
        boolean isGreater = a > b;
        boolean isEqual = a == b;
        boolean isLess = a < b;
        boolean isNotEqual = a != b;
        boolean isGreatOrEqual = a >= b;
        boolean isLessOrEqual = a <= b;

        // logical operators
        boolean isTrue = true;
        boolean isFalse = false;
        int number = 5;

        System.out.println(isTrue && isFalse); // false
        System.out.println(isTrue || isFalse); // true
        System.out.println(!isTrue); // false
        System.out.println(!isFalse); // true


        // Conditional statements

        int number = 0;

        if (number > 0) {
            System.out.println("The number is positive");
            if  (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        int day = 10;
        String dayName;

        switch(day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println(dayName);
        */

        // Loops
        int count = 1;
        do {
            // System.out.println(count);
            count++;
        } while (count <= 10);

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        } // O(n^2)

        // FizzBuzz Problem
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


    }
}
