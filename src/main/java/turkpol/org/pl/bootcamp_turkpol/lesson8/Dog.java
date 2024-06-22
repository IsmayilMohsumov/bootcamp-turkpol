package turkpol.org.pl.bootcamp_turkpol.lesson8;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("ham");
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }
//    String color = "white";

//    public void bark() {
//        System.out.println("Woof!");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Dog is eating");
//    }
//
//    public void printColor(String color) {
//        System.out.println(color);
//        System.out.println(this.color);
//        System.out.println(super.color);
//    }


}
