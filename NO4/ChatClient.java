package NO4;
/*
Ryan Jukes
4-20-25
NO4 
*/

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter server IP: ");
        String host = in.nextLine();
        System.out.print("Enter port: ");
        int port = in.nextInt();
        in.nextLine();

        try {
            Socket socket = new Socket(host, port);
            System.out.println("Connected to chat server.");

            new Thread(new ReadHandler(socket)).start();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                String userInput = in.nextLine();
                out.println(userInput);
            }

        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}