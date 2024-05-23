package Exception;

public class NestedTry {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            try {
                int c = a / b;
                System.out.println(c);

            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception");
            }

            try {
                // int x[] = new int[5];
                // x[5] = 10;
                //
                int x[] = { 15, 23, 63, 64, 85 };

                System.out.println(x[30]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException");
            } finally {
                System.out.println("finally");
            }

        } catch (Exception e) {
            System.out.println("Exception" + e);
        } finally {
            System.out.println("finally outside!");
        }

    }
}
