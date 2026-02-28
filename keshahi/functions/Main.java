import java.util.Random;

public class Main{
    // Defining a function
    public static void greet(String fname, String lname){
        System.out.println("Hello " + fname + " " + lname + "!");
    }

    /*
        Create functions for the following operations
        1. Add
        2. Subtract
        3. Multiply
        4. Divide
    */

    public static void main(String args[]){
        // Random r = new Random();
        // Calling a function
        greet("John", "Doe");
        greet("Smith", "Adam");
        greet("Dev", "Batista");
    }
}