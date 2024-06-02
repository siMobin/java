package com.soc.v0;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        int port = 80; // Server port

        try (ServerSocket serverSocket = new ServerSocket(port);
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Server started. Waiting for client...");

            String clientMessage, serverMessage;
            while (true) {
                clientMessage = in.readLine();
                System.out.println("Client: " + clientMessage);

                if (clientMessage.equalsIgnoreCase("stop")) {
                    System.out.println("Client closed the connection.");
                    break;
                }

                System.out.print("You: ");
                serverMessage = userInput.readLine();
                out.println(serverMessage);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
