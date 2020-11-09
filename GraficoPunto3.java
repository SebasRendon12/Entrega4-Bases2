import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;

public class GraficoPunto3 extends JFrame {

  private static final long serialVersionUID = 1L;
  private static Integer salto = 0;
  private static ArrayList<Float> ventas;

  private Float float1;

  public GraficoPunto3(ArrayList<Float> a) {
    ventas = a;
  }

  public void paint(Graphics g) {

    int x = 800;
    int y = 600;
    // iterando mapa
    g.setColor(Color.black);
    g.drawLine(50, 50, 50, 550);
    g.drawLine(50, 550, 750, 550);
    System.out.println(ventas);
    Set<Float> quipu = new HashSet<Float>(ventas);
    for (Float key : quipu) {
      int a = Math.round(key / 3500);
      if (Collections.frequency(ventas, key) > 1) {
        g.setColor(Color.red);
        g.drawOval(750 - a - 100, 550 - a - 100, 25, 25);
        g.drawString("( " + key + ", " + Collections.frequency(ventas, key) + " )", 750 - a - 100, 450 - a - 100);
      } else {
        g.setColor(Color.blue);
        g.drawOval(750 - a - 100, 550 - a - 100, 25, 25);
        g.drawString("( " + key + " )", 750 - a - 100, 450 - a - 100);
      }

    }

  }
}
