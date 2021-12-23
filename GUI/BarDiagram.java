import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.*;

class BarDiagramUI extends JFrame {
  Map<String, Integer> map = new HashMap<String, Integer>();

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
    int i = 0, maxHeight = 0;

    for (Map.Entry m : map.entrySet()) {
      if (maxHeight < (int) m.getValue())
        maxHeight = (int) m.getValue();
    }

    for (Map.Entry m : map.entrySet()) {
      g.setColor(getColor());
      g.fillRect(i = i + 50, 100 + maxHeight * 5 - (int) m.getValue() * 5, 50, (int) m.getValue() * 5);
      g.setColor(Color.white);
      g.drawString(m.getKey().toString(), i + 20, 80 + maxHeight * 5 - (int) m.getValue() * 5);
    }
  }
}

public class BarDiagram {
  public static void main(String[] args) {
    Map<String, Integer> data = new HashMap<String, Integer>();
    data.put("A", 10);
    data.put("B", 20);
    data.put("C", 30);
    data.put("D", 40);
    data.put("E", 50);
    data.put("Hello", 40);
    data.put("oh no", 30);


    new BarDiagramUI(data);
  }
}
