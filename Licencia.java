import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Licencia extends JFrame implements ActionListener, ChangeListener{
    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton button1, button2;    
    private JScrollPane scrollpane;
    private JTextArea area1;
    String nombre = "";

    public Licencia() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("img/icon.png")).getImage());
        Bienvenida windowelcome = new Bienvenida();
        nombre = windowelcome.texto;
        
        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        area1 = new JTextArea();
        area1.setEditable(false);
        area1.setFont(new Font("Andale Mono", 0, 9));
        area1.setText("\n\n          TERMINOS Y CONDICIONES" +
        "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE YO COMO SANO" +
        "\n            B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
        "\n            C.  YOCOMOSANO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
        "\n\n          ESTA DECLARACION DE TERMINOS Y CONDICIONES ES MERAMENTE UN EJEMPLO, NO TIENE INCIDENCIA LEGAL" +
        "\n          ERNESTO, EL CREADOR DEL SOFTWARE, LO CREA CON PROPOSITOS EDUCATIVOS, Y LO LIBERA PARA ENSEÑAR" + 
        "\n\n         YO, Daniel, LO MODIFICO CON EL FIN DE APRENDER, Y NO ME HAGO RESPONSABLE DE SU MAL USO" + 
        "\n          ESTE ES EL CANAL DE ERNESTO, EL CUAL CONSERVO AQUI POR SU ENORME A LA COMUNIDAD" +
        "\n\n                http://www.youtube.com/ernestoperezm");
        scrollpane = new JScrollPane(area1);
        scrollpane.setBounds(10, 40, 565, 200);
        add(scrollpane);

        check1 = new JCheckBox("Yo " + nombre + " acepto");
        check1.setBounds(10, 250, 300,30);
        check1.addChangeListener(this);
        add(check1);

        button1 = new JButton("Continuar");
        button1.setBounds(10, 290, 100, 30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);
        

        button2 = new JButton("No Acepto");
        button2.setBounds(120, 290, 100, 30);
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);
    
        ImageIcon image = new ImageIcon("img/LOGONOBG.png");
        label2 = new JLabel(image);
        label2.setBounds(315, 200, 300, 300);
        add(label2);
    }

    public void stateChanged(ChangeEvent eve) {
        if(check1.isSelected() == true) {
            button1.setEnabled(true);
            button2.setEnabled(false);
        } else {
            button1.setEnabled(false);
            button2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent eve) {
        if(eve.getSource() == button1) {
            Principal windowprincipal = new Principal();
            windowprincipal.setBounds(0,0,580,850);
            windowprincipal.setVisible(true);
            windowprincipal.setResizable(true);
            windowprincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (eve.getSource() == button2) {
            Bienvenida windowelcome = new Bienvenida();
            windowelcome.setBounds(0,0, 450, 650);
            windowelcome.setVisible(true);
            windowelcome.setResizable(false);
            windowelcome.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        Licencia windowlicence = new Licencia();
        windowlicence.setBounds(0,0,600,500);
        windowlicence.setVisible(true);
        windowlicence.setResizable(false);
        windowlicence.setLocationRelativeTo(null);
    }
}
