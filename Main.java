public class Main {
  public static void main(String[] args) {
    System.out.println("0.003".startsWith("0"));
    System.out.println("0.003".replace(".",""));
    System.out.println("0.003".replace(".","").length()-1);
    Integer hola = Integer.parseInt("0.003".replace(".",""));
    Float adios = (float) (hola / (10 ^ ("0.003".replace(".", "").length() - 1)));
    System.out.println(adios);
    MenuPrincipal M1 = new MenuPrincipal("Entrega 4 - Bases de datos 2");
    M1.setVisible(true);
    
  }
}