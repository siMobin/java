package Exception;

public class MyExcept extends Exception {
    MyExcept(String xxx) {
        super(xxx + " from MyExcept");
        System.out.println("Line from MyExcept");
    }
}

class MyExceptDemo {
    public static void main(String args[]) {
        int s = 12;
        try {
            if (s > 10)
                throw new MyExcept("demo exception");
            System.out.println(s);
        } catch (MyExcept e) {
            System.out.println("Caught By try block");
            System.out.println(e.getMessage());
        }
    }
}
