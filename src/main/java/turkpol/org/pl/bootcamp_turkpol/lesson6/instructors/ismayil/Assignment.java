package turkpol.org.pl.bootcamp_turkpol.lesson6.instructors.ismayil;

public class Assignment {


    /*
    Task 1
Name: greet
Return Type: None (void)
Parameters: None
Logic Inside: Print "Hello, World!"
Task 2
Name: calculateSum
Return Type: None (void)
Parameters: Two integers (int a, int b)
Logic Inside: Print the sum of a and b
Task 3
Name: printName
Return Type: None (void)
Parameters: One string (String name)
Logic Inside: Print "Name: " followed by the value of name
Task 4
Name: isEven
Return Type: boolean
Parameters: One integer (int number)
Logic Inside: Return true if number is even, otherwise return false
Task 5
Name: displayDetails
Return Type: None (void)
Parameters: Two strings (String name, String address)
Logic Inside: Print "Name: " followed by name and "Address: " followed by address
Task 6
Name: multiply
Return Type: int
Parameters: Two integers (int x, int y)
Logic Inside: Return the product of x and y
Task 7
Name: printWelcomeMessage
Return Type: None (void)
Parameters: None
Logic Inside: Print "Welcome to the Java Programming Course!"


    */

    public void greet() {
        System.out.println("Hello, World!");
    }



    public void printName(String name) {
        System.out.println("Name: " + name);
    }

    public boolean isEven(int number) {// true or false
        return number % 2 == 0;
    }

    public void displayDetails(String name, String address) { //
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    public int multiply(int x, int y) { //
        return x * y;
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to the Java Programming Course!");
    }



}
