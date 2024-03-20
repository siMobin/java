package mid;

class Box {
    double width;
    double height;
    double depth;

    public double vol() {
        System.out.print("Volume is: ");
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String args[]) {
        Box ob = new Box();
        ob.width = 101;
        ob.height = 2.30;
        ob.depth = 15.22222242;
        System.out.println(ob.vol());

        Box obj = new Box();
        obj.width = 19;
        obj.height = 29.656;
        obj.depth = 10;
        System.out.println(obj.vol());

        Box obk = ob;
        System.out.println(obk.vol());
    }
}
