package View;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.*;

public class PanelManager extends JFrame implements ActionListener {

    //Paneles
    PanelOdontologo panelOdontologo;
    PanelPaciente panelPaciente;

    //configuracion de ventana
    private JMenuBar menuBar;
    private JMenu menuPrincipal;
    private JMenuItem BtnAdministracion, BtnConfiguracion, BtnCerrarSesion;

    public void armarFramePrincipal(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //initListenersBanner();
        //configuracion layout
        FlowLayout layout = new FlowLayout(1, 10,10);
        setLayout(layout);
        setLocationRelativeTo(null);
        

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
        setJMenuBar(menuBar);
        menuPrincipal = new JMenu("Menu");
        menuBar.add(menuPrincipal);
        BtnAdministracion = new JMenuItem("Administracion");
        menuPrincipal.add(BtnAdministracion);
        BtnConfiguracion = new JMenuItem("Configuracion");
        menuPrincipal.add(BtnConfiguracion);
        BtnCerrarSesion = new JMenuItem("Cerrar Sesion");
        menuPrincipal.add(BtnCerrarSesion);
        
        setJMenuBar(menuBar);
        add(panelPrincipal);
        setVisible(true);

        BtnAdministracion.addActionListener(this);
        BtnConfiguracion.addActionListener(this);
        BtnCerrarSesion.addActionListener(this);
    };

    private void armarPanelPrincipal(){
        this.setTitle("Pagina principal");
        this.setSize(500, 500);


    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == BtnAdministracion){
            mostrarPanelOdontologo();
        }
        if(e.getSource() == BtnConfiguracion){
            dispose();       
        }
        if(e.getSource() == BtnCerrarSesion){
            FrameLogin login = new FrameLogin();
            dispose();          
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    private void mostrarPanelOdontologo(){
        this.getContentPane().removeAll();
        panelOdontologo.armarPanelOdontologo();
        this.getContentPane().add(panelOdontologo);
        this.getContentPane().validate();
        this.getContentPane().repaint();
    }

    private void mostrarPanelPaciente() {
        this.getContentPane().removeAll();
        panelPaciente.armarPanelPaciente();
        this.getContentPane().add(panelPaciente);
        this.getContentPane().validate();
        this.getContentPane().repaint();
    }

    private void mostrarPanelPrincipal(){
        this.getContentPane().removeAll();
        panelPrincipal.armarFramePrincipal
    }

    private void armarManager() {
        panelOdontologo.armarPanelOdontologo();
        panelPaciente.armarPanelPaciente();
    }

//    private void initListenersBanner() {
//    ActionListener administrator = new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//             FrameOdontologo odontologo = new FrameOdontologo();
//             dispose();
//             odontologo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         }
//     };
//     ActionListener cerrar = new ActionListener(){
//         public void actionPerformed(ActionEvent e){
//            FrameLogin login = new FrameLogin();
//            dispose();
//            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            
//         }
//     };
//            BtnAdministracion.addActionListener(administrator);
//            BtnCerrarSesion.addActionListener(cerrar);
// }
        
}
