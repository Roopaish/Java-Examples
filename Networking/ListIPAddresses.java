import java.io.*;
import java.net.*;
import java.util.*;

public class ListIPAddresses {

  public static void main(String args[]) throws SocketException {
    Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
    for (NetworkInterface net : Collections.list(nets))
      displayInterfaceInformation(net);
  }

  static void displayInterfaceInformation(NetworkInterface net) throws SocketException {
    // System.out.println("Display name: " + net.getDisplayName());
    // System.out.println("Name: " + net.getName());
    Enumeration<InetAddress> inetAddresses = net.getInetAddresses();
    for (InetAddress inetAddress : Collections.list(inetAddresses)) {
      System.out.println("InetAddress: " + inetAddress);
    }
  }
}