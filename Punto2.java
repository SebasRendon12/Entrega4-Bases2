import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.util.Pair;

public class Punto2 extends JFrame {

  private static final long serialVersionUID = 1L;

  public static Map<ArrayList<Integer>, java.awt.Color> rangocolores(Integer n, String a, String b, String c, String d,
      String e, String f, String g, String h, String i, String j) {
    Map<ArrayList<Integer>, java.awt.Color> colores = new HashMap<ArrayList<Integer>, java.awt.Color>();
    switch (n) {
      case 1:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        return colores;
      case 2:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        if (!(b.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          Integer rango2b = Integer.parseInt(b.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          color.add(rango2b);
          colores.put(color, java.awt.Color.YELLOW);
        } else {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          colores.put(color, java.awt.Color.YELLOW);
        }
        return colores;// code block
      case 3:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        if (b.split("a")[1].replace(" ", "") != "infinito") {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          Integer rango2b = Integer.parseInt(b.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          color.add(rango2b);
          colores.put(color, java.awt.Color.YELLOW);
        } else {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          colores.put(color, java.awt.Color.YELLOW);
        }
        if (!(c.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          Integer rango2c = Integer.parseInt(c.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          color.add(rango2c);
          colores.put(color, java.awt.Color.GRAY);
        } else {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          colores.put(color, java.awt.Color.GRAY);
        }
        return colores;
      case 4:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        if (b.split("a")[1].replace(" ", "") != "infinito") {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          Integer rango2b = Integer.parseInt(b.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          color.add(rango2b);
          colores.put(color, java.awt.Color.YELLOW);
        } else {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          colores.put(color, java.awt.Color.YELLOW);
        }
        if (!(c.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          Integer rango2c = Integer.parseInt(c.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          color.add(rango2c);
          colores.put(color, java.awt.Color.GRAY);
        } else {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          colores.put(color, java.awt.Color.GRAY);
        }
        if (!(d.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          Integer rango2d = Integer.parseInt(d.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          color.add(rango2d);
          colores.put(color, java.awt.Color.PINK);
        } else {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          colores.put(color, java.awt.Color.PINK);
        }
        return colores;
      case 5:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        if (b.split("a")[1].replace(" ", "") != "infinito") {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          Integer rango2b = Integer.parseInt(b.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          color.add(rango2b);
          colores.put(color, java.awt.Color.YELLOW);
        } else {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          colores.put(color, java.awt.Color.YELLOW);
        }
        if (!(c.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          Integer rango2c = Integer.parseInt(c.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          color.add(rango2c);
          colores.put(color, java.awt.Color.GRAY);
        } else {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          colores.put(color, java.awt.Color.GRAY);
        }
        if (!(d.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          Integer rango2d = Integer.parseInt(d.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          color.add(rango2d);
          colores.put(color, java.awt.Color.PINK);
        } else {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          colores.put(color, java.awt.Color.PINK);
        }
        if (!(e.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          Integer rango2e = Integer.parseInt(e.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          color.add(rango2e);
          colores.put(color, java.awt.Color.ORANGE);
        } else {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          colores.put(color, java.awt.Color.ORANGE);
        }
        return colores;
      case 6:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        if (b.split("a")[1].replace(" ", "") != "infinito") {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          Integer rango2b = Integer.parseInt(b.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          color.add(rango2b);
          colores.put(color, java.awt.Color.YELLOW);
        } else {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          colores.put(color, java.awt.Color.YELLOW);
        }
        if (!(c.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          Integer rango2c = Integer.parseInt(c.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          color.add(rango2c);
          colores.put(color, java.awt.Color.GRAY);
        } else {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          colores.put(color, java.awt.Color.GRAY);
        }
        if (!(d.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          Integer rango2d = Integer.parseInt(d.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          color.add(rango2d);
          colores.put(color, java.awt.Color.PINK);
        } else {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          colores.put(color, java.awt.Color.PINK);
        }
        if (!(e.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          Integer rango2e = Integer.parseInt(e.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          color.add(rango2e);
          colores.put(color, java.awt.Color.ORANGE);
        } else {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          colores.put(color, java.awt.Color.ORANGE);
        }
        if (!(f.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          Integer rango2f = Integer.parseInt(f.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          color.add(rango2f);
          colores.put(color, java.awt.Color.CYAN);
        } else {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          colores.put(color, java.awt.Color.CYAN);
        }
        return colores;
      case 7:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        if (b.split("a")[1].replace(" ", "") != "infinito") {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          Integer rango2b = Integer.parseInt(b.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          color.add(rango2b);
          colores.put(color, java.awt.Color.YELLOW);
        } else {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          colores.put(color, java.awt.Color.YELLOW);
        }
        if (!(c.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          Integer rango2c = Integer.parseInt(c.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          color.add(rango2c);
          colores.put(color, java.awt.Color.GRAY);
        } else {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          colores.put(color, java.awt.Color.GRAY);
        }
        if (!(d.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          Integer rango2d = Integer.parseInt(d.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          color.add(rango2d);
          colores.put(color, java.awt.Color.PINK);
        } else {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          colores.put(color, java.awt.Color.PINK);
        }
        if (!(e.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          Integer rango2e = Integer.parseInt(e.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          color.add(rango2e);
          colores.put(color, java.awt.Color.ORANGE);
        } else {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          colores.put(color, java.awt.Color.ORANGE);
        }
        if (!(f.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          Integer rango2f = Integer.parseInt(f.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          color.add(rango2f);
          colores.put(color, java.awt.Color.CYAN);
        } else {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          colores.put(color, java.awt.Color.CYAN);
        }
        if (!(g.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1g = Integer.parseInt(g.split("a")[0].replace(" ", ""));
          Integer rango2g = Integer.parseInt(g.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1g);
          color.add(rango2g);
          colores.put(color, java.awt.Color.MAGENTA);
        } else {
          Integer rango1g = Integer.parseInt(g.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1g);
          colores.put(color, java.awt.Color.MAGENTA);
        }
        return colores;
      case 8:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        if (b.split("a")[1].replace(" ", "") != "infinito") {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          Integer rango2b = Integer.parseInt(b.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          color.add(rango2b);
          colores.put(color, java.awt.Color.YELLOW);
        } else {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          colores.put(color, java.awt.Color.YELLOW);
        }
        if (!(c.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          Integer rango2c = Integer.parseInt(c.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          color.add(rango2c);
          colores.put(color, java.awt.Color.GRAY);
        } else {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          colores.put(color, java.awt.Color.GRAY);
        }
        if (!(d.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          Integer rango2d = Integer.parseInt(d.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          color.add(rango2d);
          colores.put(color, java.awt.Color.PINK);
        } else {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          colores.put(color, java.awt.Color.PINK);
        }
        if (!(e.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          Integer rango2e = Integer.parseInt(e.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          color.add(rango2e);
          colores.put(color, java.awt.Color.ORANGE);
        } else {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          colores.put(color, java.awt.Color.ORANGE);
        }
        if (!(f.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          Integer rango2f = Integer.parseInt(f.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          color.add(rango2f);
          colores.put(color, java.awt.Color.CYAN);
        } else {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          colores.put(color, java.awt.Color.CYAN);
        }
        if (!(g.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1g = Integer.parseInt(g.split("a")[0].replace(" ", ""));
          Integer rango2g = Integer.parseInt(g.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1g);
          color.add(rango2g);
          colores.put(color, java.awt.Color.MAGENTA);
        } else {
          Integer rango1g = Integer.parseInt(g.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1g);
          colores.put(color, java.awt.Color.MAGENTA);
        }
        if (!(h.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1h = Integer.parseInt(h.split("a")[0].replace(" ", ""));
          Integer rango2h = Integer.parseInt(h.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1h);
          color.add(rango2h);
          colores.put(color, java.awt.Color.green);
        } else {
          Integer rango1h = Integer.parseInt(h.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1h);
          colores.put(color, java.awt.Color.green);
        }
        return colores;
      case 9:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        if (b.split("a")[1].replace(" ", "") != "infinito") {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          Integer rango2b = Integer.parseInt(b.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          color.add(rango2b);
          colores.put(color, java.awt.Color.YELLOW);
        } else {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          colores.put(color, java.awt.Color.YELLOW);
        }
        if (!(c.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          Integer rango2c = Integer.parseInt(c.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          color.add(rango2c);
          colores.put(color, java.awt.Color.GRAY);
        } else {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          colores.put(color, java.awt.Color.GRAY);
        }
        if (!(d.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          Integer rango2d = Integer.parseInt(d.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          color.add(rango2d);
          colores.put(color, java.awt.Color.PINK);
        } else {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          colores.put(color, java.awt.Color.PINK);
        }
        if (!(e.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          Integer rango2e = Integer.parseInt(e.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          color.add(rango2e);
          colores.put(color, java.awt.Color.ORANGE);
        } else {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          colores.put(color, java.awt.Color.ORANGE);
        }
        if (!(f.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          Integer rango2f = Integer.parseInt(f.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          color.add(rango2f);
          colores.put(color, java.awt.Color.CYAN);
        } else {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          colores.put(color, java.awt.Color.CYAN);
        }
        if (!(g.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1g = Integer.parseInt(g.split("a")[0].replace(" ", ""));
          Integer rango2g = Integer.parseInt(g.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1g);
          color.add(rango2g);
          colores.put(color, java.awt.Color.MAGENTA);
        } else {
          Integer rango1g = Integer.parseInt(g.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1g);
          colores.put(color, java.awt.Color.MAGENTA);
        }
        if (!(h.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1h = Integer.parseInt(h.split("a")[0].replace(" ", ""));
          Integer rango2h = Integer.parseInt(h.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1h);
          color.add(rango2h);
          colores.put(color, java.awt.Color.green);
        } else {
          Integer rango1h = Integer.parseInt(h.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1h);
          colores.put(color, java.awt.Color.green);
        }
        if (!(i.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1i = Integer.parseInt(i.split("a")[0].replace(" ", ""));
          Integer rango2i = Integer.parseInt(i.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1i);
          color.add(rango2i);
          colores.put(color, java.awt.Color.BLUE);
        } else {
          Integer rango1i = Integer.parseInt(i.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1i);
          colores.put(color, java.awt.Color.BLUE);
        }
        return colores;
      case 10:
        if (!(a.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          Integer rango2a = Integer.parseInt(a.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          color.add(rango2a);
          colores.put(color, java.awt.Color.RED);
        } else {
          Integer rango1a = Integer.parseInt(a.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1a);
          colores.put(color, java.awt.Color.RED);
        }
        if (b.split("a")[1].replace(" ", "") != "infinito") {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          Integer rango2b = Integer.parseInt(b.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          color.add(rango2b);
          colores.put(color, java.awt.Color.YELLOW);
        } else {
          Integer rango1b = Integer.parseInt(b.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1b);
          colores.put(color, java.awt.Color.YELLOW);
        }
        if (!(c.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          Integer rango2c = Integer.parseInt(c.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          color.add(rango2c);
          colores.put(color, java.awt.Color.GRAY);
        } else {
          Integer rango1c = Integer.parseInt(c.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1c);
          colores.put(color, java.awt.Color.GRAY);
        }
        if (!(d.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          Integer rango2d = Integer.parseInt(d.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          color.add(rango2d);
          colores.put(color, java.awt.Color.PINK);
        } else {
          Integer rango1d = Integer.parseInt(d.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1d);
          colores.put(color, java.awt.Color.PINK);
        }
        if (!(e.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          Integer rango2e = Integer.parseInt(e.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          color.add(rango2e);
          colores.put(color, java.awt.Color.ORANGE);
        } else {
          Integer rango1e = Integer.parseInt(e.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1e);
          colores.put(color, java.awt.Color.ORANGE);
        }
        if (!(f.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          Integer rango2f = Integer.parseInt(f.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          color.add(rango2f);
          colores.put(color, java.awt.Color.CYAN);
        } else {
          Integer rango1f = Integer.parseInt(f.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1f);
          colores.put(color, java.awt.Color.CYAN);
        }
        if (!(g.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1g = Integer.parseInt(g.split("a")[0].replace(" ", ""));
          Integer rango2g = Integer.parseInt(g.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1g);
          color.add(rango2g);
          colores.put(color, java.awt.Color.MAGENTA);
        } else {
          Integer rango1g = Integer.parseInt(g.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1g);
          colores.put(color, java.awt.Color.MAGENTA);
        }
        if (!(h.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1h = Integer.parseInt(h.split("a")[0].replace(" ", ""));
          Integer rango2h = Integer.parseInt(h.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1h);
          color.add(rango2h);
          colores.put(color, java.awt.Color.green);
        } else {
          Integer rango1h = Integer.parseInt(h.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1h);
          colores.put(color, java.awt.Color.green);
        }
        if (!(i.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1i = Integer.parseInt(i.split("a")[0].replace(" ", ""));
          Integer rango2i = Integer.parseInt(i.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1i);
          color.add(rango2i);
          colores.put(color, java.awt.Color.BLUE);
        } else {
          Integer rango1i = Integer.parseInt(i.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1i);
          colores.put(color, java.awt.Color.BLUE);
        }
        if (!(j.split("a")[1].replace(" ", "").equals("infinito"))) {
          Integer rango1j = Integer.parseInt(j.split("a")[0].replace(" ", ""));
          Integer rango2j = Integer.parseInt(j.split("a")[1].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1j);
          color.add(rango2j);
          colores.put(color, java.awt.Color.WHITE);
        } else {
          Integer rango1j = Integer.parseInt(j.split("a")[0].replace(" ", ""));
          ArrayList<Integer> color = new ArrayList<Integer>();
          color.add(rango1j);
          colores.put(color, java.awt.Color.WHITE);
        }
        return colores;

      default:
        return colores;
    }
  }

  public Punto2(String titulo) {
    super(titulo); // titulo de la ventana
    this.setSize(700, 500);// tamaño de la ventana
    iniciarComponentes();
  }

  private void iniciarComponentes() {
    JPanel panel = new JPanel();
    panel.setLayout(null); // desactivando el dise�o
    this.getContentPane().add(panel);

    JLabel title = new JLabel("Hora y minuto \n inicial:");
    title.setBounds(50, 10, 300, 30);
    panel.add(title);
    JLabel colores = new JLabel("Numero de colores:");
    colores.setBounds(310, 10, 300, 30);
    panel.add(colores);
    JTextField color = new JTextField();
    color.setBounds(450, 10, 100, 30);
    panel.add(color);
    JLabel color1 = new JLabel("Rango color 1");
    color1.setBounds(310, 50, 300, 30);
    panel.add(color1);
    JTextField colorr1 = new JTextField();
    colorr1.setBounds(450, 50, 100, 30);
    panel.add(colorr1);
    JLabel color2 = new JLabel("Rango color 2");
    color2.setBounds(310, 90, 300, 30);
    panel.add(color2);
    JTextField colorr2 = new JTextField();
    colorr2.setBounds(450, 90, 100, 30);
    panel.add(colorr2);
    JLabel color3 = new JLabel("Rango color 3");
    color3.setBounds(310, 130, 300, 30);
    panel.add(color3);
    JTextField colorr3 = new JTextField();
    colorr3.setBounds(450, 130, 100, 30);
    panel.add(colorr3);
    JLabel color4 = new JLabel("Rango color 4");
    color4.setBounds(310, 170, 300, 30);
    panel.add(color4);
    JTextField colorr4 = new JTextField();
    colorr4.setBounds(450, 170, 100, 30);
    panel.add(colorr4);
    JLabel color5 = new JLabel("Rango color 5");
    color5.setBounds(310, 210, 300, 30);
    panel.add(color5);
    JTextField colorr5 = new JTextField();
    colorr5.setBounds(450, 210, 100, 30);
    panel.add(colorr5);
    JLabel color6 = new JLabel("Rango color 6");
    color6.setBounds(310, 250, 300, 30);
    panel.add(color6);
    JTextField colorr6 = new JTextField();
    colorr6.setBounds(450, 250, 100, 30);
    panel.add(colorr6);
    JLabel color7 = new JLabel("Rango color 7");
    color7.setBounds(310, 290, 300, 30);
    panel.add(color7);
    JTextField colorr7 = new JTextField();
    colorr7.setBounds(450, 290, 100, 30);
    panel.add(colorr7);
    JLabel color8 = new JLabel("Rango color 8");
    color8.setBounds(310, 330, 300, 30);
    panel.add(color8);
    JTextField colorr8 = new JTextField();
    colorr8.setBounds(450, 330, 100, 30);
    panel.add(colorr8);
    JLabel color9 = new JLabel("Rango color 9");
    color9.setBounds(310, 370, 300, 30);
    panel.add(color9);
    JTextField colorr9 = new JTextField();
    colorr9.setBounds(450, 370, 100, 30);
    panel.add(colorr9);
    JLabel color10 = new JLabel("Rango color 10");
    color10.setBounds(310, 410, 300, 30);
    panel.add(color10);
    JTextField colorr10 = new JTextField();
    colorr10.setBounds(450, 410, 100, 30);
    panel.add(colorr10);
    JLabel title1 = new JLabel("Hora y minuto \n final:");
    title1.setBounds(50, 50, 300, 30);
    panel.add(title1);
    JLabel title2 = new JLabel("Tanaño lado \n cuadricula:");
    title2.setBounds(50, 90, 300, 30);
    panel.add(title2);
    JButton boton1 = new JButton("Ver mapa por no. de \n transacciones");
    boton1.setBounds(30, 200, 250, 50);
    panel.add(boton1);
    JTextField inicio = new JTextField();
    inicio.setBounds(200, 10, 100, 30);
    panel.add(inicio);
    JTextField fiinal = new JTextField();
    fiinal.setBounds(200, 50, 100, 30);
    panel.add(fiinal);
    JTextField tamaño = new JTextField();
    tamaño.setBounds(200, 90, 100, 30);
    panel.add(tamaño);
    ActionListener oyenteDeAccion = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        Connection conn;
        Statement sentencia;
        ResultSet resultado;
        Map<Pair<Integer, Integer>, ArrayList<String>> transacciones = new HashMap<Pair<Integer, Integer>, ArrayList<String>>();
        try { // Se carga el driver JDBC-ODBC
          Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception err) {
          JOptionPane.showMessageDialog(null, "No se pudo cargar el driver JDBC");
          return;
        }
        try { // Se establece la conexi�n con la base de datos Oracle Express
          conn = DriverManager.getConnection(conexion.getConn(), conexion.getUser(), conexion.getPass());
          sentencia = conn.createStatement();
          System.out.println("conexion exitosa");
        } catch (SQLException err) {
          JOptionPane.showMessageDialog(null, "No hay conexión con la base de datos.");
          return;
        }
        try {
          resultado = sentencia
              .executeQuery("SELECT block_id, x, y, sender, recipient, value_usd, fee_usd , time FROM TRANSACCION");
          while (resultado.next()) {
            SimpleDateFormat format = new SimpleDateFormat("H:mm");
            Date parsed = null;
            Date fechainicio = null;
            Date fechafinal = null;
            String fecha = resultado.getString(8).toString();
            // System.out.println(resultado.getString(6).toString());
            try {
              if (fecha.split(" ").length > 1) {
                Integer x = 6 * (Integer.parseInt(resultado.getString(2).toString()));
                Integer y = 6 * (Integer.parseInt(resultado.getString(3).toString()));
                fechainicio = format.parse(inicio.getText());
                fechafinal = format.parse(fiinal.getText());
                parsed = format.parse(fecha.split(" ")[1]);
                Pair<Integer, Integer> coordenadas = new Pair<Integer, Integer>(x, y);
                ArrayList<String> elementos = new ArrayList<String>();
                if (fechainicio.compareTo(parsed) == 0) {
                  // System.out.println("inicio igual");
                  elementos.add(resultado.getString(1).toString());
                  elementos.add(resultado.getString(4).toString());
                  elementos.add(resultado.getString(5).toString());
                  elementos.add(resultado.getString(6).toString());
                  elementos.add(resultado.getString(7).toString());
                  elementos.add(resultado.getString(8).toString());
                  transacciones.put(coordenadas, elementos);
                } else if (parsed.compareTo(fechafinal) < 0 && parsed.compareTo(fechainicio) > 0) {
                  // System.out.println("antes de final");
                  elementos.add(resultado.getString(1).toString());
                  elementos.add(resultado.getString(4).toString());
                  elementos.add(resultado.getString(5).toString());
                  elementos.add(resultado.getString(6).toString());
                  elementos.add(resultado.getString(7).toString());
                  elementos.add(resultado.getString(8).toString());
                  transacciones.put(coordenadas, elementos);
                } else if (fechafinal.compareTo(parsed) == 0) {
                  // System.out.println("final igual");
                  elementos.add(resultado.getString(1).toString());
                  elementos.add(resultado.getString(4).toString());
                  elementos.add(resultado.getString(5).toString());
                  elementos.add(resultado.getString(6).toString());
                  elementos.add(resultado.getString(7).toString());
                  elementos.add(resultado.getString(8).toString());
                  transacciones.put(coordenadas, elementos);
                }
                // System.out.println(parsed);
              }

            } catch (ParseException e1) {
              e1.printStackTrace();
            }
            // java.sql.Date sql = new java.sql.Date(parsed.getTime());
            // System.out.println(sql);

            // Intento de traer el xml de solo la ciudad ingresada por el usuario en un
            // String
          }
        } catch (SQLException err) {
          JOptionPane.showMessageDialog(null, "Error al consultar en la base de datos " + err);
          return;
        }
        Map<ArrayList<Integer>, java.awt.Color> rangocolores = Punto2.rangocolores(Integer.parseInt(color.getText()),
            colorr1.getText(), colorr2.getText(), colorr3.getText(), colorr4.getText(), colorr5.getText(),
            colorr6.getText(), colorr7.getText(), colorr8.getText(), colorr9.getText(), colorr10.getText());
        GraficoPunto2 DrawWindow = new GraficoPunto2(rangocolores, Integer.parseInt(tamaño.getText()), transacciones);
        DrawWindow.setSize(800, 800);
        DrawWindow.setResizable(false);
        DrawWindow.setLocation(200, 50);
        DrawWindow.setTitle("Cradaditos malucos de manejar");
        DrawWindow.setVisible(true);
      }
    };
    boton1.addActionListener(oyenteDeAccion);
  }
}
