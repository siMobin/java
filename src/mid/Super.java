package mid;

public class Super {
    public static int x = 4;

    Super() {
        System.out.println("Super Constructor");
    }

    Super(int x) {
        System.out.println("int Super " + x);
    }

}

class Duper extends Super {
    Duper() {
        super(x);
        System.out.println("Sub Constructor");
    }

    public Duper(int i) {
        super();
        System.out.println("int Duper " + i);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Duper ob = new Duper(5);
    }
}
