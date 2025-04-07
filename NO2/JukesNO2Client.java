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

public class JukesNO2Client {
    public static void main(String[] args) {
        String server = args[0];
        int port = 0;
        if (args.length != 2) {
            System.err.println("EchoClient <host name> <port number>");
            System.exit(1);
        }

        try {
            port = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("N/A port number");
            System.exit(1);
        }

        try (
            Socket echoSocket = new Socket(server, port);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(server+" "+port);
            System.out.println("Type 'q' to quit: ");

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("Message: " + in.readLine());

                if (userInput.equalsIgnoreCase("q")) {
                    System.out.println("Disconnecting");
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error with " + server);
            System.exit(1);
        }
    }
}