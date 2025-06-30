
 import java.util.*;
public class gokul {


        public static String rev(String word) {
            // Base case: if the string is empty, return it.
            if (word.isEmpty()) {
                return word;
            } else {
                // Recursive step:
                // 1. Get the substring from the second character onwards.
                String subProblem = word.substring(1);
                // 2. Recursively reverse the substring.
                String subSolution = rev(subProblem);
                // 3. Append the first character of the original string to the end.
                String solution = subSolution + word.charAt(0);
                return solution;
            }
        }

    public static void main(String[] args) {

        // Call the rev method with the string "12345"
        String y = rev("12345");
        // Call the rev method with the string "gokul"
        String x = rev("gokul");

        // Print the results to the console
        System.out.println("The reverse of \"12345\" is: " + y); // Output: 54321
        System.out.println("The reverse of \"gokul\" is: " + x);  // Output: lukog





    }
}


