package overload;

public class ArithmeticOperation {

    public int arithmetic_operation(int a, int b) {
        return a + b;
    }

    public int arithmetic_operation(int a, int b, char minus) {
        return a - b;
    }

    public int arithmetic_operation(int a, int b, char multiply, char dummy) {
        return a * b;
    }

    public double arithmetic_operation(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        ArithmeticOperation ob = new ArithmeticOperation();

        System.out.println("10 + 5 = " + ob.arithmetic_operation(10, 5));
        System.out.println("10 - 5 = " + ob.arithmetic_operation(10, 5, '-'));
        System.out.println("10 * 5 = " + ob.arithmetic_operation(10, 5, '*', ' '));
        System.out.println("10 / 5 = " + ob.arithmetic_operation(10.0, 5.0));
    }
}