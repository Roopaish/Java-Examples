
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServer {
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(8080);
    System.out.println("Server is running");
    Socket s = ss.accept();
    System.out.println("Client is connected");

    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());

    // Greeting the client
    dos.writeUTF("Hello Client!");
    System.out.println("Client Says: " + dis.readUTF());

    // Square the number
    dos.writeUTF("Enter a number to find its square: ");
    int n = dis.readInt();
    dos.writeUTF("The square of " + n + " is " + n * n);

    dis.close();
    dos.close();
    s.close();
    ss.close();
  }
}