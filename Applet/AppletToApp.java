import javax.swing.BoxLayout;
import javax.swing.JFrame;
import java.awt.Graphics;

public class AppletToApp extends JFrame {
  public static void main(String[] args) {
    new AppletToApp();
  }

  public AppletToApp() {
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
    setVisible(true);
    // init();
    // start();
  }

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
