package mid;

public class Box2 {
    double width;
    double height;
    double depth;

    public Box2(double width, double h, double d) {
        this.width = width;
        height = h;
        depth = d;
    }

    public double vol() {
        System.out.print("Volume is: ");
        return width * height * depth;
    }
}

class MainClass {

    public static void main(String[] args) {
        Box2 ob = new Box2(1.34323, 20, 30);
        System.out.println(ob.vol());
    }
}
