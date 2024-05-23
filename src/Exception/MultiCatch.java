package Exception;

public class MultiCatch {
    public static void main(String[] args) {
        int x[] = new int[15];
        int d = 0;

        try {
            x[6] = 24;
            int a = x[6] / d;
            System.out.println(a);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("finally");
        }
    }
}
