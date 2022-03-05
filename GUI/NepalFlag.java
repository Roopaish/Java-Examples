import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

class FlagGUI extends JFrame {
  public FlagGUI() {
    setSize(500, 500);
    setVisible(true);
    setLayout(null);
    setBackground(Color.BLACK);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void paint(Graphics g) {
    g.setColor(Color.RED);
    int s = 100;

    // Upper triangle
    int[] x1 = { s, s + 150, s };
    int[] y1 = { s, s + 100, s + 100 };
    g.drawPolygon(x1, y1, 3);

    // Lower Triangle
    int[] x2 = { s, s + 150, s };
    int[] y2 = { s + 100, s + 100 + 100, s + 100 + 100 };
    g.drawPolygon(x2, y2, 3);

    // A Line
    g.drawLine(s, s+100, s, s+300);
  }
}

class NepalFlag {
  public static void main(String[] args) {
    new FlagGUI();
  }
}