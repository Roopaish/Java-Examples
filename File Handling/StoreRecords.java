// Using DataInputStream and DataOutputStream to store and read typed data

import java.io.*;
import java.util.Scanner;

public class StoreRecords {
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    // For writing to file
    FileOutputStream fos = new FileOutputStream("hello.txt");
    DataOutputStream dos = new DataOutputStream(fos);
    // To read from file
    FileInputStream fis = new FileInputStream("hello.txt");
    DataInputStream dis = new DataInputStream(fis);

    // Write or read to data
    int choice;
    do {
      System.out.println("Menu \n1.Write data \n2.Read data \n3.Exit");
      choice = s.nextInt();
      s.nextLine();
      int roll;
      String name, faculty;

      switch (choice) {
        case 1:
          System.out.println("\nEnter Data for a Student\n-----------------------");
          System.out.println("\nName : ");
          name = s.nextLine();
          System.out.println("\nRoll no : ");
          roll = s.nextInt();
          s.nextLine();
          System.out.println("\nFaculty : ");
          faculty = s.nextLine();

          dos.writeUTF(name);
          dos.writeInt(roll);
          dos.writeUTF(faculty);
          System.out.println("\nData written successfully!");
          break;

        case 2:
          while (dis.available() > 0) {
            name = dis.readUTF();
            roll = dis.readInt();
            faculty = dis.readUTF();

            System.out.println("\nName: " + name + " Roll no: " + roll + " Faculty: " + faculty);
          }
          break;

        case 3:
          System.out.println("\nExiting...");
          break;

        default:
          System.out.println("\nWrong input!");
      }

    } while (choice != 0);

    s.close();
    fos.close();
    dos.close();
    fis.close();
    dis.close();
  }
}
