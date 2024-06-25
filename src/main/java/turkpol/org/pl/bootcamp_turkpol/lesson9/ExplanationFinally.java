package turkpol.org.pl.bootcamp_turkpol.lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExplanationFinally {

    public static void main(String[] args) {

        try{
            System.out.println("start ");
            System.exit(0);
        } catch (InputMismatchException e){
            // handling exception
            System.out.println("Please enter only digits");
        }
        catch (ArithmeticException e ){
            System.out.println("can not divide");

        }   finally {

            System.out.println("EXECUTED!");

            //close open streams

            // database
            // scanner
            // file
        }


    }
}
