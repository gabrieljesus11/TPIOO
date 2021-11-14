package View;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelManager implements ActionListener{

    //Paneles
    private JFrame frame;
    private PanelOdontologo panelOdontologo;
    private PanelPaciente panelPaciente;
    private PanelMain panelPrincipal;
    private JMenuBar menuBar;
    private JMenu menuPrincipal;
    private JMenuItem BtnAdministracion, BtnConfiguracion, BtnCerrarSesion;

    public void armarManager(){
        
        panelOdontologo = new PanelOdontologo(this);
        panelOdontologo.armarPanelOdontologo();

        panelPaciente = new PanelPaciente(this);
        panelPaciente.armarPanelPaciente();

        panelPrincipal = new PanelMain(this);
        panelPrincipal.armarPanelPrincipal();

        // configuracion menu

        menuBar = new JMenuBar();
        menuPrincipal = new JMenu("Menu");
        BtnAdministracion = new JMenuItem("Administracion");
        BtnConfiguracion = new JMenuItem("Configuracion");
        BtnCerrarSesion = new JMenuItem("Cerrar Sesion");

        menuPrincipal.add(BtnAdministracion);
        menuPrincipal.add(BtnConfiguracion);
        menuPrincipal.add(BtnCerrarSesion);

        menuBar.add(menuPrincipal);

        BtnAdministracion.addActionListener(this);
        BtnConfiguracion.addActionListener(this);
        BtnCerrarSesion.addActionListener(this);
    }


    public void mostrarFrame(){
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // configuracion layout
        FlowLayout layout = new FlowLayout(1, 10, 10);
        frame.setLayout(layout);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setJMenuBar(menuBar);
    }

    public void cerrarFrame(){
        frame.dispose();
    }

    public void mostrarPanelOdontologo(){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panelOdontologo);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
    }

    public void mostrarPanelPaciente() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panelPaciente);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
    }

    public void mostrarPanelPrincipal(){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panelPrincipal);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BtnAdministracion) {
            frame.dispose();
            armarManager();
            mostrarFrame();
            mostrarPanelPrincipal();
            frame.setSize(250, 300);
            frame.setLocationRelativeTo(null);
            mostrarPanelOdontologo();
        }
        if (e.getSource() == BtnConfiguracion) {
            this.cerrarFrame();
        }
        if (e.getSource() == BtnCerrarSesion) {
            FrameLogin login = new FrameLogin();
            this.cerrarFrame();
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }       
}
