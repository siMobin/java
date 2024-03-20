package mid;

public class funOver {
    public int add() {
        System.out.print("not loaded");
        return -999999999;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double x, double y) {
        return x + y;
    }
}

class Main {
    public static void main(String args[]) {

        funOver ob = new funOver();
        System.out.println(ob.add());

        System.out.println(ob.add(11, 12));
        System.out.println(ob.add(11.04, 12.0));

    }
}