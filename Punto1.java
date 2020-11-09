import javax.swing.JFrame;
import javax.swing.*;

public class Punto1 extends JFrame {

  private static final long serialVersionUID = 1L;

  public Punto1(String titulo) {
    super(titulo); // titulo de la ventana
    this.setSize(700, 300);// tamaño de la ventana
    iniciarComponentes();
  }

  private void iniciarComponentes() {
    JPanel panel = new JPanel();
    panel.setLayout(null); // desactivando el dise�o
    this.getContentPane().add(panel);
    JLabel title = new JLabel("Esta Parte Se Hace a mano :v");
    title.setBounds(200, 10, 300, 30);
    panel.add(title);
  }
}
