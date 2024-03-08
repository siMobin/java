package lab;

public class casting {
    public static void main(String[] args) {
        char a = 69;
        byte b = 10;

        int x = a + b;

        System.out.println(a);
        System.out.println(x);

        // Type Promotion
        x = 10;
        double y = 20.55;
        double xy = y * x;
        System.out.println(xy);
    }
}