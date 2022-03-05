import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {
  public static void main(String[] args) throws IOException {
    Socket s = new Socket("localhost", 8080);
    System.out.println("Client running!");

    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());

    System.out.println("Server says: " + dis.readUTF());
    dos.writeUTF("Hello Server!");

    dos.close();
    dis.close();
    s.close();
  }
}
