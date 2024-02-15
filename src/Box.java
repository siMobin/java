class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    /**
     * @param w
     * @param h
     * @param d
     */
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    /**
     * @return volume
     */
    double volume() {
        return width * height * depth;
    }
}

class constructor {
    /**
     * @param args
     */
    public static void main(String args[]) {
        double vol;
        // declare, allocate, and initialize Box objects
        Box mybox1 = new Box(10, 20, 10);
        Box mybox2 = new Box(3, 6, 9);

        // get volume of first box
        vol = mybox1.volume();
        extracted(vol);

        // get volume of second box
        vol = mybox2.volume();
        extracted(vol);
    }

    private static void extracted(double vol) {
        System.out.println("Volume is " + vol);
    }
}