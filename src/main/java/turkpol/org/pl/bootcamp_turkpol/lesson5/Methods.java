package turkpol.org.pl.bootcamp_turkpol.lesson5;

public class Methods {

    public static void main(String[] args) {


        mustafo(5);

    }


    public static void concating(String str){ //str = "Ismayil"
        String helloMessage = "Hello " + str; // Hello Ismayil
        System.out.println(helloMessage);

    }

    // access modifier
    // return type  -  data type or void
    // method name  -  performAndPrint
    // () parameters -
    // body


    //bad practice - it's not a good code

    //good practice

    //what is calling?
    //what is passing value to parameters?
    public int add(int a, int b) {
        int sum = a+b;
        print(sum);
        return sum;
    }

    public int multiply(){
        print(5);
        return 4;
    }

    public void print(int sum){
        System.out.println(sum);
    }


    // no return - *
    // method name - *
    // 1 parameter - String
    // body
    void test1 (String str)
    {

    }


    // return type - String *
    // method name - concating  *
    // 1 param - String *
    // body*

    // accept the parametr and add "Hello " and then return the value // concating("Ismayil") // Hello Ismayil.



    //method overloading - gives us the possibility to create two methods with the same name
    public static void mustafo(){

    }

    public static void mustafo(int a){

    }




    public static int subtract(int a, int b) { // 10 , 5 // 10 - 5
        return a - b;
    }

    public static void printResult(int result) {
        System.out.println("Result: " + result);
    }


    //clean code




}
