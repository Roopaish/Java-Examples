import java.io.*;
import java.util.Scanner;

public class ZIpFile {
  public static void main(String[] args) throws IOException {
    FileInputStream fis;
    FileOutputStream fos;
    try {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a file name: ");
      String fileName = s.next();
      fos = new FileOutputStream(fileName, true);
      fis = new FileInputStream(fileName);
      int i;
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }
}