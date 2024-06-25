package turkpol.org.pl.bootcamp_turkpol.lesson6.tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.print("Enter filename to save student data: ");
        String filename = scanner.nextLine();

        while (running) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentID = scanner.nextLine();

                    Student newStudent = new Student(name, age, grade, studentID);
                    students.add(newStudent);
                    System.out.println("Student added successfully!");
                    saveStudentsToFile(students, filename);
                    break;

                case 2:
                    System.out.println("\nStudent List:");
                    for (Student student : students) {
                        student.displayInfo();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID to update: ");
                    String updateID = scanner.nextLine();
                    boolean found = false;

                    for (Student student : students) {
                        if (student.studentID.equals(updateID)) {
                            System.out.print("Enter new name: ");
                            String newName = scanner.nextLine();
                            System.out.print("Enter new age: ");
                            int newAge = scanner.nextInt();
                            scanner.nextLine();  // Consume newline
                            System.out.print("Enter new grade: ");
                            String newGrade = scanner.nextLine();
                            System.out.print("Enter new student ID: ");
                            String newStudentID = scanner.nextLine();

                            student.updateInfo(newName, newAge, newGrade, newStudentID);
                            System.out.println("Student information updated successfully!");
                            saveStudentsToFile(students, filename);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void saveStudentsToFile(ArrayList<Student> students, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Student student : students) {
                writer.write("Name: " + student.name + "\n");
                writer.write("Age: " + student.age + "\n");
                writer.write("Grade: " + student.grade + "\n");
                writer.write("Student ID: " + student.studentID + "\n");
                writer.write("\n");
            }
            System.out.println("Student data saved to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file: " + e.getMessage());
        }
    }
}

