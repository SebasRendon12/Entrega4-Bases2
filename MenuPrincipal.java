import javax.swing.*;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {

  private static final long serialVersionUID = 1L;
  public static String userName = "";
  public static String hash = "";

  public static void setCurrent(String nom, String dir) {
    userName = nom;
    hash = dir;
  }

  public static String[] getCurrent() {
    String[] lst = { userName, hash };
    return lst;
  }

  public MenuPrincipal(String titulo) {
    super(titulo); // titulo de la ventana
    this.setSize(600, 300);// tamaño de la ventana
    iniciarComponentes();
  }

  private void iniciarComponentes() {
    JPanel panel = new JPanel();
    panel.setLayout(null); // desactivando el diseño
    this.getContentPane().add(panel);

    JLabel title = new JLabel("Presione alguna de las Opciones a ejecutar");
    title.setBounds(175, 10, 300, 30);
    panel.add(title);
    JButton boton1 = new JButton("Primer punto");
    boton1.setBounds(40, 60, 200, 40);
    panel.add(boton1);
    JButton boton2 = new JButton("Segundo punto");
    boton2.setBounds(310, 60, 200, 40);
    panel.add(boton2);
    JButton boton3 = new JButton("Tercer punto");
    boton3.setBounds(40, 110, 200, 40);
    panel.add(boton3);
    JButton boton4 = new JButton("Cuarto punto");
    boton4.setBounds(310, 110, 200, 40);
    panel.add(boton4);
    JButton boton5 = new JButton("Quinto punto");
    boton5.setBounds(40, 160, 200, 40);
    panel.add(boton5);
    JButton boton6 = new JButton("Sexto punto");
    boton6.setBounds(310, 160, 200, 40);
    panel.add(boton6);

    ActionListener oyenteDeAccion = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        Punto1 datos = new Punto1("Primer punto");
        datos.setVisible(true);
      }
    };
    boton1.addActionListener(oyenteDeAccion);
    ActionListener oyenteDeAccion1 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        Punto2 puntos = new Punto2("Segundo punto");
        puntos.setVisible(true);
      }
    };
    boton2.addActionListener(oyenteDeAccion1);
    ActionListener oyenteDeAccion2 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        if (userName.isEmpty() && hash.isEmpty()) {
          Punto5 puntos = new Punto5("Tercer punto", false);
          puntos.setVisible(true);
        } else {
          Punto3 puntos = new Punto3("Tercer punto");
          puntos.setVisible(true);
        }
      }
    };
    boton3.addActionListener(oyenteDeAccion2);
    ActionListener oyenteDeAccion3 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        Punto4 puntos = new Punto4("Cuarto punto");
        puntos.setVisible(true);
      }
    };
    boton4.addActionListener(oyenteDeAccion3);
    ActionListener oyenteDeAccion4 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        Punto5 puntos = new Punto5("Quinto punto", false);
        puntos.setVisible(true);
      }
    };
    boton5.addActionListener(oyenteDeAccion4);
    ActionListener oyenteDeAccion5 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        if (userName.isEmpty() && hash.isEmpty()) {
          Punto5 puntos = new Punto5("Sexto punto", true);
          puntos.setVisible(true);
        } else {
          Punto6 puntos = new Punto6("Sexto punto");
          puntos.setVisible(true);
        }
      }
    };
    boton6.addActionListener(oyenteDeAccion5);
  }
}
