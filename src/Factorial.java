class Factorial {
    int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    public class ass {
        public static void main(String[] args) {
            Factorial f = new Factorial();

            int x = 4;
            System.out.println("Factorial of " + x + " is " + f.fact(x));
        }
    }
}