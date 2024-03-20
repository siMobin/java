package mid;

public class VarArgs {
    public double add(double... x) {
        double sum = 0;
        for (double vr : x) {
            sum += vr;
        }
        return sum;
    }

    // TODO::
    public double sub(double... x) {
        double sum = 0;
        for (double vr : x) {
            sum -= vr;
        }
        return sum;
    }

    public double mul(double... x) {
        double sum = 1;
        for (double vr : x) {
            sum *= vr;
        }
        return sum;
    }

    // TODO::
    public double div(double x, double y) {
        return x / y;
    }
}

class add {
    public static void main(String[] args) {
        VarArgs cal = new VarArgs();

        System.out.println("Add...");
        System.out.println(cal.add(1, 2, 3, 4, 10.10));

        System.out.println("sub");
        System.out.println(cal.sub(10, 20));

        System.out.println("mul");
        System.out.println(cal.mul(2, 3, 6));

        System.out.println("div");
        System.out.println(cal.div(2, 10));
    }
}