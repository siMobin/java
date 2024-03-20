package mid.abstracts;

public abstract class Car {
    public Car() {
        System.out.println("Driving...");
    }

    public abstract void speed();
}

abstract class WagonR extends Car {
    public abstract void musicPlayer();

    public WagonR() {
        System.out.println("Speeding up...");
    }

    public void speed() {
        for (int i = 0; i <= 5000; i++) {
            double speed = 0.099999 * (i + 1); // Calculate the current speed
            System.out.printf("\r%.1f", speed); // Print the current speed with carriage return
            try {
                Thread.sleep(1); // Delay for 1 millisecond
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nWarning! High Speed!");
    }
}

class MyCar extends WagonR {
    MyCar() {
        System.out.println("Red");
    }

    public void musicPlayer() {
        System.out.println("Playing music...");
    }
}

class Main {
    public static void main(String args[]) {
        // Car ob = new MyCar();
        WagonR ob = new MyCar();
        ob.musicPlayer();
        ob.speed();
    }
}