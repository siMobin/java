package lab;

import java.io.PrintStream;
import java.util.Scanner;

public class Task {
    private static PrintStream O = System.out; // Override System.out

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Create a Scanner object
            O.print("Width= ");
            final float WIDTH = scanner.nextFloat();

            O.print("Height= ");
            final float HEIGHT = scanner.nextFloat();

            O.println("\nArea of the rectangle is: " + (WIDTH * HEIGHT));
            O.println("Parameter of the rectangle is: " + 2 * (WIDTH + HEIGHT));
        }
    }
}
