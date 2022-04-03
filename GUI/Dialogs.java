import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Dialogs extends JFrame implements WindowListener {
  public static void main(String[] args) {
    new Dialogs();
  }

  public Dialogs() {
    setSize(500, 500);
    setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setVisible(true);

    // MessageDialog
    JOptionPane.showMessageDialog(this, "Hello World! This is MessageDialog!");
    JOptionPane.showMessageDialog(this, "Successfully Updated. This is MessageDialog with Alert Icon", "Alert",
        JOptionPane.WARNING_MESSAGE);

    // InputDialog
    String name = JOptionPane.showInputDialog(this, "Enter Name");

    // CustomDialog
    JDialog dialog = new JDialog(this, "Custom Dialog", true);
    dialog.setSize(300, 300);
    dialog.setLayout(new FlowLayout(FlowLayout.CENTER));
    dialog.add(new JLabel("Hello " + name.toUpperCase() + "! This is CustomDialog!"));
    dialog.add(new JButton("Fully Customizable"));
    dialog.setVisible(true);

    // ConfirmDialog
    addWindowListener(this);
  }

  @Override
  public void windowOpened(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowClosed(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowClosing(WindowEvent e) {
    // ConfirmDialog
    int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm",
        JOptionPane.YES_NO_OPTION);
    if (result == JOptionPane.YES_OPTION) {
      System.exit(0);
    }
  }

  @Override
  public void windowActivated(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowDeactivated(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowIconified(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowDeiconified(WindowEvent e) {
    // TODO Auto-generated method stub

  }
}
