import java.awt.Graphics;

import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Color;

class GUI extends JFrame implements MouseMotionListener {
  public GUI() {
    setTitle("Painter with Java");
    addMouseMotionListener(this);
    setVisible(true);
    setLayout(null);
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    Graphics g = getGraphics();
    g.setColor(Color.blue);
    g.fillOval(e.getX(), e.getY(), 2, 2);
  }

  @Override
  public void mouseMoved(MouseEvent e) {

  }
}

public class Painter {
  public static void main(String[] args) {
    new GUI();
  }
}
