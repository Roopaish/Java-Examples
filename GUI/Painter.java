import java.awt.Graphics;

import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Color;

class GUI extends JFrame implements MouseMotionListener {
  public GUI() {
    setTitle("Painter with Java");
    setSize(500, 500);
    addMouseMotionListener(this);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    Graphics g = getGraphics();
    g.setColor(Color.blue);
    g.fillOval(e.getX(), e.getY(), 10, 10);
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
