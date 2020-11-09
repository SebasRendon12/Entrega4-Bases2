import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Punto4 extends JFrame {

  private static final long serialVersionUID = 1L;

  public Punto4(String titulo) {
    super(titulo); // titulo de la ventana
    this.setSize(700, 300);// tamaño de la ventana
    iniciarComponentes();
  }

  private void iniciarComponentes() {
    JPanel panel = new JPanel();
    panel.setLayout(null); // desactivando el diseño
    this.getContentPane().add(panel);
    JLabel title = new JLabel("Información de la blockchain");
    title.setBounds(175, 10, 300, 30);
    panel.add(title);
    JLabel title1 = new JLabel("Nombre: bdchain");
    title1.setBounds(175, 80, 300, 30);
    panel.add(title1);
    JLabel title2 = new JLabel("Assets: bdcoin");
    title2.setBounds(175, 130, 300, 30);
    panel.add(title2);
    /* ------------- BlockChain ------------------

    multichain-util create bdchain // creamos la blockchain
    multichaind bdchain -daemon // Prender el demonio de multichain
    ----------- Para los permisos ------------- 
    multichain-cli bdchain grant [direccion] [permiso]
    multichain-cli bdchain grant 191u2b64BbAnbfXR2Z96NJwweMVeB4LJCQ8iA4 connect,send,receive // Permisos para las assets
    multichain-cli bdchain create stream stream1 "{\"restrict\":\"write\"}" // creamos el stream1 con restric: write
    multichain-cli bdchain subscribe stream1 // Nos suscribimos al stream1 para poder leer los datos
    -------------- publicar un json --------------
    multichain-cli bdchain publish stream1 key1 "{\"json\":{\"nombre\":\"John Doe\",\"contraseña\":\"123\"}}"

    ------------------ Asset --------------------------
    multichain-cli bdchain getaddresses // Obtenemos la direccion del nodo
    multichain-cli bdchain getnewaddress // Obtenemos una nueva direccion en el mismo nodo
    multichain-cli bdchain issue 1DJmKFwANEgg8DFoqhmbc7n7YFQviN1aZmVEYH bdcoin 1000000 0.01 //  creacion del asset bdcoin 
    
    1DJmKFwANEgg8DFoqhmbc7n7YFQviN1aZmVEYH <- hash origen de bdchain

    --------------- Comandos para los assets/wallet ------------------
    multichain-cli bdchain gettotalbalances // Para ver el total de activos en el nodo
    multichain-cli bdchain sendasset 1V5NSENuLm7kMF7TGuiVuVeyXQ9wBe5euTGwq5 bdcoin 100 // mandar assets a otra wallet
    multichain-cli bdchain sendassetfrom 13rBJDkSC5z6HZqYswAkNM1w2J2LgkBhENogX1 191u2b64BbAnbfXR2Z96NJwweMVeB4LJCQ8iA4 bdcoin 100
    multichain-cli bdchain getaddressbalances 191u2b64BbAnbfXR2Z96NJwweMVeB4LJCQ8iA4 // ver el balance de una wallet
    
    */
  }
}
