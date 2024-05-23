package Exception;

class CountCatch {
    public static void main(String args[]) {
        int a = 0, b = 0, c = 0;
        int count = 0;

        for (int i = 1; i < 100; i++) {
            try {
                b = (int) (Math.random() * Integer.MAX_VALUE);
                c = (int) (Math.random() * Integer.MAX_VALUE);
                // System.out.println("b: " + b + " c: " + c);
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.print("Division by zero. ");
                a = 0; // set "a" to zero and continue...
                count++; // increment the catch counter
            }
            System.out.println("a: " + a);
        }
        System.out.println("count: " + count);
    }
}
