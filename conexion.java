public class conexion {
  public static String Nombre_PC = "DESKTOP-NF5GC4E";
  public static String usuario = "ricardo";
  public static String contraseña = "123";

  public static String getConn() {
    return "jdbc:oracle:thin:@" + Nombre_PC + ":1521:xe";
  }

  public static String getUser() {
    return usuario;
  }

  public static String getPass() {
    return contraseña;
  }
}
