package lab;

import java.util.Scanner;

public class manipulate {
    public static float a = 0, b = 0;

    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of a: ");
            float a = scanner.nextFloat();

            System.out.print("Enter the value of b: ");
            float b = scanner.nextFloat();

            System.out.println();

            System.out.println("Addition = " + (a + b));
            System.out.println("Production = " + (a * b));
            System.out.println("Defiance = " + (a - b));
            System.out.println("Quotient = " + (a / b));
            System.out.println("Remainder = " + (a % b));
        }
    }
}
