package turkpol.org.pl.bootcamp_turkpol.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Lesson7 {
    // Arrays
    // ArrayLists
    // Strings
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4 ,5};
//
//        System.out.println(numbers[0]);
//
//        for(int i=0; i<numbers.length; i++) {
//            System.out.println("Element at index " + i + ": " + numbers[i]);
//        }

        List<String> names = new ArrayList<>();
        names.add("Mustafa");
        names.add("Emirhan");
        names.add("Eyup");

//        for(int i=0; i<names.size(); i++) {
//            System.out.println("Element at index " + i + ": " + names.get(i));
//        }
//
//        names.remove("Eyup");
//        System.out.println("After removal: ");
//
//        for (String name : names) {
//            System.out.println(name);
//        }

        // arrays have fixed size, arraylists can dynamically change size
        // arrays are faster, because they don't have overhead of dynamic resizing
        // Arraylist is more flexible, easier to use dynamic data


//        String name = "MUSTAFA";
//        String lowercased = name.toLowerCase();
//        System.out.println(lowercased);
//        System.out.println(name.length());
//        System.out.println("Character at index 1:" + name.charAt(1));
//        System.out.println("Substring (0, 5): " + name.substring(0, 5));

        String name = "Emirhan"; // hold on location x13432432442352
        String reversed = reverseString(name); // hold on location l2345xfewr32423
        System.out.println("original: " + name);
        System.out.println("reversed: " + reversed);

        if (name.equals(reversed)) {
            System.out.println("problem");
        } else {
            System.out.println("not problem");
        }

    }

    private static String reverseString(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(name);
        reversed.insert(3, "mustafa");
        return reversed.toString();
    }
}
