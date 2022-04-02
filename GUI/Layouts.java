
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

import java.awt.event.*;

public class Layouts extends JFrame implements ActionListener {
  public static void main(String[] args) {
    new Layouts();
  }

  JPanel flow, border, grid, gridBag, card;
  CardLayout cardLayout;
  JLabel t, t1, t2, t3, t4;
  JButton a, b, c, d, e;
  JButton a1, b1, c1, d1, e1;
  JButton a2, b2, c2, d2, e2;
  JButton a3, b3, c3, d3, e3;
  JButton a4, b4, c4, d4, e4;

  public Layouts() {
    // Flow layout
    t = new JLabel("Flow Layout");
    add(t);

    a = new JButton("a");
    b = new JButton("b");
    c = new JButton("c");
    d = new JButton("d");
    e = new JButton("e");

    flow = new JPanel();
    flow.add(a);
    flow.add(b);
    flow.add(c);
    flow.add(d);
    flow.add(e);
    flow.setLayout(new FlowLayout(FlowLayout.CENTER));
    add(flow);

    // Border layout
    t1 = new JLabel("BorderLayout");
    add(t1);

    a1 = new JButton("NORTH");
    b1 = new JButton("SOUTH");
    c1 = new JButton("EAST");
    d1 = new JButton("WEST");
    e1 = new JButton("CENTER");

    border = new JPanel();
    border.setLayout(new BorderLayout());
    border.add(a1, BorderLayout.NORTH);
    border.add(b1, BorderLayout.SOUTH);
    border.add(c1, BorderLayout.WEST);
    border.add(d1, BorderLayout.EAST);
    border.add(e1, BorderLayout.CENTER);
    add(border);

    // Grid Layout
    t2 = new JLabel("Grid Layout");
    add(t2);

    a2 = new JButton("a2");
    b2 = new JButton("b2");
    c2 = new JButton("c2");
    d2 = new JButton("d2");
    e2 = new JButton("e2");

    grid = new JPanel();
    grid.add(a2);
    grid.add(b2);
    grid.add(c2);
    grid.add(d2);
    grid.add(e2);
    grid.setLayout(new GridLayout(2, 2, 5, 5));
    add(grid);

    // GridBagLyout
    t3 = new JLabel("GridBag Layout");
    add(t3);

    a3 = new JButton("a3");
    b3 = new JButton("b3");
    c3 = new JButton("c3");
    d3 = new JButton("d3");
    e3 = new JButton("e3");

    gridBag = new JPanel();
    gridBag.setLayout(new GridBagLayout());
    GridBagConstraints g = new GridBagConstraints();

    g.gridx = 0;
    g.gridy = 0;
    gridBag.add(a3, g);

    g.gridwidth = 2;
    g.gridx = 2;
    g.gridy = 0;
    g.fill = GridBagConstraints.HORIZONTAL;
    gridBag.add(b3, g);

    g.gridx = 1;
    g.gridy = 1;
    gridBag.add(c3, g);

    g.gridwidth = 2;
    g.gridx = 2;
    g.gridy = 2;
    g.fill = GridBagConstraints.HORIZONTAL;
    gridBag.add(d3, g);

    g.gridheight = 2;
    g.gridx = 3;
    g.gridy = 3;
    g.fill = GridBagConstraints.VERTICAL;
    gridBag.add(e3, g);
    add(gridBag);

    // CardLayout
    t4 = new JLabel("Card Layout");
    add(t4);

    a4 = new JButton("a4");
    b4 = new JButton("b4");
    c4 = new JButton("c4");
    d4 = new JButton("d4");
    e4 = new JButton("e4");

    card = new JPanel();
    card.add(a4);
    card.add(b4);
    card.add(c4);
    card.add(d4);
    card.add(e4);
    cardLayout = new CardLayout();
    card.setLayout(cardLayout);
    add(card);

    a4.addActionListener(this);
    b4.addActionListener(this);
    c4.addActionListener(this);
    d4.addActionListener(this);
    e4.addActionListener(this);

    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    cardLayout.next(card);
  }
}
