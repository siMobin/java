package Extra;

import java.net.InetAddress;

public class Local {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println(localhost.getHostAddress());
            System.out.println(localhost.getHostName());

            System.out.println("\n\n");

            InetAddress[] outhost = InetAddress.getAllByName("forcesafesearch.google.com");
            System.out.println(outhost[0].getHostAddress());
            System.out.println(outhost[0].getHostName());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
