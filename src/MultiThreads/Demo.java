package MultiThreads;

class A extends Thread {
    Thread t = new Thread(this, "ass");

    public void run() {
        setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getName());

        try {
            sleep(998);
        } catch (InterruptedException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("Thread is running.." + getClass().getName());
    }
}

class B extends Thread {
    public void run() {
        setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread is running.." + getClass().getName());
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj1 = new B();
        A obj0 = new A();

        Thread lam0 = new Thread(() -> {
            Thread t = Thread.currentThread();

            Thread.yield();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                t.setName("lambda");
                t.setPriority(Thread.MIN_PRIORITY);
                System.out.println("Thread is running.." + t.getName());
            }
        });

        Thread lam1 = new Thread(() -> {
            Thread t = Thread.currentThread();

            try {
                Thread.sleep(999);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                t.setName("lambda - 1");
                t.setPriority(Thread.NORM_PRIORITY);
                System.out.println("Thread is running.." + t.getName());
            }
        });

        lam0.start(); // Should Execute last
        lam1.start();

        obj1.start();
        obj0.start();
    }
}
