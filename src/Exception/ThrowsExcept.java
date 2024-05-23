package Exception;

class demo {
    public int div(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

public class ThrowsExcept {
    public static void main(String[] args) {

        demo obj = new demo();
        try {
            System.out.println(obj.div(10, 0));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
