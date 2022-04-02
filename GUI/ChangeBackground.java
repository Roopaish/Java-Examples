import java.awt.*;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeBackground extends JFrame implements ActionListener {
  JButton r;
  JButton g;
  JButton b;

  public static void main(String[] args) {
    new ChangeBackground();
  }

  public ChangeBackground() {
    setSize(500, 600);

    r = new JButton("Red");
    g = new JButton("Green");
    b = new JButton("Blue");
    r.setBackground(Color.red);
    g.setBackground(Color.green);
    b.setBackground(Color.blue);

    add(r);
    add(g);
    add(b);

    r.addActionListener(this);
    g.addActionListener(this);
    b.addActionListener(this);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.CENTER));
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    Container c = getContentPane();
    if (e.getSource() == r) {
      c.setBackground(Color.red);
    } else if (e.getSource() == g) {
      c.setBackground(Color.green);
    } else {
      c.setBackground(Color.blue);
    }
  }
}
