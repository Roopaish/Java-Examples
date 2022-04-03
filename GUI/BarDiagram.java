import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.*;

class BarDiagramUI extends JFrame {
  Map<String, Integer> map = new LinkedHashMap<String, Integer>();

  public BarDiagramUI(Map<String, Integer> map) {
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
    int x = 52, y, maxHeight = 0, width = 50, height;

    for (Map.Entry m : map.entrySet()) {
      if (maxHeight < (int) m.getValue())
        maxHeight = (int) m.getValue();
    }

    for (Map.Entry m : map.entrySet()) {
      // Bar diagram
      height = (int) m.getValue() * 5;
      y = 100 + maxHeight * 5 - height;
      g.setColor(getColor());
      g.fillRect(x, y, width, height);

      // Labeling
      g.setColor(Color.white);
      g.drawString(m.getKey().toString(), x, 90 + maxHeight * 5 - height);

      x += 52;
    }
  }
}

public class BarDiagram {
  public static void main(String[] args) {
    Map<String, Integer> data = new LinkedHashMap<String, Integer>();
    data.put("A", 10);
    data.put("B", 20);
    data.put("C", 35);
    data.put("D", 40);
    data.put("E", 50);
    data.put("F", 30);

    new BarDiagramUI(data);
  }
}
