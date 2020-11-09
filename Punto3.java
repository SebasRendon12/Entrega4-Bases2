import javax.swing.JFrame;

import javafx.scene.paint.Color;
import javafx.util.Pair;
import oracle.net.aso.g;

import java.awt.event.ActionListener;

import javax.sound.sampled.SourceDataLine;
import javax.swing.*;

import java.sql.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Punto3 extends JFrame {

  private static final long serialVersionUID = 1L;

  public Punto3(String titulo) {
    super(titulo); // titulo de la ventana
    this.setSize(700, 300);// tamaño de la ventana
    iniciarComponentes();
  }

  private void iniciarComponentes() {
    JPanel panel = new JPanel();
    panel.setLayout(null); // desactivando el dise�o
    this.getContentPane().add(panel);
    JLabel title = new JLabel("Codigo primer minero de maincra xD:");
    title.setBounds(50, 10, 300, 30);
    panel.add(title);
    JLabel colores = new JLabel("Codigo segundo minero de maincra xD:");
    colores.setBounds(310, 10, 300, 30);
    panel.add(colores);
    JTextField maincra1 = new JTextField();
    maincra1.setBounds(10, 50, 300, 30);
    panel.add(maincra1);
    JTextField maincra2 = new JTextField();
    maincra2.setBounds(310, 50, 300, 30);
    panel.add(maincra2);
    JLabel title1 = new JLabel("Ingrese hora y minuto inicial");
    title1.setBounds(50, 90, 200, 30);
    panel.add(title1);
    JLabel colores1 = new JLabel("Ingrese hora y minuto final");
    colores1.setBounds(310, 90, 200, 30);
    panel.add(colores1);
    JTextField maincra11 = new JTextField();
    maincra11.setBounds(50, 130, 100, 30);
    panel.add(maincra11);
    JTextField maincra21 = new JTextField();
    maincra21.setBounds(310, 130, 100, 30);
    panel.add(maincra21);
    JButton boton1 = new JButton("Ver cubitos de maincra xD");
    boton1.setBounds(30, 200, 250, 50);
    panel.add(boton1);

    ActionListener oyenteDeAccion = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        if (maincra1.getText().equals("") || maincra2.getText().equals("")) {
          // no se grafica nada, pues no existen los mineros de maincra
        } else {
          Connection conn;
          Statement sentencia;
          ResultSet resultado;
          ResultSet resultado1;
          ArrayList<String> minero1 = new ArrayList<String>();
          ArrayList<String> minero2 = new ArrayList<String>();
          ArrayList<Float> ventas = new ArrayList<Float>();
          System.out.println(maincra1.getText());
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
                .executeQuery("SELECT id, time FROM BLOQUE WHERE miner = '" + maincra1.getText() + "'");
            while (resultado.next()) {
              SimpleDateFormat format = new SimpleDateFormat("H:mm");
              Date parsed = null;
              Date fechainicio = null;
              Date fechafinal = null;
              String fecha = resultado.getString(2).toString();
              try {
                parsed = format.parse(fecha.split(" ")[1]);
                fechainicio = format.parse(maincra11.getText());
                fechafinal = format.parse(maincra21.getText());
              } catch (ParseException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
              }
              if (fechainicio.compareTo(parsed) == 0) {
                // System.out.println("inicio igual");
                minero1.add(resultado.getString(1));
              } else if (parsed.compareTo(fechafinal) < 0 && parsed.compareTo(fechainicio) > 0) {
                // System.out.println("antes de final");
                minero1.add(resultado.getString(1));
              } else if (fechafinal.compareTo(parsed) == 0) {
                // System.out.println("final igual");
                minero1.add(resultado.getString(1));
              }
              System.out.println(fecha);
              System.out.println(resultado.getString(1));
              // System.out.println(resultado.getString(6).toString());
              // java.sql.Date sql = new java.sql.Date(parsed.getTime());
              // System.out.println(sql);

              // Intento de traer el xml de solo la ciudad ingresada por el usuario en un
              // String
            }
          } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                "Error al consultar en la base de datos , no se pede graficar porque un minero no existe" + err);
            return;
          }
          if (minero1.size() == 0) {
            JOptionPane.showMessageDialog(null,
                "Error al consultar en la base de datos , no se pede graficar porque un minero no existe");
            return;
          } else {
            System.out.println(minero1);
          }
          try {
            resultado = sentencia
                .executeQuery("SELECT id, time FROM BLOQUE WHERE miner = '" + maincra2.getText() + "'");
            while (resultado.next()) {
              SimpleDateFormat format = new SimpleDateFormat("H:mm");
              Date parsed = null;
              Date fechainicio = null;
              Date fechafinal = null;
              String fecha = resultado.getString(2).toString();
              try {
                parsed = format.parse(fecha.split(" ")[1]);
                fechainicio = format.parse(maincra11.getText());
                fechafinal = format.parse(maincra21.getText());
              } catch (ParseException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
              }
              if (fechainicio.compareTo(parsed) == 0) {
                // System.out.println("inicio igual");
                minero2.add(resultado.getString(1));
              } else if (parsed.compareTo(fechafinal) < 0 && parsed.compareTo(fechainicio) > 0) {
                // System.out.println("antes de final");
                minero2.add(resultado.getString(1));
              } else if (fechafinal.compareTo(parsed) == 0) {
                // System.out.println("final igual");
                minero2.add(resultado.getString(1));
              }
              System.out.println(fecha);
              System.out.println(resultado.getString(1));
              // System.out.println(resultado.getString(6).toString());
              // java.sql.Date sql = new java.sql.Date(parsed.getTime());
              // System.out.println(sql);

              // Intento de traer el xml de solo la ciudad ingresada por el usuario en un
              // String
            }
          } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                "Error al consultar en la base de datos , no se pede graficar porque un minero no existe" + err);
            return;
          }
          if (minero2.size() == 0) {
            JOptionPane.showMessageDialog(null,
                "Error al consultar en la base de datos , no se pede graficar porque un minero no existe");
            return;
          } else {
            System.out.println(minero2);
          }
          try {
            for (String i : minero1) {
              resultado = sentencia.executeQuery("SELECT value_usd FROM TRANSACCION WHERE block_id = '" + i + "'");
              while (resultado.next()) {
                String entry = resultado.getString(1).toString();
                Float parsed;
                if (entry.startsWith("0")) {
                  Integer holaa = Integer.parseInt(entry.replace(".", ""));
                  parsed = (float) (holaa / (10 ^ ("0.003".replace(".", "").length() - 1)));
                } else {
                  parsed = (float) Integer.parseInt(entry.replace(".", ""));
                }
                ventas.add(parsed);
              }
            }
            for (String i : minero2) {
              resultado = sentencia.executeQuery("SELECT value_usd FROM TRANSACCION WHERE block_id = '" + i + "'");
              while (resultado.next()) {
                String entry = resultado.getString(1).toString();
                Float parsed;
                if (entry.startsWith("0")) {
                  Integer holaa = Integer.parseInt(entry.replace(".", ""));
                  parsed = (float) (holaa / (10 ^ ("0.003".replace(".", "").length() - 1)));
                } else {
                  parsed = (float) Integer.parseInt(entry.replace(".", ""));
                }
                ventas.add(parsed);
              }
            }
          } catch (SQLException err) {
            JOptionPane.showMessageDialog(null,
                "Error al consultar en la base de datos , no se pede graficar porque un minero no existe" + err);
            return;
          }
          if (minero2.size() == 0) {
            JOptionPane.showMessageDialog(null,
                "Error al consultar en la base de datos , no se pede graficar porque un minero no existe");
            return;
          } else {
            System.out.println(minero2);
          }
          GraficoPunto3 DrawWindow = new GraficoPunto3(ventas);
          DrawWindow.setSize(800, 600);
          DrawWindow.setResizable(false);
          DrawWindow.setLocation(200, 50);
          DrawWindow.setTitle("BLoque de maincra");
          DrawWindow.setVisible(true);
        }
      }

    };
    boton1.addActionListener(oyenteDeAccion);
  }
}
