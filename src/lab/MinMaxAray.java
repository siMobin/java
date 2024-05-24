package lab;

// import java.util.Arrays;

public class MinMaxAray {
    public static void main(String[] args) {
        int[] Array = { 1, 2, 63, 4, 5, 6, 7, 8, 0, -9, 9, 10 };
        int min = Array[0];
        int max = Array[0];

        // Arrays.sort(Array);

        for (int i : Array) {
            // System.out.println(i);
            if (i < min)
                min = i;

            if (i > max)
                max = i;
        }

        System.out.println("min is " + min);
        System.out.println("max is " + max);
    }
}
