package lab;

public class ArrayCalculation {
    public static void main(String[] args) {
        int[] Array = { 1, 2, 3, 4, 5, 4 };
        int sum = 0;

        for (int x : Array) {
            sum += x;
        }

        System.out.println("Sum: " + sum);

        // Average
        double average = (double) sum / Array.length;
        System.out.println("Average: " + average);
    }
}
