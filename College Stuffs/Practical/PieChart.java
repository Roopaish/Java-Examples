import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;

import javax.swing.JFrame;

public class PieChart extends JFrame {
  static int width = 400;
  static int height = 400;
  static int[] data = { 40, 60, 35, 55 };
  static Color[] colors = { Color.red, Color.blue, Color.DARK_GRAY, Color.CYAN };

  public static void main(String[] args) {
    new PieChart();
  }

  public PieChart() {
    setSize(width, height);
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  @Override
  public void paint(Graphics g) {
    int max = Arrays.stream(data).max().getAsInt();
    int x = 10;
    int h;
    for (int i = 0; i < data.length; i++) {
      h = height * data[i] / max;
      g.setColor(colors[i]);
      g.fillRect(x, height - h, 50, h);
      x += 50;
    }

  }
}