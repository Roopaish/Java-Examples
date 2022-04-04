import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.lang.Math;

public class DrawCircleRect extends JFrame {
  public static void main(String[] args) {
    new DrawCircleRect();
  }

  public DrawCircleRect() {
    setSize(600, 600);
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public Color getColor() {
    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);
    return randomColor;
  }

  public int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }

  @Override
  public void paint(Graphics g) {
    for (int i = 0; i < 100; i++) {
      // Polygons
      g.setColor(getColor());
      int[] x = { getRandomNumber(0, getWidth()), 2, 3 };
      int[] y = { 1, getRandomNumber(0, getHeight()), getRandomNumber(0, getHeight()) };
      g.fillPolygon(x, y, 3);

      g.setColor(getColor());
      int[] x1 = { getWidth(), getWidth() - 2, getRandomNumber(0, getWidth()) };
      int[] y1 = { getRandomNumber(0, getHeight()), getRandomNumber(0, getHeight()), getWidth() - 3 };
      g.fillPolygon(x1, y1, 3);
    }

    for (int i = 0; i < 20; i++) {
      // Filled Rect and Circles
      g.setColor(getColor());
      g.fillRect(getRandomNumber(1, getWidth()), getRandomNumber(1, getHeight()), getRandomNumber(10, 20),
          getRandomNumber(10, 20));
      g.setColor(getColor());
      g.fillArc(getRandomNumber(1, getWidth()), getRandomNumber(1, getHeight()), getRandomNumber(10, 20),
          getRandomNumber(10, 20), 0, 360);

      // Rect and Circles
      g.setColor(getColor());
      g.drawRect(getRandomNumber(1, getWidth()), getRandomNumber(1, getHeight()), getRandomNumber(10, 20),
          getRandomNumber(10, 20));
      g.setColor(getColor());
      g.drawArc(getRandomNumber(1, getWidth()), getRandomNumber(1, getHeight()), getRandomNumber(10, 20),
          getRandomNumber(10, 20), 0, 360);
    }

    // clear all;close all;
    // set(gcf,'color','w');axis equal off;hold on
    // for P=1:5
    // for Q=1:5;
    // V=ceil(9*rand(1,3));a=V(1);b=V(2);c=V(3);L=a*b*c;
    // S=zeros(1,L+1);
    // for n=0:L;
    // m=n/a+(n^2)/b+(n^3)/c;
    // S(n+1)=exp(2*pi*i*m);
    // end
    // S=cumsum(S);
    // M=mean(S);S=S-M;R=max(abs(S));S=S/R;
    // shi=3*(P+i*Q);
    // plot(shi+S);
    // text(real(shi),-1.5+imag(shi),num2str(V),'horizontalalignment','center');
    // end;
    // end;
  }
}
