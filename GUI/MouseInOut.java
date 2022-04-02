import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GUI extends JFrame implements MouseListener, MouseMotionListener {
  JTextField a, b;

  public GUI() {
    setSize(600, 600);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    a = new JTextField("                                              ");
    b = new JTextField("                                              ");
    add(a);
    add(b);
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  public void mouseEntered(MouseEvent e) {
    a.setText("Mouse Entered");
  }

  public void mouseExited(MouseEvent e) {
    a.setText("Mouse Exited");
  }

  public void mouseClicked(MouseEvent e) {
  }

  public void mousePressed(MouseEvent e) {

  }

  public void mouseReleased(MouseEvent e) {

  }

  public void mouseDragged(MouseEvent e) {

  }

  public void mouseMoved(MouseEvent e) {
    int x = e.getX();
    int y = e.getY();
    b.setText("X: " + x + " Y:" + y);
  }

}

public class MouseInOut {
  public static void main(String[] args) {
    new GUI();
  }
}
