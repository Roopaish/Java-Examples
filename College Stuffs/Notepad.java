import javax.swing.*;
import java.awt.*;

class GUI extends JFrame {
  JMenu file, edit;
  JMenuBar bar;
  JMenuItem save, close, copy, cut, paste, select_all;
  JTextArea ta;

  public GUI() {
    setSize(500, 500);
    setVisible(true);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    bar = new JMenuBar();

    file = new JMenu("File");
    edit = new JMenu("Edit");
    bar.add(file);
    bar.add(bar);

    save = new JMenuItem("Save");
    close = new JMenuItem("Close");
    file.add(save);
    file.add(close);

    copy = new JMenuItem("Cut");
    copy = new JMenuItem("Copy");
    paste = new JMenuItem("Paste");
    select_all = new JMenuItem("Select All");
    edit.add(cut);
    edit.add(copy);
    edit.add(paste);
    edit.add(select_all);

    ta = new JTextArea();
    ta.setBounds(200, 200, 600, 500);
    add(ta);

    add(bar);
  }
}

public class Notepad {
  public static void main(String[] args) {
    new GUI();
  }
}
