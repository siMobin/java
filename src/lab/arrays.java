package lab;

import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int[] x = { 9, 1, 2, 3, 4, 5, 6, 7, 8 };
        Arrays.sort(x);

        System.out.println("Ascending Order");
        for (int y : x) {
            System.out.println(y);
        }

        System.out.println("\nDescending Order");
        for (int y = x.length; y > 0; y--) {
            System.out.println(y);
        }

        // 2D Array
        int w[][] = { { 12, 11, 13, 14, 15 }, { 22, 21, 23, 24, 25 } };

        System.out.println("\nMultidimensional Array");
        for (int v[] : w) {
            System.out.println();
            for (int m : v) {
                System.out.print(m + " ");
            }
        }

        // 3D Array
        int z[][][] = { { { 12, 11, 13, 14, 15 }, { 22, 21, 23, 24, 25 }, { 32, 31, 33, 34, 5 } } };

        System.out.print("\n\n3D Array");
        for (int v[][] : z) {
            System.out.println("");
            for (int m[] : v) {
                Arrays.sort(m); // Sort the array(optional)
                for (int is : m) {
                    System.out.print(is + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
