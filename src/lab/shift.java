package lab;

public class shift {
    public static void main(String[] args) {
        int x = 8;

        System.out.println("Left Shift " + (x << 2));
        System.out.println("Right Shift " + (x >> 2));
    }
}

// 8 in binary is 1000
// 8 << 2 = 1000 << 2 = 100000 = 32
// 8 >> 2 = 1000 >> 2 = 0010 = 2