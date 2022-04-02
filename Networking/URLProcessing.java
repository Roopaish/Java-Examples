import java.io.IOException;
import java.io.*;
import java.net.*;

public class URLProcessing {
  public static void main(String[] args) {
    try {
      // URL("https://www.roopaish.com/index.html?language=en&theme=dark#how-to-basic");
      URL url = new URL("https://www.rupeshbudhathoki.com.np/flutter-basics-cheatsheet/#stateless-vs-stateful-widget");
      System.out.println("URL = " + url.toString());
      System.out.println("Protocol = " + url.getProtocol());
      System.out.println("Domain name = " + url.getAuthority());
      System.out.println("Port name = " + url.getPort());
      System.out.println("Default Port = " + url.getDefaultPort());
      System.out.println("Path = " + url.getPath());
      System.out.println("Query = " + url.getQuery());
      System.out.println("Reference = " + url.getRef());
      System.out.println("File = " + url.getFile());

      System.out.println("Website Content: \n");
      URLConnection conn = url.openConnection();
      InputStream stream = conn.getInputStream();
      int i;
      while ((i = stream.read()) != -1) {
        System.out.print((char) i);
      }

    } catch (MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

}
