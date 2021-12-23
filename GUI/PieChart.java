import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.*;

class PieChartUI extends JFrame {
  Map<String, Integer> map = new LinkedHashMap<String, Integer>();

  public PieChartUI(Map<String, Integer> map) {
    this.map = map;
    setSize(600, 600);
    setTitle("Bar Diagram");
    setVisible(true);
    setBackground(Color.black);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public Color getColor() {
    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);
    return randomColor;
  }

  @Override
  public void paint(Graphics g) {
    int i = 100, max = 0, startAngle = 0, startArc = 0;

    for (Map.Entry m : map.entrySet()) {
      max += (int) m.getValue();
    }

    for (Map.Entry m : map.entrySet()) {
      startArc = (int) m.getValue() * 360 / max;
      g.setColor(getColor());
      g.fillArc(200, 200, 200, 200, startAngle, startArc);
      // For gap between two segments
      g.fillRect(100, i, 10, 10);
      g.setColor(Color.white);
      g.drawString(String.format("%.2f", (int) m.getValue() * 1.0 * 100 / max) + "%", 50, i + 10);
      g.drawString(m.getKey().toString(), 120, i + 10);
      startAngle += (int) m.getValue() * 360 / max;
      i += 20;
    }
  }
}

public class PieChart {
  public static void main(String[] args) {
    Map<String, Integer> data = new LinkedHashMap<String, Integer>();
    data.put("Literature", 10);
    data.put("History", 20);
    data.put("Science", 35);
    data.put("Physics", 40);
    data.put("Chemistry", 50);
    data.put("Java", 30);
    data.put("Algorithms", 40);

    new PieChartUI(data);
  }
}
