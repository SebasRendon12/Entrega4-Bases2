import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Punto22 extends JFrame {

  private static final long serialVersionUID = 1L;
  private static Map<Integer, ArrayList<String>> transacciones;

  public Punto22(String titulo, Map<Integer, ArrayList<String>> transaccionesdatos) {
    super(titulo); // titulo de la ventana
    this.setSize(1200, 500);// tamaño de la ventana
    transacciones = transaccionesdatos;
    iniciarComponentes();
  }

  private void iniciarComponentes() {
    JPanel panel = new JPanel();
    panel.setLayout(null); // desactivando el dise�o
    this.getContentPane().add(panel);

    JLabel title = new JLabel("Ingrese número de cuadricula:");
    title.setBounds(50, 10, 300, 30);
    panel.add(title);
    JLabel title1 = new JLabel("la informacion se ve asi: \n [x,y,block_id,sender,recipient,values_usd,fee_usd,time]");
    title1.setBounds(500, 10, 500, 30);
    panel.add(title1);
    JLabel colores = new JLabel("ordenar por");
    colores.setBounds(50, 30, 300, 30);
    panel.add(colores);
    JButton boton1 = new JButton("time");
    boton1.setBounds(40, 60, 100, 40);
    panel.add(boton1);
    JButton boton2 = new JButton("Value_usd");
    boton2.setBounds(140, 60, 100, 40);
    panel.add(boton2);
    JButton boton3 = new JButton("fee_usd");
    boton3.setBounds(240, 60, 100, 40);
    panel.add(boton3);
    JTextField tamaño = new JTextField();
    tamaño.setBounds(350, 10, 100, 30);
    panel.add(tamaño);
    JTextArea informacion = new JTextArea();
    informacion.setBounds(50, 100, 1150, 450);
    panel.add(informacion);

    ActionListener oyenteDeAccion = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        informacion.setText("");

        Map<Integer, ArrayList<String>> ordentime = new HashMap<Integer, ArrayList<String>>();
        TreeMap<Date, ArrayList<ArrayList<String>>> ordenadot = new TreeMap<>();
        ArrayList<String> jua = new ArrayList<String>();
        ArrayList<ArrayList<String>> jue = new ArrayList<ArrayList<String>>();
        SimpleDateFormat format = new SimpleDateFormat("H:mm");
        Date parsed = null;
        // parsed = format.parse(fecha.split(" ")[1]);
        for (Entry<Integer, ArrayList<String>> entry : transacciones.entrySet()) {
          if (entry.getKey() == Integer.parseInt(tamaño.getText())) {
            for (int j = 7; j < entry.getValue().size() + 1; j = j + 8) {
              jue = new ArrayList<ArrayList<String>>();
              jua = new ArrayList<String>();
              try {
                parsed = format.parse(entry.getValue().get(j).split(" ")[1]);
              } catch (ParseException e1) {
                e1.printStackTrace();
              }
              jua.add(entry.getValue().get(j - 7));
              jua.add(entry.getValue().get(j - 6));
              jua.add(entry.getValue().get(j - 5));
              jua.add(entry.getValue().get(j - 4));
              jua.add(entry.getValue().get(j - 3));
              jua.add(entry.getValue().get(j - 2));
              jua.add(entry.getValue().get(j - 1));
              jua.add(entry.getValue().get(j));
              if (ordenadot.get(parsed) == null) {
                jue.add(jua);
                ordenadot.put(parsed, jue);
              } else {
                jue = ordenadot.get(parsed);
                jue.add(jua);
                ordenadot.put(parsed, jue);
              }

            }
          }
        }

        for (Map.Entry<Date, ArrayList<ArrayList<String>>> entry : ordenadot.entrySet()) {
          if (entry.getValue().size() > 1) {
            for (int i = 0; i < entry.getValue().size(); i++) {
              informacion.append(entry.getValue().get(i).toString() + "\n");
            }
          } else {
            informacion.append(entry.getValue().toString() + "\n");
          }
        }
      }
    };

    boton1.addActionListener(oyenteDeAccion);

    ActionListener oyenteDeAccion1 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        informacion.setText("");

        Map<Integer, ArrayList<String>> ordenvalue = new HashMap<Integer, ArrayList<String>>();
        TreeMap<Float, ArrayList<ArrayList<String>>> ordenadov = new TreeMap<>();
        ArrayList<String> jua = new ArrayList<String>();
        ArrayList<ArrayList<String>> jue = new ArrayList<ArrayList<String>>();
        Float parsed;
        for (Entry<Integer, ArrayList<String>> entry : transacciones.entrySet()) {
          if (entry.getKey() == Integer.parseInt(tamaño.getText())) {
            for (int j = 5; j < entry.getValue().size() + 1; j = j + 8) {
              jue = new ArrayList<ArrayList<String>>();
              jua = new ArrayList<String>();
              if (entry.getValue().get(j).startsWith("0")) {
                Integer holaa = Integer.parseInt(entry.getValue().get(j).replace(".", ""));
                parsed = (float) (holaa / (10 ^ ("0.003".replace(".", "").length() - 1)));
              } else {
                parsed = (float) Integer.parseInt(entry.getValue().get(j).replace(".", ""));
              }
              jua.add(entry.getValue().get(j - 5));
              jua.add(entry.getValue().get(j - 4));
              jua.add(entry.getValue().get(j - 3));
              jua.add(entry.getValue().get(j - 2));
              jua.add(entry.getValue().get(j - 1));
              jua.add(entry.getValue().get(j));
              jua.add(entry.getValue().get(j + 1));
              jua.add(entry.getValue().get(j + 2));
              if (ordenadov.get(parsed) == null) {
                jue.add(jua);
                ordenadov.put(parsed, jue);
              } else {
                jue = ordenadov.get(parsed);
                jue.add(jua);
                ordenadov.put(parsed, jue);
              }

            }
          }
        }

        for (Map.Entry<Float, ArrayList<ArrayList<String>>> entry : ordenadov.entrySet()) {
          if (entry.getValue().size() > 1) {
            for (int i = 0; i < entry.getValue().size(); i++) {
              informacion.append(entry.getValue().get(i).toString() + "\n");
            }
          } else {
            informacion.append(entry.getValue().toString() + "\n");
          }
        }
      }
    };

    boton2.addActionListener(oyenteDeAccion1);

    ActionListener oyenteDeAccion2 = new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent e) {
        informacion.setText("");

        Map<Integer, ArrayList<String>> ordenfee = new HashMap<Integer, ArrayList<String>>();
        TreeMap<Float, ArrayList<ArrayList<String>>> ordenadof = new TreeMap<>();
        ArrayList<String> jua = new ArrayList<String>();
        ArrayList<ArrayList<String>> jue = new ArrayList<ArrayList<String>>();
        Float parsed;
        for (Entry<Integer, ArrayList<String>> entry : transacciones.entrySet()) {
          if (entry.getKey() == Integer.parseInt(tamaño.getText())) {
            for (int j = 6; j < entry.getValue().size() + 1; j = j + 8) {
              jue = new ArrayList<ArrayList<String>>();
              jua = new ArrayList<String>();
              if (entry.getValue().get(j).startsWith("0")) {
                Integer holaa = Integer.parseInt(entry.getValue().get(j).replace(".", ""));
                parsed = (float) (holaa / (10 ^ ("0.003".replace(".", "").length() - 1)));
              } else {
                parsed = (float) Integer.parseInt(entry.getValue().get(j).replace(".", ""));
              }

              jua.add(entry.getValue().get(j - 6));
              jua.add(entry.getValue().get(j - 5));
              jua.add(entry.getValue().get(j - 4));
              jua.add(entry.getValue().get(j - 3));
              jua.add(entry.getValue().get(j - 2));
              jua.add(entry.getValue().get(j - 1));
              jua.add(entry.getValue().get(j));
              jua.add(entry.getValue().get(j + 1));
              if (ordenadof.get(parsed) == null) {
                jue.add(jua);
                ordenadof.put(parsed, jue);
              } else {
                jue = ordenadof.get(parsed);
                jue.add(jua);
                ordenadof.put(parsed, jue);
              }

            }
          }
        }

        for (Map.Entry<Float, ArrayList<ArrayList<String>>> entry : ordenadof.entrySet()) {
          if (entry.getValue().size() > 1) {
            for (int i = 0; i < entry.getValue().size(); i++) {
              informacion.append(entry.getValue().get(i).toString() + "\n");
            }
          } else {
            informacion.append(entry.getValue().toString() + "\n");
          }
        }
      }
    };

    boton3.addActionListener(oyenteDeAccion2);

  }

}