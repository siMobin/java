package mid;

public class fact {
    public int facts(int n) {
        if (n == 1)
            return 1;
        else
            return facts(n - 1) * n;
    }
}

class factorial {
    public static void main(String args[]) {

        fact fact = new fact();
        System.out.println(fact.facts(5));
    }
}