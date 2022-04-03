import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame implements ActionListener {
  JMenu file, edit;
  JMenuBar bar;
  JMenuItem save, open, copy, cut, paste, select_all;
  JTextArea ta;

  public GUI() {
    setSize(500, 500);
    setVisible(true);
    setLayout(new FlowLayout(FlowLayout.CENTER));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bar = new JMenuBar();
    setJMenuBar(bar);

    // File Save and Open
    file = new JMenu("File");
    bar.add(file);

    save = new JMenuItem("Save");
    open = new JMenuItem("Open");
    file.add(save);
    file.add(open);

    save.addActionListener(this);
    open.addActionListener(this);

    // Edit File
    edit = new JMenu("Edit");
    bar.add(edit);
    cut = new JMenuItem("Cut");
    copy = new JMenuItem("Copy");
    paste = new JMenuItem("Paste");
    select_all = new JMenuItem("Select All");
    edit.add(cut);
    edit.add(copy);
    edit.add(paste);
    edit.add(select_all);

    cut.addActionListener(this);
    copy.addActionListener(this);
    paste.addActionListener(this);
    select_all.addActionListener(this);

    // File editor
    ta = new JTextArea("", getHeight() / 10, getWidth() / 10);
    add(ta);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == cut) {
      ta.cut();
    } else if (e.getSource() == copy) {
      ta.copy();
    } else if (e.getSource() == select_all) {
      ta.selectAll();
    } else if (e.getSource() == paste) {
      ta.paste();
    } else if (e.getSource() == save) {
      // save the file in system

    } else if (e.getSource() == open) {
      // open the file from system

    }
  }
}

public class Notepad {
  public static void main(String[] args) {
    new GUI();
  }
}
