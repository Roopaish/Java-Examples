import java.io.FileInputStream;

public class ReadTextFile {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("hello.txt");

    int c;
    String text = "";
    while ((c = fis.read()) != -1) {
      text += (char) c;
    }
    System.out.println(text);

    fis.close();
  }
}
