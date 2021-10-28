import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;
import Model.*;
import View.Banner;
import View.FrameLogin;

public class Main
{
    public static void main(String[] args){

        
        //JFrame ventana = new JFrame("Mi primera ventana");
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
        //JLabel lblNombre = new JLabel();
        //lblNombre.setText("¿Desea Aceptar?     ");
        //JButton btnNombre = new JButton("Aceptar");
//
        //JPanel pnlPrincipal = new JPanel();
        ////agregar el lbl y el boton
        //pnlPrincipal.add(lblNombre);
        //pnlPrincipal.add(btnNombre);
//
        //pnlPrincipal.setLayout(new FlowLayout());
        //ventana.add(pnlPrincipal);
//
        //ventana.setSize(300,300);
//
        //ventana.pack(); // limpia la ventana de componentes, los acomoda
        //ventana.setVisible(true);
//
 //
//
        //Banner banner = new Banner();
        //banner.setVisible(true);
//

        FrameLogin login = new FrameLogin();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
