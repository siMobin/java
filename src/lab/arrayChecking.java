package lab;

public class arrayChecking {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 1, 2, 3, 0 };

        // Initialize variables to keep track of the largest and smallest numbers
        int min = numbers[0];
        int max = numbers[0];

        // Iterate through the array to find the smallest and largest numbers
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Difference between the largest and smallest numbers: " + (max - min));
    }
}
