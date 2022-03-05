import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServer {
  public static void main(String[] args) throws IOException{
    ServerSocket ss = new ServerSocket(8080);
    System.out.println("Server is running");
    Socket s = ss.accept();
    System.out.println("Client is connected");

    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    
    dos.writeUTF("Hello Client!");
    System.out.println("Client Says: " + dis.readUTF());

    dis.close();
    dos.close();
    s.close();
    ss.close();
  }
}