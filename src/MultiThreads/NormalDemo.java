package MultiThreads;

class NA {

    public void run() {
        System.out.println("Thread is running.." + getClass().getName());
    }
}

class NB {
    public void run() {
        System.out.println("Thread is running.." + getClass().getName());
    }
}

public class NormalDemo {
    public static void main(String[] args) {
        NA obj0 = new NA();
        NB obj1 = new NB();

        // Execute by the order
        obj0.run();
        obj1.run();
    }
}
