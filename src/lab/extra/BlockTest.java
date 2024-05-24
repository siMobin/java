package lab.extra;

public class BlockTest {
    public static void main(String args[]) {
        int x, y;
        y = 10;
        // the target of this loop is a block
        for (x = 0; x <= 10; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y--;
        }
    }
}
