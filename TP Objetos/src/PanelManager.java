//import javax.swing.*;
//import java.awt.*;
//import View.*;
//
//public class PanelManager {
//    private JFrame frame;
//    private PanelLogin panelLogin;
//    private PanelFormulario panelFormulario;
//
//    public PanelManager() {
//    }
//
//    public void armarManager() {
//        frame = new JFrame();
//        frame.setBounds(100, 100, 500, 500);
//
//        panelLista = new PanelLista(this);
//        panelLista.armarPanelLista();
//
//        panelFormulario = new PanelFormulario(this);
//        panelFormulario.armarPanelFormulario();
//
//    }
//
//    public void showFrame() {
//        frame.setVisible(true);
//
//    }
//
//    public void mostrarPanelLista() {
//        frame.getContentPane().removeAll();
//        frame.getContentPane().add(panelLista);
//        frame.getContentPane().validate();
//        frame.getContentPane().repaint();
//
//    }
//
//    public void mostrarPanelFormulario() {
//        frame.getContentPane().removeAll();
//        frame.getContentPane().add(panelFormulario);
//        frame.getContentPane().validate();
//        frame.getContentPane().repaint();
//    }
//
//}
//