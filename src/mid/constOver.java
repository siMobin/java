package mid;

public class constOver {
    double vol;

    constOver() {
        System.out.println("empty constructor");
    }

    constOver(int x, int y, int z) {
        vol = x * y * z;
        System.out.println(vol);
    }

    constOver(double x, double y, double z) {
        vol = x * y * z;
        System.out.println(vol);
    }

}

class MainConstOver {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        constOver ob = new constOver();
        constOver ob0 = new constOver(10, 20, 30);
        constOver ob1 = new constOver(10, 20.54, 37.780);
    }
}