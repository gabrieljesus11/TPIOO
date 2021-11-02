package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Banner extends JFrame {

    //configuracion de ventana
    private JMenuBar menuBar;
    private JMenu menu1;
    private JMenuItem menuItem20, menuItem21, menuItem22;

    public Banner() {
        this.setTitle("Pagina principal");
        this.setSize(500,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        initListeners();
        //configuracion layout
        FlowLayout layout = new FlowLayout(1, 10,10);
        setLayout(layout);
        

        //configuracion componentes
        JPanel panelPrincipal = new JPanel();
        JButton boton1 = new JButton("Sacar un turno");
        JButton boton2 = new JButton("Mis turnos");
        JButton boton3 = new JButton("Mis datos");

        panelPrincipal.add(boton1);
        panelPrincipal.add(boton2);
        panelPrincipal.add(boton3);

        //configuracion menu
        menuBar = new JMenuBar();
        menu1 = new JMenu("Menu");

        menuItem20 = new JMenuItem("Administracion");
        menuItem21 = new JMenuItem("Configuracion");
        menuItem22 = new JMenuItem("Cerrar Sesion");

        menuBar.add(menu1);

        menu1.add(menuItem20);
        menu1.add(menuItem21);
        menu1.add(menuItem22);

        setJMenuBar(menuBar);


        add(panelPrincipal);


        

        setVisible(true);

    }
//    private void initListeners() {
//        
//        ActionListener consolaAdmin = new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                FramePaciente paciente = new FramePaciente();
//                paciente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            }
//        };
//
//        menuItem20.addActionListener(consolaAdmin);
//    }
        
    
}
