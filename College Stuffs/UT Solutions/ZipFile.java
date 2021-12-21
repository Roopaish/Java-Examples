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

  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    String file;

    s.nextLine();

    System.out.println("\nEnter the location of files to be zipped: ");
    file = s.nextLine();
    createFile(new File(file));

    s.close();
  }
}