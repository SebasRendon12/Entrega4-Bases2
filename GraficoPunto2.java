import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JFrame;

import javafx.util.Pair;

public class GraficoPunto2 extends JFrame {

  private static final long serialVersionUID = 1L;
  private static Integer salto = 0;
  private static Map<ArrayList<Integer>, java.awt.Color> rangocolores;
  private static Map<Pair<Integer, Integer>, ArrayList<String>> transacciones;
  private Float float1;

  public GraficoPunto2(Map<ArrayList<Integer>, java.awt.Color> rangocolores2, Integer n,
      Map<Pair<Integer, Integer>, ArrayList<String>> mapita) {
    salto = n * 6;
    transacciones = new HashMap<Pair<Integer, Integer>, ArrayList<String>>();
    transacciones = mapita;
    rangocolores = rangocolores2;
  }

  public void paint(Graphics g) {

    int x = 651;
    int y = 651;
    // iterando mapa
    System.out.println(rangocolores);
    ArrayList<Pair<String, Integer>> hola = new ArrayList<Pair<String, Integer>>();
    ArrayList<String> jaja = new ArrayList<String>();
    Map<Integer, ArrayList<String>> transaccionesdatos = new HashMap<Integer, ArrayList<String>>();
    Map<Integer, String> sumatotalvalue = new HashMap<Integer, String>();
    Map<Integer, String> sumatotalfee = new HashMap<Integer, String>();
    // dibujo de cuadrado
    int contador1 = 1;
    int values = 3;
    float valor = 0;
    float valor1 = 0;
    for (int n = 0; n < 600; n = n + salto) {
      for (int i = 0; i < 600; i = i + salto) {
        Integer contador = 0;
        jaja = new ArrayList<String>();
        for (Map.Entry<Pair<Integer, Integer>, ArrayList<String>> entry : transacciones.entrySet()) {
          if ((entry.getKey().getKey() >= i && entry.getKey().getValue() >= n)
              && (entry.getKey().getKey() <= i + salto && entry.getKey().getValue() <= n + salto)) {
            contador++;
            jaja.add(Integer.toString(entry.getKey().getKey()));
            jaja.add(Integer.toString(entry.getKey().getValue()));
            // suma de values_usd
            if (entry.getValue().get(values).startsWith("0")) {
              Integer holaa = Integer.parseInt(entry.getValue().get(values).replace(".", ""));
              Float adios = (float) (holaa / (10 ^ ("0.003".replace(".", "").length() - 1)));
              valor = valor + adios;
            } else {
              Integer holaa = Integer.parseInt(entry.getValue().get(values).replace(".", ""));
              valor = valor + holaa;
            }
            if (entry.getValue().get(values + 1).startsWith("0")) {
              Integer holaa = Integer.parseInt(entry.getValue().get(values + 1).replace(".", ""));
              Float adios = (float) (holaa / (10 ^ ("0.003".replace(".", "").length() - 1)));
              valor1 = valor1 + adios;
            } else {
              Integer holaa = Integer.parseInt(entry.getValue().get(values + 1).replace(".", ""));
              valor1 = valor1 + holaa;
            }

            for (String variable : entry.getValue()) {
              jaja.add(variable);
            }
          }
          // se dibuja primero en el eje X de izquierda a derecha, y luego va bajando
          // g.fillRect(50 + i, 50 + n, salto - 1, salto - 1);
          Pair<String, Integer> buenas = new Pair<String, Integer>(
              Integer.toString(i % 600) + "," + Integer.toString(n % 600), contador);
          hola.add(buenas);

        }
        transaccionesdatos.put(contador1, jaja);
        sumatotalvalue.put(contador1, Integer.toString(i % 600) + "," + Integer.toString(n % 600) + "," + valor);
        sumatotalfee.put(contador1, Integer.toString(i % 600) + "," + Integer.toString(n % 600) + "," + valor1);
        contador1++;
        values = 3;
        valor = 0;
        valor1 = 0;
      }
    }

    ArrayList<Pair<Integer, Integer>> sumavalues = new ArrayList<Pair<Integer, Integer>>();
    for (Pair<String, Integer> variable : hola) {
      if (600 - Integer.parseInt(variable.getKey().split(",")[0]) >= salto
          && 600 - Integer.parseInt(variable.getKey().split(",")[1]) >= salto) {
        for (Entry<ArrayList<Integer>, Color> entry : rangocolores.entrySet()) {
          if (entry.getKey().size() > 1) {
            if (variable.getValue() >= entry.getKey().get(0) && variable.getValue() <= entry.getKey().get(1)) {
              g.setColor(entry.getValue());
              g.fillRect(50 + Integer.parseInt(variable.getKey().split(",")[0]),
                  50 + Integer.parseInt(variable.getKey().split(",")[1]), salto - 1, salto - 1);
              g.setColor(Color.BLACK);
              g.drawString(variable.getValue().toString(), (55 + Integer.parseInt(variable.getKey().split(",")[0])),
                  (65 + Integer.parseInt(variable.getKey().split(",")[1])));
              break;
            }
          } else {
            if (variable.getValue() >= entry.getKey().get(0)) {
              g.setColor(entry.getValue());
              g.fillRect(51 + Integer.parseInt(variable.getKey().split(",")[0]),
                  51 + Integer.parseInt(variable.getKey().split(",")[1]), salto - 1, salto - 1);
              g.setColor(Color.BLACK);
              g.drawString(variable.getValue().toString(), (55 + Integer.parseInt(variable.getKey().split(",")[0])),
                  (65 + Integer.parseInt(variable.getKey().split(",")[1])));
              break;
            }
          }
        }
      }

    }
    // grafico del total de value_usd
    g.setColor(Color.BLACK);
    for (Entry<Integer, String> entry : sumatotalvalue.entrySet()) {
      g.drawString(entry.getValue().split(",")[2], (55 + Integer.parseInt(entry.getValue().split(",")[0])),
          (75 + Integer.parseInt(entry.getValue().split(",")[1])));
    }
    // grafico del total de fee_usd
    Integer count = 1;
    g.setColor(Color.BLACK);
    for (Entry<Integer, String> entry : sumatotalfee.entrySet()) {
      g.drawString(entry.getValue().split(",")[2], (55 + Integer.parseInt(entry.getValue().split(",")[0])),
          (85 + Integer.parseInt(entry.getValue().split(",")[1])));
      g.drawString(count.toString(), (55 + Integer.parseInt(entry.getValue().split(",")[0])),
          (95 + Integer.parseInt(entry.getValue().split(",")[1])));
      count++;
    }

    g.setColor(Color.green);
    for (int i = 50; i < y; i += salto)
      g.drawLine(50, i, x, i);
    for (int i = 50; i < x; i += salto)
      g.drawLine(i, 50, i, y);
    g.drawLine(50, 651, x, 651);
    g.drawLine(651, 50, 651, y);
    Punto22 datos = new Punto22("hola", transaccionesdatos);
    datos.setVisible(true);
  }
}
