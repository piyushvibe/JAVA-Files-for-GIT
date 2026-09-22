import java.io.*;
import java.net.*;

public class client {

    public static void main(String[] args) {

        try {
            // Connect to server running on localhost at port 5000
            Socket socket = new Socket("localhost", 5001);

            // Receive data from server
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            // Send data to server
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true
            );

            // Send message to server
            output.println("Hello Server!");

            // Receive response from server
            String message = input.readLine();

            System.out.println("Server says: " + message);

            // Close connection
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}