import java.io.*;
import java.util.Scanner;

public class ReadAndWrite {
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

      System.out.print("Do you want to write to file(1) or read from file(2)? ");
      int choice = s.nextInt();
      s.nextLine();
      switch (choice) {
        case 1: {
          System.out.println("Enter text to write to file: ");
          String input = s.nextLine();
          byte[] bInput = input.getBytes();
          fos.write(bInput);
          System.out.println("File written successfully");
          break;
        }
        case 2: {
          System.out.println("Reading from file: ");
          String output = "";
          while ((i = fis.read()) != -1) {
            output += (char) i;
          }
          System.out.println(output);
          break;
        }
        default:
          System.out.println("Invalid choice");
      }

      s.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }

}