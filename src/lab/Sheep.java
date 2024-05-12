package lab;

public class Sheep {
    static int sheepCount;

    /**
     *
     * @return sheepCount
     */
    static int getSheepCount() {
        return sheepCount;
    }

    /**
     * @param x
     */
    static void setSheepCount(int x) {
        sheepCount = x;
    }

    public static void main(String[] args) {
        setSheepCount(65);
        System.out.println(getSheepCount());
    }
}
