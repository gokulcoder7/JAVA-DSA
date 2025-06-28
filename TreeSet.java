// Java Program to Illustrate Removal of Elements
// in a TreeSet

// Importing utility classes
import java.util.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of NavigableSet
        // with reference to TreeSet class
        // Declaring object of string type
        NavigableSet<String> ts = new TreeSet<>();

        // Elements are added
        // using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        // Print and display initial elements of TreeSet
        System.out.println("Initial TreeSet " + ts);

        // Removing a specific existing element inserted
        // above
        ts.remove("B");

        // Printing the updated TreeSet
        System.out.println("After removing element " + ts);

        // Now removing the first element
        // using pollFirst() method
        ts.pollFirst();

        // Again printing the updated TreeSet
        System.out.println("After removing first " + ts);

        // Removing the last element
        // using pollLast() method
        ts.pollLast();

        // Lastly printing the elements of TreeSet remaining
        // to figure out pollLast() method
        System.out.println("After removing last " + ts);
    }
}








// Java code to Illustrate Working of TreeSet by
// Accessing the Element of TreeSet

// Importing utility classes
import java.util.*;

// Main class 
class GFG {

    // Main driver method 
    public static void main(String[] args)
    {
        // Creating a NavigableSet object  with 
      // reference to TreeSet class 
        NavigableSet<String> ts = new TreeSet<>();

        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");

         // Printing the elements inside the TreeSet object 
        System.out.println("Tree Set is " + ts);

        String check = "Geeks";

        // Check if the above string exists in
        // the treeset or not
        System.out.println("Contains " + check + " "
                           + ts.contains(check));

        // Print the first element in
        // the TreeSet
        System.out.println("First Value " + ts.first());

        // Print the last element in
        // the TreeSet
        System.out.println("Last Value " + ts.last());

        String val = "Geek";

        // Find the values just greater
        // and smaller than the above string
        System.out.println("Higher " + ts.higher(val));
        System.out.println("Lower " + ts.lower(val));
    }
}
