package MultiThreads;

public class NewThread extends Thread {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                // if (i == 4) {
                // stop();// deprecated
                // }

                System.out.println("Child Thread: " + i);
                // Thread.sleep(0);

            }
        } catch (Exception e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.\n");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 10; i > 0; i--) {
                // Thread.sleep(1000);

                System.out.println("Main Thread: " + i);
            }
        } catch (Exception e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.\n");
    }
}