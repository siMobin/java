package lab;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int array[][] = new int[3][4];

        for (int row[] : array) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) (Math.random() * 10);
                // System.out.print(row[i] + " ");
            }
            // System.out.println();
        }
        // System.out.println();

        for (int row[] : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
