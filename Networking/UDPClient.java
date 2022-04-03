import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
  public static void main(String[] args) throws Exception {
    DatagramSocket ds = new DatagramSocket();
    System.out.println("Client running!");

    byte[] sendData = new byte[1024];
    byte[] receivedData = new byte[1024];

    sendData = "Hello Server".getBytes();
    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getLocalHost(), 8080);
    ds.send(sendPacket);

    DatagramPacket receivePacket = new DatagramPacket(receivedData, receivedData.length);
    ds.receive(receivePacket);
    System.out.println("Server says: " + new String(receivePacket.getData()));

    ds.close();
  }
}
