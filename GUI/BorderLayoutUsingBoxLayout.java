import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutUsingBoxLayout extends JFrame {
  public static void main(String[] args) {
    new BorderLayoutUsingBoxLayout();
  }

  public BorderLayoutUsingBoxLayout() {
    JButton a = new JButton("NORTH");
    JButton b = new JButton("SOUTH");
    JButton c = new JButton("WEST");
    JButton d = new JButton("CENTER");
    JButton e = new JButton("EAST");

    JPanel k = new JPanel();
    k.setLayout(new BoxLayout(k, BoxLayout.X_AXIS));
    k.add(c);
    k.add(d);
    k.add(e);

    add(a);
    add(k);
    add(b);

    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
    setVisible(true);
  }
}
