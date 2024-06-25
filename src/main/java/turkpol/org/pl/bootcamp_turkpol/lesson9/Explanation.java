package turkpol.org.pl.bootcamp_turkpol.lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Explanation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Turkpol Extranet:");

        System.out.println("Confirm you are not robot by answering 8+5 = ");
        // 13 // 55 // five //


        try{
            // we expect that is gonna throw exception


            int answer = sc.nextInt(); // thirteen
            System.out.println(10/0);
            if (answer == 13){
                System.out.println("confirmed");
            } else{
                System.out.println(" not confirmed, try again!");
            }

        } catch (InputMismatchException e){
            // handling exception
            System.out.println("Please enter only digits");
        }
        catch (ArithmeticException e ){
            System.out.println("can not divide");

        }   finally {
            System.out.println("ALWAYS EXECUTED");
            sc.close();
        }


    }
}
