import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner name = new Scanner(System.in)) {
            System.out.println("What is your name?");
            String userName = name.nextLine();
            System.out.println("\nHello, " + userName);
        }
    }
}
