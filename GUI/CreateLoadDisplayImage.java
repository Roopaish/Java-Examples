import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;

public class CreateLoadDisplayImage {
  public static void main(String[] args) {
    createImage();
    displayImage();
  }

  static void createImage() {
    try {
      BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);

      Graphics g = image.getGraphics();
      g.setColor(Color.red);
      g.fillRect(0, 0, 200, 150);
      g.setColor(Color.black);
      g.fillArc(0, 0, 100, 100, 0, 100);
      g.setColor(Color.CYAN);
      g.drawString("Hello", 100, 150);
      g.dispose();

      ImageIO.write(image, "png", new File("image.png"));

    } catch (IOException e) {
      System.out.println("Error: " + e);
    }
  }

  static void displayImage() {
    try {
      BufferedImage image = ImageIO.read(new File("image.png")); // load image
      ImageIcon icon = new ImageIcon(image);
      JLabel label = new JLabel(icon);
      JFrame frame = new JFrame();
      frame.add(label);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setSize(image.getWidth(), image.getHeight());
    } catch (IOException e) {
      System.out.println("Error: " + e);
    }
  }
}
