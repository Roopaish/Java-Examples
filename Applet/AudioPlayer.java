import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.Action;

public class AudioPlayer extends Applet implements ActionListener {
  AudioClip audio;
  Button play, stop, loop;

  @Override
  public void init() {
    System.out.println("Initializing...");
    audio = getAudioClip(getDocumentBase(), "audio.au");

    play = new Button("Play");
    stop = new Button("Stop");
    loop = new Button("Loop");
    add(play);
    add(stop);
    add(loop);

    play.addActionListener(this);
    stop.addActionListener(this);
    loop.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == play) {
      audio.play();
    } else if (e.getSource() == stop) {
      audio.stop();
    } else if (e.getSource() == loop) {
      audio.loop();
    }
  }
}
