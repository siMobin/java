package overload;

import java.io.PrintStream;

class constructorOverload {
    double height, width, depth;

    constructorOverload(double h, double w, double d) {
        this.height = h;
        this.width = w;
        this.depth = d;
    }

    constructorOverload() {
        width = 10;
        height = 110;
        depth = 10;
    }

    constructorOverload(double l) {
        width = height = depth = l;

    }

    double volume() {
        return width * height * depth;
    }
}

public class ConstructorOverloading {
    private static PrintStream O = System.out;

    public static void main(String[] args) {
        double vol;
        // String s = "sfhlsfh";
        constructorOverload obj = new constructorOverload();

        obj = new constructorOverload();
        vol = obj.volume();
        O.println(vol);

        obj = new constructorOverload(10);
        vol = obj.volume();
        O.println(vol);

        obj = new constructorOverload(10, 20, 30);
        vol = obj.volume();
        O.println(vol);

    }
}
