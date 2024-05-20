package com.soc.demo;

import java.io.*;
import java.net.*;

public class Server {
    /**
     * The main method of the Server class that starts a server and listens for
     * incoming connections.
     *
     * @param args the command line arguments (not used in this case)
     */
    public static void main(String[] args) {
        int port = 80; // Server will listen on this port
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.print("Server started ");
            System.out.println("& listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                new ServerThread(socket).start();
            }
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    /**
     * Runs the server and listens for incoming connections. The server reads
     * messages from the client and sends them to the console,
     * and reads messages from the console and sends them to the client.
     *
     * @throws IOException if there is an error reading or writing to the streams
     */
    public void run() {
        try (InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {

            String serverMessage;

            // Create a thread to read messages from the client
            Thread clientReaderThread = new Thread(() -> {
                try {
                    String clientMessage;
                    while ((clientMessage = reader.readLine()) != null) {
                        System.out.println("Client: " + clientMessage);
                    }
                } catch (IOException e) {
                    System.out.println("Client disconnected.");
                }
            });

            clientReaderThread.start();

            // Main thread will read messages from the console and send them to the client
            while ((serverMessage = consoleReader.readLine()) != null) {
                writer.println(serverMessage);
            }

        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Server exception: " + e);
            e.printStackTrace();
        }
    }
}
