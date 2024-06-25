package turkpol.org.pl.bootcamp_turkpol.lesson6.instructors.ismayil;

public class Student {

    //fields/attributes
    String id;
    String name;
    String surname;
    String faculty;



    //two constructors ---
    Student(){

    }

    public Student(String id, String name, String surname, String faculty) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
    }

    // ---


    // one method:
    public void displayDetails() { //
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Faculty: " + this.faculty);
    }



}
