import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import multichain.command.CommandElt;
import multichain.command.CommandManager;
import multichain.command.MultichainException;

public class Punto5 extends JFrame {

  private static final long serialVersionUID = 1L;

  public Punto5(String titulo, boolean isSix) {
    super(titulo); // titulo de la ventana
    this.setSize(700, 300);// tamaño de la ventana
    JPanel panel = new JPanel();
    panel.setLayout(null); // desactivando el diseño
    this.getContentPane().add(panel);
    iniciarComponentes(panel, isSix);
  }

  private void iniciarComponentes(JPanel panel, boolean isSix) {
    panel.removeAll();
    panel.repaint();
    JLabel title = new JLabel("Presione alguna de las Opciones a ejecutar");
    title.setBounds(175, 10, 300, 30);
    panel.add(title);
    JButton boton1 = new JButton("Iniciar sesión");
    boton1.setBounds(40, 60, 200, 40);
    panel.add(boton1);
    JButton boton2 = new JButton("Registrarse");
    boton2.setBounds(310, 60, 200, 40);
    panel.add(boton2);
    Punto5 context = this;

    // ---------------- INICIAR SESION ---------------------
    ActionListener oyenteDeAccion = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        panel.removeAll();
        panel.repaint();
        JLabel title = new JLabel("Log-In");
        title.setBounds(250, 10, 300, 30);
        panel.add(title);
        JLabel label1 = new JLabel("Usuario: ");
        label1.setBounds(30, 60, 100, 40);
        panel.add(label1);
        JTextField username = new JTextField();
        username.setBounds(120, 60, 400, 30);
        panel.add(username);
        JLabel label2 = new JLabel("Contraseña: ");
        label2.setBounds(30, 100, 100, 40);
        panel.add(label2);
        JTextField password = new JTextField();
        password.setBounds(120, 100, 400, 30);
        panel.add(password);
        JButton boton12 = new JButton("Iniciar sesión");
        boton12.setBounds(240, 140, 200, 40);
        panel.add(boton12);

        ActionListener oyenteDeAccion = new ActionListener() {
          @Override
          public void actionPerformed(java.awt.event.ActionEvent e) {
            if (!username.getText().isEmpty() && !password.getText().isEmpty()) {
              Connection conn;
              Statement sentencia;
              try { // Se carga el driver JDBC-ODBC
                Class.forName("oracle.jdbc.driver.OracleDriver");
              } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el driver JDBC");
                return;
              }
              try {
                conexion connection = new conexion();
                conn = DriverManager.getConnection(connection.getConn(), connection.getUser(), connection.getPass());
                sentencia = conn.createStatement();
              } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "No hay conexión con la base de datos.");
                return;
              }

              try {
                ResultSet resultado = sentencia.executeQuery(
                    "select nombre_usuario as nombre, contrasena, direccion from usuario where nombre_usuario = '"
                        + username.getText() + "'");
                boolean exist = false;
                usuario user = new usuario();
                while (resultado.next()) {
                  exist = true;
                  user.username = resultado.getString("nombre");
                  user.password = resultado.getString("contrasena");
                  user.hash = resultado.getString("direccion");
                }
                if (!exist) {
                  JOptionPane.showMessageDialog(null, "El usuario no está registrado, registrese e intente nuevamente");
                } else {
                  if (username.getText().equals(user.username) && password.getText().equals(user.password)) {
                    MenuPrincipal.setCurrent(user.username, user.hash);
                    if (isSix) {
                      Punto6 puntos = new Punto6("Sexto punto");
                      puntos.setVisible(true);
                    } else {
                      Punto3 puntos = new Punto3("Tercer punto");
                      puntos.setVisible(true);
                    }
                    context.dispose();
                  } else {
                    JOptionPane.showMessageDialog(null,
                        "Contraseña inválida, no intente mas de 5 veces o su pc será formateado");
                  }
                }
              } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, e1.getSQLState());
              }
            } else {
              JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña estan vacíos");
            }
          }
        };
        boton12.addActionListener(oyenteDeAccion);
      }
    };
    boton1.addActionListener(oyenteDeAccion);

    // ------------- REGISTRARSE -------------------
    ActionListener oyenteDeAccion1 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        panel.removeAll();
        panel.repaint();
        JLabel title = new JLabel("Sign-In");
        title.setBounds(250, 10, 300, 30);
        panel.add(title);
        JLabel label1 = new JLabel("Usuario: ");
        label1.setBounds(30, 60, 100, 40);
        panel.add(label1);
        JTextField username = new JTextField();
        username.setBounds(120, 60, 400, 30);
        panel.add(username);
        JLabel label2 = new JLabel("Contraseña: ");
        label2.setBounds(30, 100, 100, 40);
        panel.add(label2);
        JTextField password = new JTextField();
        password.setBounds(120, 100, 400, 30);
        panel.add(password);
        JButton boton12 = new JButton("Registrarse");
        boton12.setBounds(240, 140, 200, 40);
        panel.add(boton12);

        ActionListener oyenteDeAccion = new ActionListener() {
          @Override
          public void actionPerformed(java.awt.event.ActionEvent e) {

            if (!username.getText().isEmpty() && !password.getText().isEmpty()) {
              if (username.getText().length() < 21 && password.getText().length() < 21) {
                Connection conn;
                Statement sentencia;
                try { // Se carga el driver JDBC-ODBC
                  Class.forName("oracle.jdbc.driver.OracleDriver");
                } catch (Exception error) {
                  JOptionPane.showMessageDialog(null, "No se pudo cargar el driver JDBC");
                  return;
                }
                try {
                  conexion connection = new conexion();
                  conn = DriverManager.getConnection(connection.getConn(), connection.getUser(), connection.getPass());
                  sentencia = conn.createStatement();
                } catch (SQLException err) {
                  JOptionPane.showMessageDialog(null, "No hay conexión con la base de datos.");
                  return;
                }
                boolean available = false;
                try {
                  ResultSet resultado = sentencia
                      .executeQuery("select * from usuario where nombre_usuario = '" + username.getText() + "'");
                  if (resultado.next()) {
                    JOptionPane.showMessageDialog(null, "Usuario: " + username.getText() + " ya existe.");
                  } else {
                    available = true;
                  }
                } catch (SQLException e1) {
                  JOptionPane.showMessageDialog(null, e1.getMessage());
                }
                if (available) {
                  String newAddress = "";
                  try {
                    Object addressResult = null;
                    conexion connection = new conexion();
                    CommandManager commandManager = new CommandManager("localhost", connection.getPuerto(),
                        "multichainrpc", connection.getPassword());
                    addressResult = commandManager.invoke(CommandElt.GETNEWADDRESS);
                    newAddress = (String) addressResult;
                    System.out.println(addressResult);
                    addressResult = commandManager.invoke(CommandElt.GRANT, newAddress, "connect,send,receive");
                    System.out.println(addressResult);
                    ResultSet resultado = sentencia.executeQuery("insert into usuario VALUES ('" + username.getText()
                        + "','" + password.getText() + "','" + newAddress + "')");
                    if (resultado.next()) {
                      JOptionPane.showMessageDialog(null, "Registro exitoso");
                      iniciarComponentes(panel, isSix);
                    }
                  } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage());
                  } catch (MultichainException err) {
                    JOptionPane.showMessageDialog(null, err.getReason());
                  }
                }
              } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña demasiado extensas (Max. 20)");
              }
            } else {
              JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña estan vacíos");
            }
          }
        };
        boton12.addActionListener(oyenteDeAccion);
      }
    };
    boton2.addActionListener(oyenteDeAccion1);
  }

  class usuario {
    String username;
    String password;
    String hash;
  }
}