package View;

import javax.swing.*;

public class PanelMain extends JPanel{
    // configuracion componentes
    JButton boton1 = new JButton("Sacar un turno");
    JButton boton2 = new JButton("Mis turnos");
    JButton boton3 = new JButton("Mis datos");

    PanelManager panelManager;

    public PanelMain(PanelManager panelManager){
        this.panelManager = panelManager;
    }
    
    public void armarPanelPrincipal(){
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
    }
}