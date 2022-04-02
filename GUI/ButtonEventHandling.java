import javax.swing.*;
import java.awt.*;

class GUI extends JFrame {
  public GUI() {
    setSize(500, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField tf = new JTextField("placeholder ");
    // tf.setSize(200,40);

    JButton b = new JButton("Submit");
    add(tf);
    add(b);

    // b.addActionListener(new CustomListener(tf, this));
    // b.addActionListener(new ActionListener() {
    //   public void actionPerformed(ActionEvent e) {
    //     String text = tf.getText().toUpperCase();
    //     tf.setText(text);

    //     tf.setBackground(Color.red);
    //     getContentPane().setBackground(Color.black);
    //     tf.setFont(new Font("Arial", Font.BOLD, 20));
    //   }
    // });
  }
}

// class CustomListener implements ActionListener {
// JTextField tf;
// JFrame f;

// public CustomListener(JTextField tf, JFrame f) {
// this.tf = tf;
// this.f = f;
// }

// public void actionPerformed(ActionEvent e) {
// // tf.setText("Button clicked");
// String text = tf.getText().toUpperCase();
// tf.setText(text);

// tf.setBackground(Color.red);
// f.getContentPane().setBackground(Color.black);
// tf.setFont(new Font("Arial", Font.BOLD, 20));
// }
// }

public class ButtonEventHandling {
  public static void main(String[] args) {
    new GUI();
  }
}
