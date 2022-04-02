
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPServer {
  public static void main(String[] args) throws Exception {
    DatagramSocket ds = new DatagramSocket(8080);
    System.out.println("Server running!");

    byte[] sendData = new byte[1024];
    byte[] receivedData = new byte[1024];

    DatagramPacket receivePacket = new DatagramPacket(receivedData, receivedData.length);
    ds.receive(receivePacket);
    System.out.println("CLient says: " + new String(receivePacket.getData()));

    sendData = "Hello Client".getBytes();
    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(),
        receivePacket.getPort());
    ds.send(sendPacket);

    ds.close();
  }
}
