


 import java.util.*;

public class gokul {

    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");

        // Printing the LinkedList
        System.out.println(l);  //[One, Two, Three, Four, Five]

        System.out.println(l.getFirst()); //One
        //getLast()

        System.out.println(l.contains("One"));

//clear()
        System.out.println("peek()=="+l.peek());

 }


 }


