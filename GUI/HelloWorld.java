import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {
  public static void main(String[] args) {
    new HelloWorld();
  }

  public HelloWorld() {
    setTitle("Hello World");
    setSize(400, 400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.CENTER));

    JLabel label = new JLabel("Hello World");
    label.setFont(new Font("Times New Roman", Font.BOLD, 40));
    add(label);
  }
}
