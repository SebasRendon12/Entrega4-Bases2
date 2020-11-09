public class conexion {
  private final String Nombre_PC = "SEBASLAPTOP";
  private final String usuario = "sebas";
  private final String contraseña = "sebas123";
  //----------- conexion multichain -------------
  private final String puerto = "6726";
  private final String password = "5CdSq1tkL3fx6Hw6c8zdfoHE3ipwGJQBdH1Qhc5SPX8m";

  public String getConn() {
    return "jdbc:oracle:thin:@" + Nombre_PC + ":1521:xe";
  }

  public String getUser() {
    return usuario;
  }

  public String getPass() {
    return contraseña;
  }

  public String getPuerto() {
    return puerto;
  }

  public String getPassword() {
    return password;
  }
}
