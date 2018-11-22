
package componentesgui;
//Proporciona caracteristicasa de una ventana
import javax.swing.JFrame;
//Componentes que muestra texto o imagenes
import javax.swing.JLabel;
//Capa de comoponentes especifica como se ordenan
import java.awt.FlowLayout;
import javax.swing.Icon;
//Constantes comun utlizadas con la libreria SWING
import javax.swing.SwingConstants;
//Carga las imagenes
import javax.swing.ImageIcon;


public class MiEtiqueta extends JFrame {
 
    private JLabel etiqueta1;
    
    
    private JLabel etiqueta2;
    
    
    private JLabel etiqueta3;
    
    
    
   public MiEtiqueta(){  
    //Hace referencia al constructor de la clase padre.
    super("Pfrueba de etiqueta");
    
    //Mandamos la Capa
    setLayout(new FlowLayout());
    
    etiqueta1=new JLabel("Etiqueta con texto");
    
    //Texto de ayuda
    etiqueta1.setToolTipText("Esta es la etiqueta1");
    
    //Se agrega la etiqueta a la ventana (JFrame)
    add(etiqueta1);
    
    //Se crea el icono
    Icon icono=
            new ImageIcon("C:\\Users\\danie\\Documents\\NetBeansProjects\\ComponentesGUI\\resources\\icono.png");
                    
    etiqueta2=new JLabel(
            "Etiqueta con texto o icono",
            icono,
            SwingConstants.LEFT);
    
    //Texto de ayuda
    etiqueta2.setToolTipText("Esta es la etiqueta2");
    
    //Agregamos la etiqueta a la ventana(JFrame)
    add(etiqueta2);
    
    //Se crea la etiqueta sin argumentos
    etiqueta3=new JLabel();
    
    //Se le asigna un texto
    etiqueta3.setText("Etiqueta con icono y texto abajo");
    
    //Se le añade el icono
    etiqueta3.setIcon(icono);
    
    //Se da una alineacion al texto
    etiqueta3.setHorizontalTextPosition(
                SwingConstants.CENTER);
    
    //Texto de ayuda
    etiqueta3.setToolTipText("Esta es la etiqueta3");
    
    //Se agrega la etiqueta a la ventana (JFrame)
    add(etiqueta3);
    
    
    
    
}
}
