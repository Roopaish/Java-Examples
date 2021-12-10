// Java Program to copy a file from one directory to another directory

import java.io.*;
import java.util.Scanner;

class CopyFile {
  public static void main(String args[]) throws IOException {
    FileInputStream fis;
    FileOutputStream fos;
    try {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the name of the file(with absolute or relative path) to be copied: ");
      String filename = s.nextLine();
      System.out.println("Enter the name of the file(with absolute or relative path) to be copied to: ");
      String newFilename = s.nextLine();
      s.close();

      fis = new FileInputStream(filename);
      fos = new FileOutputStream(newFilename);

      System.out.println("Copying....");
      int i;
      while ((i = fis.read()) != -1) {
        fos.write(i);
      }
      System.out.println("Copy completed");
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
}