import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class CalcGUI extends JFrame implements ActionListener {
  JButton add, sub;
  JTextField num1, num2, res;

  public CalcGUI() {
    setSize(600, 600);
    setVisible(true);
    // setLayout(new Bo);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    num1 = new JTextField("      ");
    num2 = new JTextField("      ");
    res = new JTextField("      ");

    add = new JButton("Add");
    sub = new JButton("Sub");
    add(num1);
    add(num2);
    add(res);
    add(add);
    add(sub);

    add.addActionListener(this);
    sub.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    int a = Integer.parseInt(num1.getText());
    int b = Integer.parseInt(num2.getText());
    int sum = a + b;
    int diff = a - b;
    if (e.getSource() == add) {
      res.setText("" + sum);
    }
    if (e.getSource() == sub) {
      res.setText("" + diff);
    }
  }
}

public class AddAndSub {
  public static void main(String[] args) {
    new CalcGUI();
  }
}
