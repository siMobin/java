package Exception;

public class ThrowExcept {
    public static void main(String[] args) {
        int x[] = new int[15];
        int d = 24;

        try {
            int target = 7;
            x[target] = 245;
            if (d > x[target])
                throw new Exception("Answer is too low");

            int a = x[target] / d;
            System.out.println(a);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
