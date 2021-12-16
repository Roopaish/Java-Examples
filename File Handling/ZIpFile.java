// Simple zip and unzip program

import java.io.*;
import java.util.Scanner;
import java.util.zip.*;

public class ZipFile {
  static public void createFile(File path) throws IOException {
    File[] files = path.listFiles();
    if (files.length == 0) {
      throw new IllegalArgumentException();
    }

    FileOutputStream fos = new FileOutputStream("temp.zip");
    ZipOutputStream zos = new ZipOutputStream(fos);

    for (File f : files) {
      FileInputStream fis = new FileInputStream(f);
      ZipEntry ze = new ZipEntry(f.getName());
      int content;
      zos.putNextEntry(ze);
      while ((content = fis.read()) != -1) {
        zos.write(content);
      }
      fis.close();
    }

    zos.close();
    System.out.println("\nCreated a zip file temp.zip");
  }

  static public void unZip(File path) throws IOException {
    File dest = new File("extract");
    FileInputStream fis = new FileInputStream(path);
    ZipInputStream zis = new ZipInputStream(fis);
    ZipEntry ze = zis.getNextEntry();

    while (ze != null) {
      FileOutputStream fos = new FileOutputStream(dest + "/" + ze.getName());
      int content;
      while ((content = zis.read()) != -1) {
        fos.write(content);
      }
      fos.close();
      ze = zis.getNextEntry();
    }

    zis.close();
    System.out.println("\nExtracted all the files");
  }

  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int choice;
    String file;

    do {
      System.out.println("Menu \n1.Zip Files \n2.Unzip File \n3.Exit");
      choice = s.nextInt();
      s.nextLine();

      switch (choice) {
        case 1:
          System.out.println("\nEnter the location of files to be zipped: ");
          file = s.nextLine();
          createFile(new File(file));
          break;

        case 2:
          System.out.println("\nEnter zipped file path: ");
          file = s.nextLine();
          unZip(new File(file));
          break;

        case 3:
          System.out.println("\nExiting...");
          break;

        default:
          System.out.println("\nWrong input!");
      }
    } while (choice != 3);

    s.close();
  }
}