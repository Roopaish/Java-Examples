
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class TCPClient {
  public static void main(String[] args) throws IOException {
    Socket s = new Socket("localhost", 8080);
    System.out.println("Client running!");

    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());

    // Greeting the Server
    System.out.println("Server says: " + dis.readUTF());
    dos.writeUTF("Hello Server!");

    // Square a number
    System.out.println("Server says: " + dis.readUTF());
    Scanner scan = new Scanner(System.in);
    dos.writeInt(scan.nextInt());
    scan.nextLine();
    System.out.println("Server says: " + dis.readUTF());

    scan.close();
    dos.close();
    dis.close();
    s.close();
  }
}
