public class conexion {
  private final static String Nombre_PC = "SEBASLAPTOP";
  private final static String usuario = "sebas";
  private final static String contraseña = "sebas123";
  // ----------- conexion multichain -------------
  private final String puerto = "2914";
  private final String password = "BQXos1HDH4rdM3E6GmUxxkNnjba6zL5AjHr2zaYJActS";

  public static String getConn() {
    return "jdbc:oracle:thin:@" + Nombre_PC + ":1521:xe";
  }

  public static String getUser() {
    return usuario;
  }

  public static String getPass() {
    return contraseña;
  }

  public String getPuerto() {
    return puerto;
  }

  public String getPassword() {
    return password;
  }
}
