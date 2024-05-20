package com.soc.demo;

import java.io.*;
import java.net.*;

public class Client {
    /**
     * Establishes a connection to a server and sends and receives messages.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        String hostname = "localhost"; // Server address
        int port = 80; // Server port

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage;

            // Create a thread to read messages from the server
            Thread serverReaderThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = reader.readLine()) != null) {
                        System.out.println("Server: " + serverMessage);
                    }
                } catch (IOException e) {
                    System.out.println("Server disconnected.");
                }
            });

            serverReaderThread.start();

            // Main thread will read messages from the console and send them to the server
            System.out.println("Connected to the server @ " + hostname + ":" + port + "\n Type your message:");
            while ((clientMessage = consoleReader.readLine()) != null) {
                writer.println(clientMessage);
            }

        } catch (UnknownHostException e) {
            System.out.println("Server not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }
}
