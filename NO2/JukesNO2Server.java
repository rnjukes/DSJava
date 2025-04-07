package NO2;

/*
Ryan Jukes
4-1-25
NO2 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.net.*;

public class JukesNO2Server {
     public static void main(String[] args) {
        int port = 0;

        if (args.length < 1) {
            System.err.println("EchoServer <port number>");
            System.exit(1);
        }

        try {
            port = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("N/A port number");
            System.exit(1);
        }

        System.out.println("port");

        try (
                ServerSocket serverSocket = new ServerSocket(port);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
            System.out.println("Connected");
            String oneWayInput;
            while ((oneWayInput = in.readLine()) != null) {
                System.out.println("Received: " + oneWayInput);
                out.println(oneWayInput); 
                if (oneWayInput.equalsIgnoreCase("q")) {
                    System.out.println("Closing connection");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error " + port);
            System.out.println(e.getMessage());
        }

        System.out.println("End server");
    }
}