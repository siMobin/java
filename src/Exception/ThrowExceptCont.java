package Exception;

public class ThrowExceptCont {
    public static void Demo() {
        try {
            throw new ArithmeticException("Intentional Exception");
        } catch (Exception e) {
            System.out.println("Caught inside");
            System.out.println("Divide by zero");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            Demo();
        } catch (Exception e) {
            System.out.println("Caught outside(Recaught)");
            System.out.println(e);
        }
    }
}
