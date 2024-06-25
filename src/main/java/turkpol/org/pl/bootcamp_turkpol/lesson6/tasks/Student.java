package turkpol.org.pl.bootcamp_turkpol.lesson6.tasks;

public class Student {
    String name;
    int age;
    String grade;
    String studentID;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = "Not assigned";
        this.studentID = "N/A";
    }

    // Parameterized constructor
    public Student(String name, int age, String grade, String studentID) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentID = studentID;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentID);
    }

    // Method to update student information
    public void updateInfo(String name, int age, String grade, String studentID) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentID = studentID;
    }
}
