import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet {
  // String msg = "";

  // public void init() {
  //  msg = "Hello";
  // }

  // public void start() {
  //  msg = msg + " World!";
  // }

  // public void paint(Graphics g) {
  //  g.drawString(msg, 50, 50);
  // }

  public void paint(Graphics g) {
    g.drawString("Hello World!", 50, 50);
  }
}
