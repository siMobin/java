package com.soc.v0;

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        final String serverAddress = "localhost";
        final int port = 80;

        try (Socket socket = new Socket(serverAddress, port);
                BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server.");

            String clientMessage, serverMessage;
            while (true) {
                System.out.print("You: ");
                clientMessage = userInput.readLine();

                out.println(clientMessage);

                if ((serverMessage = serverInput.readLine()).equalsIgnoreCase("stop")) {
                    System.out.println("Server closed the connection.");
                    break;
                }
                System.out.println("Server: " + serverMessage);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
