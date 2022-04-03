import java.awt.*;
import java.applet.*;

public class DisplayImage extends Applet {
  Image img;

  public static void main(String[] args) {
    new DisplayImage();
  }

  public DisplayImage() {
    img = getImage(getDocumentBase(), "java.jpg");
  }

  @Override
  public void paint(Graphics g) {
    g.drawImage(img, 10, 10, this);
  }
}
