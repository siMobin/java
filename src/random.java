public class random {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 200);
        System.out.println(randomNumber);
        System.out.println();

        for (int i = 0; i < 10; i++) {
            int z = ((int) (Math.random() * 100) + 100);

            System.out.println(z);
        }
    }
}
