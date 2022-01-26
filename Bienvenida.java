import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {
    private JTextField field1;
    private JLabel label1, label2, label3, label4;
    private JButton button1;
    public static String texto = "";

    public Bienvenida() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(170, 218, 151));
        setIconImage(new ImageIcon(getClass().getResource("img/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon("img/logotitle.png");
        label1 = new JLabel(imagen);
        label1.setBounds(20, 20, 400, 300);
        add(label1);

        label2 = new JLabel("Sistema de control de Francos");
        label2.setBounds(55, 320, 300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(135, 125, 231));
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(90, 390, 200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(135, 125, 231));
        add(label3);

        label4 = new JLabel("©2022 Yocomosano D.made");
        label4.setBounds(140, 575, 300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(0, 0, 0));
        add(label4);

        field1 = new JTextField();
        field1.setBounds(90, 420, 255, 25);
        field1.setBackground(new Color(224, 224, 224));
        field1.setFont(new Font("Andale Mono", 1, 14));
        field1.setForeground(new Color(0, 0, 0));
        add(field1);

        button1 = new JButton("Ingresar");
        button1.setBounds(170,460, 100, 30);
        button1.setBackground(new Color(255, 255, 255));
        button1.setFont(new Font("Andale Mono", 1, 14));
        button1.setForeground(new Color(0,0,0));
        button1.addActionListener(this);
        add(button1);
    }

    public void actionPerformed(ActionEvent eve) {
        if(eve.getSource() == button1) {
           texto = field1.getText().trim();
           if(texto.equals("")) {
               JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
           } 
           else {
            Licencia windowlicence = new Licencia();
            windowlicence.setBounds(0,0,600,500);
            windowlicence.setVisible(true);
            windowlicence.setResizable(false);
            windowlicence.setLocationRelativeTo(null);
            this.setVisible(false);
           }
        }

    }
    

    public static void main(String args[]) {
        Bienvenida windowelcome = new Bienvenida();
        windowelcome.setBounds(0,0, 450, 650);
        windowelcome.setVisible(true);
        windowelcome.setResizable(false);
        windowelcome.setLocationRelativeTo(null);
    }
}