package Interface;

public class App implements Calculation {

    @Override
    public double add(double a, double b) {
        System.out.print("Addition of " + a + " and " + b + " = ");
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        System.out.print("Subtraction of " + a + " and " + b + " = ");
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        System.out.print("Multiplication of " + a + " and " + b + " = ");
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            System.out.print("Division of " + a + " and " + b + " = ");
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        App obj = new App();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.div(100, 11));
    }
}
