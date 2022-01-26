import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miNaranja, miCeleste, miVerde, miCreador, miSalir, miNuevo;
    private JLabel lLogo, lBienvenido, lTitle, lNombre, lApellido, lDepartamento, lAntiguedad, lResultado, lFooter, lUser;
    private JTextField txtNombreTrabajador, txtApellido;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String usuario = ""; 

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Control del Mes");
        getContentPane().setBackground(new Color(170, 218, 151));
        setIconImage(new ImageIcon(getClass().getResource("img/icon.png")).getImage());
        Bienvenida windowelcome = new Bienvenida();
        usuario = windowelcome.texto;

        mb = new JMenuBar();
        mb.setBackground(new Color(100, 185, 66));
        setJMenuBar(mb);

        //Menus contenidos en la BARRA//
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(100, 185, 66));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255,255,255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255, 0, 0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255,255,255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        mb.add(menuAcercaDe);

        //SUBmenus de opciones (e items si tiene)
       
        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1,14));
        menuColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorFondo);

        miNaranja = new JMenuItem("Naranja");
        miNaranja.setFont(new Font("Andale Mono", 1, 14));
        miNaranja.setForeground(new Color(255,0,0));
        menuColorFondo.add(miNaranja);
        miNaranja.addActionListener(this);

        miCeleste = new JMenuItem("Celeste");
        miCeleste.setFont(new Font("Andale Mono", 1, 14));
        miCeleste.setForeground(new Color(255,0,0));
        menuColorFondo.add(miCeleste);
        miCeleste.addActionListener(this);

        miVerde = new JMenuItem("Verde");
        miVerde.setFont(new Font("Andale Mono", 1, 14));
        miVerde.setForeground(new Color(255,0,0));
        menuColorFondo.add(miVerde);
        miVerde.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        //Submenu de CALCULAR

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        //Submenu de Acerca De
        
        miCreador = new JMenuItem("El creador");
        miCreador.setFont(new Font("Andale Mono", 1, 14));
        miCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miCreador);
        miCreador.addActionListener(this);

        //Labels Principales
        
        ImageIcon imagen = new ImageIcon("img/logotitle.png");
        lLogo = new JLabel(imagen);
        lLogo.setBounds(5,5,400,300); //150, 200 mas
        add(lLogo);

        lBienvenido = new JLabel("Bienvenido");
        lBienvenido.setBounds(350, 100, 300, 50);
        lBienvenido.setFont(new Font("Andale Mono", 1, 32));
        lBienvenido.setForeground(new Color(255,255,255));
        add(lBienvenido);

        lUser = new JLabel(usuario);
        lUser.setBounds(390, 145, 300, 50);
        lUser.setFont(new Font("Andale Mono", 1, 32));
        lUser.setForeground(new Color(255,255,255));
        add(lUser);

        lTitle = new JLabel("Datos del trabajador para el calculo");
        lTitle.setBounds(75, 320, 900, 25);
        lTitle.setFont(new Font("Andale Mono", 1, 24));
        lTitle.setForeground(new Color(255,255,255));
        add(lTitle);

        //Now, i'll add label + its respective component,
        //so there will be label + text field or label + combobox/textarea
    
        lNombre = new JLabel("Nombre");
        lNombre.setBounds(50,375,180,25);
        lNombre.setFont(new Font("Andale Mono", 1, 12));
        lNombre.setForeground(new Color(255, 255,255));
        add(lNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(50, 410, 150,25);
        txtNombreTrabajador.setBackground(new Color(224,224,224));
        txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(new Color(0,0,0));
        add(txtNombreTrabajador);

        lApellido = new JLabel("Apellido");
        lApellido.setBounds(50,450,180,25);
        lApellido.setFont(new Font("Andale Mono", 1, 12));
        lApellido.setForeground(new Color(255, 255,255));
        add(lApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(50, 485, 150,25);
        txtApellido.setBackground(new Color(224,224,224));
        txtApellido.setFont(new Font("Andale Mono", 1, 14));
        txtApellido.setForeground(new Color(0,0,0));
        add(txtApellido);
    
        lDepartamento = new JLabel("Selecciona el Departamento");
        lDepartamento.setBounds(300,375,180, 25);
        lDepartamento.setFont(new Font("Andale Mono", 1, 12));
        lDepartamento.setForeground(new Color(255,255,255));
        add(lDepartamento);

        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(300, 410, 220, 25);
        comboDepartamento.setBackground(new Color(224,224,224));
        comboDepartamento.setFont(new Font("Andale Mono",1,14));
        comboDepartamento.setForeground(new Color(0,0,0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Recepcion");
        comboDepartamento.addItem("Cocina");
        comboDepartamento.addItem("Jefe de Personal");
        

        lAntiguedad = new JLabel("Selecciona tu antiguedad");
        lAntiguedad.setBounds(300,450,180, 25);
        lAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        lAntiguedad.setForeground(new Color(255,255,255));
        add(lAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(300, 485, 220, 25);
        comboAntiguedad.setBackground(new Color(224,224,224));
        comboAntiguedad.setFont(new Font("Andale Mono",1,14));
        comboAntiguedad.setForeground(new Color(0,0,0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 a 2 años");
        comboAntiguedad.addItem("3 a 5 años");
        comboAntiguedad.addItem("6 o mas años");
    
        
        lResultado = new JLabel("Resultado del Calculo");
        lResultado.setBounds(100, 530, 180, 25);
        lResultado.setFont(new Font("Andale Mono", 1, 12));
        lResultado.setForeground(new Color(255,255,255));
        add(lResultado);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224,224,224));
        textarea1.setFont(new Font("Andale Mono", 1, 12));
        textarea1.setForeground(new Color(0,0,0));
        textarea1.setText("\n Aqui aparecera el resultado del calculo");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(100, 575, 385, 90);
        add(scrollpane1);   
        
        lFooter = new JLabel("©2022 Yocomosano | Todos los derechos reservados");
        lFooter.setBounds(125,750,400,30);
        lFooter.setFont(new Font("Andale Mono", 1, 12));
        lFooter.setForeground(new Color(255,255,255));
        add(lFooter);
        
        }

        public void actionPerformed(ActionEvent eve) {
            if(eve.getSource() == miCalculo) {
                String nombreEmpleado = txtNombreTrabajador.getText();
                String apellidoEmpleado = txtApellido.getText();
                String Departamento = comboDepartamento.getSelectedItem().toString();
                String Antiguedad = comboAntiguedad.getSelectedItem().toString();
                if(nombreEmpleado.equals("")|| apellidoEmpleado.equals("") 
                || Departamento.equals("") || Antiguedad.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos");
                } else {
                    if(Departamento.equals("Recepcion")) {
                        if(Antiguedad.equals("1 a 2 años")) {
                            textarea1.setText("\n El trabajador " + nombreEmpleado + " " + apellidoEmpleado + " " + 
                                                "\n que trabaja en " + Departamento + " con " + Antiguedad + 
                                                "\n recibe 7 dias de vacaciones.");
                        }
                        if(Antiguedad.equals("3 a 5 años")) {
                            textarea1.setText("\n El trabajador " + nombreEmpleado + " " + apellidoEmpleado + " " + 
                                                "\n que trabaja en " + Departamento + " con " + Antiguedad + 
                                                "\n recibe 14 dias de vacaciones.");
                        }
                        if(Antiguedad.equals("6 o mas años")) {
                            textarea1.setText("\n El trabajador " + nombreEmpleado + " " + apellidoEmpleado + " " + 
                                                "\n que trabaja en " + Departamento + " con " + Antiguedad + 
                                                "\n recibe 20 dias de vacaciones.");
                        }
                    }
                    if(Departamento.equals("Cocina")) {
                        if(Antiguedad.equals("1 a 2 años")) {
                            textarea1.setText("\n El trabajador " + nombreEmpleado + " " + apellidoEmpleado + " " + 
                                                "\n que trabaja en " + Departamento + " con " + Antiguedad + 
                                                "\n recibe 6 dias de vacaciones.");
                        }
                        if(Antiguedad.equals("3 a 5 años")) {
                            textarea1.setText("\n El trabajador " + nombreEmpleado + " " + apellidoEmpleado + " " + 
                                                "\n que trabaja en " + Departamento + " con " + Antiguedad + 
                                                "\n recibe 12 dias de vacaciones.");
                        }
                        if(Antiguedad.equals("6 o mas años")) {
                            textarea1.setText("\n El trabajador " + nombreEmpleado + " " + apellidoEmpleado + " " + 
                                                "\n que trabaja en " + Departamento + " con " + Antiguedad + 
                                                "\n recibe 18 dias de vacaciones.");
                        }
                    }
                    if(Departamento.equals("Jefe de Personal")) {
                        if(Antiguedad.equals("1 a 2 años")) {
                            textarea1.setText("\n El trabajador " + nombreEmpleado + " " + apellidoEmpleado + " " + 
                                                "\n que trabaja en " + Departamento + " con " + Antiguedad + 
                                                "\n recibe 10 dias de vacaciones.");
                        }
                        if(Antiguedad.equals("3 a 5 años")) {
                            textarea1.setText("\n El trabajador " + nombreEmpleado + " " + apellidoEmpleado + " " + 
                                                "\n que trabaja en " + Departamento + " con " + Antiguedad + 
                                                "\n recibe 18 dias de vacaciones.");
                        }
                        if(Antiguedad.equals("6 o mas años")) {
                            textarea1.setText("\n El trabajador " + nombreEmpleado + " " + apellidoEmpleado + " " + 
                                                "\n que trabaja en " + Departamento + " con " + Antiguedad + 
                                                "\n recibe 30 dias de vacaciones.");
                        }
                    }
                }
            }
            if(eve.getSource() == miNaranja) {
                getContentPane().setBackground(new Color(229, 164, 68));
            }
            if(eve.getSource() == miCeleste) {
                getContentPane().setBackground(new Color(115, 196, 216));
            }
            if(eve.getSource() == miVerde) {
                getContentPane().setBackground(new Color(170, 218, 151));
            }
            if(eve.getSource() == miNuevo) {
                txtNombreTrabajador.setText("");
                txtApellido.setText("");
                comboDepartamento.setSelectedIndex(0);
                comboAntiguedad.setSelectedIndex(0);
                textarea1.setText("\n Aqui aparece el resultado del cálculo de vacaciones.");
            }
            if(eve.getSource() == miSalir) {
                Bienvenida windowelcome = new Bienvenida();
                windowelcome.setBounds(0,0, 450, 650);
                windowelcome.setVisible(true);
                windowelcome.setResizable(false);
                windowelcome.setLocationRelativeTo(null);
                this.setVisible(false);
            }
            if(eve.getSource() == miCreador) {
                JOptionPane.showMessageDialog(null, "Desarrollado por Daniel Rodriguez, con ayuda de Ernesto \n"+
                                                    "https://www.youtube.com/channel/UCeEW6PHNJlIwI-rKChmqqkw");
            }
        }

        public static void main(String args[]) {
            Principal windowprincipal = new Principal();
            windowprincipal.setBounds(0,0,580,850);
            windowprincipal.setVisible(true);
            windowprincipal.setResizable(true);
            windowprincipal.setLocationRelativeTo(null);
        
        }
}
