package View;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.*;

public class Banner extends JFrame {

    //configuracion de ventana
    private JMenuBar menuBar;
    private JMenu menuPrincipal;
    private JMenuItem BtnAdministracion, BtnConfiguracion, BtnCerrarSesion;

    JPanel banner;


    public Banner() {
        this.setTitle("Pagina principal");
        this.setSize(500,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //initListenersBanner();
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
        setJMenuBar(menuBar);
        menuPrincipal = new JMenu("Menu");
        menuBar.add(menuPrincipal);
        BtnAdministracion = new JMenuItem("Administracion");
        menuPrincipal.add(BtnAdministracion);
        BtnConfiguracion = new JMenuItem("Configuracion");
        menuPrincipal.add(BtnConfiguracion);
        BtnCerrarSesion = new JMenuItem("Cerrar Sesion");
        menuPrincipal.add(BtnCerrarSesion);
        BtnAdministracion.addActionListener(this);
        BtnConfiguracion.addActionListener(this);
        BtnCerrarSesion.addActionListener(this);
        
        setJMenuBar(menuBar);
        add(panelPrincipal);
        setVisible(true);
    };



    public void actionPerformed(ActionEvent e){

        if(e.getSource() == BtnAdministracion){
            FrameOdontologo odontologo = new FrameOdontologo();
            dispose();
            odontologo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
