import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import multichain.command.CommandElt;
import multichain.command.CommandManager;
import multichain.command.MultichainException;
import multichain.object.BalanceAssetGeneral;

public class Punto6 extends JFrame {

  private static final long serialVersionUID = 1L;

  public Punto6(String titulo) {
    super(titulo); // titulo de la ventana
    this.setSize(700, 300);// tamaño de la ventana
    JPanel panel = new JPanel();
    panel.setLayout(null); // desactivando el diseño
    this.getContentPane().add(panel);
    iniciarComponentes(panel);
  }

  private void iniciarComponentes(JPanel panel) {
    session current = new session(MenuPrincipal.getCurrent());
    panel.removeAll();
    panel.repaint();
    JLabel title = new JLabel("Presione alguna de las Opciones a ejecutar");
    title.setBounds(175, 10, 300, 30);
    panel.add(title);
    JButton boton1 = new JButton("Consultar saldo: " + current.username);
    boton1.setBounds(40, 60, 300, 40);
    panel.add(boton1);
    JButton boton2 = new JButton("Pagar");
    boton2.setBounds(350, 60, 200, 40);
    panel.add(boton2);
    JButton boton3 = new JButton("Cerrar sesión");
    boton3.setBounds(40, 120, 200, 40);
    panel.add(boton3);
    JButton boton4 = new JButton("Cerrar sesión y Salir");
    boton4.setBounds(350, 120, 200, 40);
    panel.add(boton4);
    Punto6 context = this;

    ActionListener oyenteDeAccion = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        MenuPrincipal.setCurrent("", "");
        Punto2 puntos = new Punto2("Segundo punto");
        puntos.setVisible(true);
        context.dispose();
      }
    };
    boton3.addActionListener(oyenteDeAccion);

    ActionListener oyenteDeAccion1 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        MenuPrincipal.setCurrent("", "");
        System.exit(0);
      }
    };
    boton4.addActionListener(oyenteDeAccion1);

    ActionListener oyenteDeAccion2 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        try {
          Object result = null;
          conexion connection = new conexion();
          CommandManager commandManager = new CommandManager("localhost", connection.getPuerto(), "multichainrpc",
              connection.getPassword());
          result = (List<BalanceAssetGeneral>) commandManager.invoke(CommandElt.GETADDRESSBALANCES, current.hash);
          if (((List<BalanceAssetGeneral>) result).size() > 0) {
            double cant = ((List<BalanceAssetGeneral>) result).get(0).getQty();
            System.out.println(result);
            DecimalFormat formatea = new DecimalFormat("###,###.##");
            JOptionPane.showMessageDialog(null, "El saldo de " + current.username + " es de " + formatea.format(cant)
                + " " + ((List<BalanceAssetGeneral>) result).get(0).getName());
          } else {
            JOptionPane.showMessageDialog(null, "No posee bdcoins");
          }
        } catch (MultichainException err) {
          JOptionPane.showMessageDialog(null, err.getMessage());
        }
      }
    };
    boton1.addActionListener(oyenteDeAccion2);

    ActionListener oyenteDeAccion3 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        panel.removeAll();
        panel.repaint();
        JLabel title = new JLabel("Pagar");
        title.setBounds(250, 10, 300, 30);
        panel.add(title);
        JLabel label1 = new JLabel("Usuario destino: ");
        label1.setBounds(30, 60, 100, 40);
        panel.add(label1);
        JTextField toUser = new JTextField();
        toUser.setBounds(140, 60, 400, 30);
        panel.add(toUser);
        JLabel label2 = new JLabel("Cantidad: ");
        label2.setBounds(30, 100, 100, 40);
        panel.add(label2);
        JTextField cant = new JTextField();
        cant.setBounds(140, 100, 400, 30);
        panel.add(cant);
        JButton boton12 = new JButton("Pagar");
        boton12.setBounds(240, 140, 200, 40);
        panel.add(boton12);

        ActionListener oyenteDeAccion1 = new ActionListener() {
          @Override
          public void actionPerformed(java.awt.event.ActionEvent e) {
            if (!toUser.getText().isEmpty() && !cant.getText().isEmpty()) {
              try {
                Double coins = 0.0;
                String ToHash = "";
                try {
                  coins += Double.valueOf(cant.getText());
                } catch (Exception ers) {
                  JOptionPane.showMessageDialog(null, "Cantidad inválida");
                }
                Object result = null;
                conexion connection = new conexion();
                try {
                  Connection conn;
                  Statement sentencia;
                  try { // Se carga el driver JDBC-ODBC
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                  } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "No se pudo cargar el driver JDBC");
                    return;
                  }
                  try {
                    conn = DriverManager.getConnection(conexion.getConn(), conexion.getUser(), conexion.getPass());
                    sentencia = conn.createStatement();
                  } catch (SQLException err) {
                    JOptionPane.showMessageDialog(null, "No hay conexión con la base de datos.");
                    return;
                  }
                  try {
                    ResultSet resultado = sentencia.executeQuery(
                        "select direccion from usuario where nombre_usuario = '" + toUser.getText() + "'");
                    if (resultado.next()) {
                      ToHash = resultado.getString("direccion");
                      CommandManager commandManager = new CommandManager("localhost", connection.getPuerto(),
                          "multichainrpc", connection.getPassword());
                      Map<String, Double> basket = new HashMap<>();
                      basket.put("bdcoin", coins);
                      result = commandManager.invoke(CommandElt.SENDFROM, current.hash, ToHash, basket);
                      System.out.println(result);
                      JOptionPane.showMessageDialog(null, "Pago exitoso");
                      iniciarComponentes(panel);
                    } else {
                      JOptionPane.showMessageDialog(null, "El usuario al que intenta enviar bdcoins no existe");
                    }
                  } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage());
                  } catch (MultichainException err) {
                    JOptionPane.showMessageDialog(null, err.getReason());
                    iniciarComponentes(panel);
                  }
                } catch (Exception error) {
                  JOptionPane.showMessageDialog(null, error.getMessage());
                }
              } catch (Exception err) {
                JOptionPane.showMessageDialog(null, err.getMessage());
              }
            } else {
              JOptionPane.showMessageDialog(null, "Debe indicar el usuario destino y la cantidad");
            }
          }
        };
        boton12.addActionListener(oyenteDeAccion1);
      }
    };
    boton2.addActionListener(oyenteDeAccion3);

  }

  class session {
    public session(String[] current) {
      username = current[0];
      hash = current[1];
    }

    String username;
    String hash;
  }
}