package mid;

public class inh {
    public int x, y = 9;
}

class in extends inh {

    public static void main(String[] args) {
        in i = new in();
        System.out.println(i.x);
        System.out.println(i.y);
        // System.out.println(x);
    }
}