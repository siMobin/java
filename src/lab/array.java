package lab;

public class array {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int k = 0;

        for (int j = 0; j < numbers.length; j++) {
            System.out.print("[" + numbers[j] + "]");
            k = k + numbers[j];
        }
        System.out.println("\nSum = " + k);

        // // or (foreach)
        // for (int i : numbers) {
        // System.out.print("[" + i + "]");
        // }
    }
}
