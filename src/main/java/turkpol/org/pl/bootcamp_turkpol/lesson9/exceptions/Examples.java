package turkpol.org.pl.bootcamp_turkpol.lesson9.exceptions;

public class Examples {


    public static void main(String[] args) {


        //Example
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (NullPointerException e) {
            System.out.println("CATCH BLOCK");
        } finally {
            System.out.println("FINALLY");
        }

//         Example
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block always executes.");
        }


        //Example
        try {
            System.out.println("Try block executed");
        } finally {
            System.out.println("Finally block executed");
        }


        //Example

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            try {
                int result = 10 / 0;
            } catch (ArithmeticException ae) {
                System.out.println("Nested exception in catch block: " + ae.getMessage());
            }
        } finally {
            System.out.println("This block always executes.");
            try {
                String str = null;
                str.length(); // This will cause NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Exception in finally block: " + e.getMessage());
            }
        }


        // Example
        try {
            System.out.println("Try block executed");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }


//        Example

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
            try {
                int[] nums = new int[5];
                nums[10] = 25;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception in finally block: " + e.getMessage());
            }
        }


    }


}
