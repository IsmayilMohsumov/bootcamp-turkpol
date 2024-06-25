package turkpol.org.pl.bootcamp_turkpol.lesson6.instructors.ismayil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Turkpol Extranet, what you want do :" +
                "\n 1.Add student");
                // 2. delete
                // 3.update
                // 4.change faculty
                // 5.so on so forth
                // Write to the file - > FileWriter

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("What is the id number:");
                String id = sc.next();

                System.out.println("What is the name:");
                String name = sc.next();

                System.out.println("What is the surname:");
                String surname  = sc.next();

                System.out.println("What is the faculty:");
                String faculty =  sc.next();

                System.out.println(id + " " +  name + " "+  surname +" "+ faculty);
            case 2:
                // implement

//                Student student = new Student();


        }




    }
}
