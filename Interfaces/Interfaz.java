import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener {
    // El menu es el mismo siempre
    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem menuItem21, menuItem22, menuItem31, menuItem32;
    
    public Interfaz() {
        // Creamos el JMenuBar y lo asociamos con el JFrame 
        menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        
        menu1 = new JMenu("Opciones");
        menuBar.add(menu1);
        
        menu2 = new JMenu("Herramientas");
        menuBar.add(menu2);
        menuItem21 = new JMenuItem("Imprimir");
        menuItem21.addActionListener(this);
        menu2.add(menuItem21);
        
        menu3 = new JMenu("Configuracion");
        menuBar.add(menu3);
        
        init();
    }
    
    private void init() {
        setTitle("Ejemplo Interfaces");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setSize(800, 800);
        setBackground(new Color(255, 0, 0));
        getContentPane().setBackground(new Color(200, 255, 100));
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItem21) {
            System.out.println("Menu 2-1");
        }
    }
    
    public void mostrarVentana() {
        setVisible(true);
    }
    
    public void mostrarPanel(JPanel panel) {
        add(panel);
    }
    
    public void eliminarPanel(JPanel panel) {
        remove(panel);
    }
    
    public JPanel crearBotones(String texto, String textoBoton1, String textoBoton2) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel(texto);
        panel.add(label);
        
        JTextField textField = new JTextField(10);
        panel.add(textField);
        
        JButton boton1 = new JButton(textoBoton1);
        panel.add(boton1);
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("boton 1");
                String textoNuevo = textField.getText();
                System.out.println(textoNuevo);
            }
        };
        boton1.addActionListener(al);
        
        JButton boton2 = new JButton(textoBoton2);
        panel.add(boton2);
        ActionListener al2 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("boton 2");
            }
        };
        boton2.addActionListener(al2);
        
        return panel;
    }
    
    
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        JPanel panel1 = interfaz.crearBotones("Prueba 1", "Imprimir", "Opcion2");
        interfaz.mostrarPanel(panel1);
        interfaz.mostrarVentana();
        
        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {}
        
        interfaz.eliminarPanel(panel1);
        
        JPanel panel2 = interfaz.crearBotones("Prueba 2", "Imprimir2", "Opcion22");
        interfaz.mostrarPanel(panel2);
    }

}