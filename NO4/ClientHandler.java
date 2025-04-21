package NO4;
/*
Ryan Jukes
4-20-25
NO4 
*/

import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String name;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        out.println(message);
    }

 
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Enter your name: ");
            name = in.readLine();
            System.out.println(name + " has joined the chat.");
            ChatServer.broadcast(name + " has joined the chat.", this);

            String message;
            while ((message = in.readLine()) != null) {
                ChatServer.broadcast(name + ": " + message, this);
            }
        } catch (IOException e) {
            System.out.println("Error with client " + name);
        } finally {
            try {
                if (socket != null) socket.close();
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e) {
                System.out.println("Error closing resources for client " + name);
            }
            ChatServer.removeClient(this);
        }
    }
}