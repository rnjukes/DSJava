package NO4;
/*
Ryan Jukes
4-20-25
NO4 
*/

import java.io.*;
import java.net.*;

public class ReadHandler implements Runnable {
    private BufferedReader in;

    public ReadHandler(Socket socket) {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            System.out.println("Error setting up input stream.");
        }
    }

  
    public void run() {
        String serverMessage;
        try {
            while ((serverMessage = in.readLine()) != null) {
                System.out.println(serverMessage);
            }
        } catch (IOException e) {
            System.out.println("Disconnected from server.");
        }
    }
}