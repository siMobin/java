// public class binaryHack {
//     @SuppressWarnings("unused")
//     public static void main(String[] args) {
//         for (int i = 1;; i++) {
//             System.out.print((int) (Math.random() * 2) + " ");
//         }
//     }
// }

public class binaryHack {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        for (int i = 1;; i++) {
            int randomNumber = (int) (Math.random() * 2); // Generate random 0 or 1
            String colorCode = "\u001B[32m"; // ANSI escape code for green color
            String resetCode = "\u001B[0m"; // ANSI escape code to reset color

            // Print the randomly generated number in green color
            System.out.print(colorCode + randomNumber + " " + resetCode);
        }
    }
}
