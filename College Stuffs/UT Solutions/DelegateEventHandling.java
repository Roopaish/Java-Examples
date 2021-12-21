import javax.swing.*;
import java.awt.event.*;

class GUI extends JFrame {
  public GUI() {
    setSize(400, 500);
    setVisible(true);
    setLayout(null);

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JButton b = new JButton("Submit");

    t1.setBounds(20, 20, 100, 20);
    t2.setBounds(20, 100, 100, 20);
    b.setBounds(50, 60, 100, 20);
    add(t1);
    add(t2);
    add(b);

    b.addActionListener(new CustomListener(t1, t2));
  }
}

class CustomListener implements ActionListener {
  JTextField t1, t2;

  public CustomListener(JTextField t1, JTextField t2) {
    this.t1 = t1;
    this.t2 = t2;
  }

  public void actionPerformed(ActionEvent e) {
    int length = t1.getText().length();
    t2.setText("" + length);
  }
}

public class DelegateEventHandling {
  public static void main(String[] args) {
    new GUI();
  }
}
