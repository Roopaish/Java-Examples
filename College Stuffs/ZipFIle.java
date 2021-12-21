import java.io.*;
import java.util.Scanner;
import java.util.zip.*;

public class ZipFIle {
  static public void zipFile(File path) throws FileNotFoundException, IOException {
    System.out.println("\nZipping...");

    // List all the files in the folder
    File[] files = path.listFiles();

    if (files.length == 0) {
      throw new IllegalArgumentException();
    }

    FileOutputStream fos = new FileOutputStream("temp.zip");
    ZipOutputStream zos = new ZipOutputStream(fos);

    // Loop through the files and zip them
    for (File f : files) {
      FileInputStream fis = new FileInputStream(f);
      // Get each file name
      ZipEntry ze = new ZipEntry(f.getName());
      int content;
      zos.putNextEntry(ze);

      // Populate each file with data
      while ((content = fis.read()) != -1) {
        zos.write(content);
      }

      fis.close();
    }

    zos.close();
    System.out.println("\nZip Completed!");
  }

  static public void unzipFile(File file) throws IOException, FileNotFoundException {
    System.out.println("\nUnzipping.....");

    FileInputStream fis = new FileInputStream(file);
    ZipInputStream zis = new ZipInputStream(fis);
    ZipEntry ze = zis.getNextEntry();

    // Loop through ZipEntries (i.e. files in zip file)
    while (ze != null) {
      // Output folder with each fileName
      FileOutputStream fos = new FileOutputStream("Extract\\" + ze.getName());

      int content;
      while ((content = zis.read()) != -1) {
        fos.write(content);
      }

      ze = zis.getNextEntry();
      fos.close();
    }

    zis.close();
    System.out.println("\nUnzip Completed!");
  }

  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);

    int choice;
    String file;

    do {
      System.out.println("\nMenu \n1.Zip File \n2.Unzip File \n3.Exit");
      choice = s.nextInt();
      s.nextLine();

      switch (choice) {
        case 1:
          System.out.println("\nEnter source path to zip: ");
          file = s.nextLine();
          zipFile(new File(file));
          break;

        case 2:
          System.out.println("\nEnter file to unzip: ");
          file = s.nextLine();
          unzipFile(new File(file));
          break;

        case 3:
          System.out.println("\nExiting.....");
          break;

        default:
          System.out.println("\nWrong Input");

      }

    } while (choice != 3);

    s.close();
  }
}
