package View;

import Packages.TextPrompt;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrameLogin extends JFrame{

    // General
    JButton btnIniciar = new JButton("Iniciar");
    JButton btnSalir = new JButton("Salir");
    JButton btnRegister = new JButton("Registrarse");
    JPanel login;
    JPanel buttons;

    // Usuario
    JLabel userLabel = new JLabel("Usuario", JLabel.CENTER);
    JTextField userTextField = new JTextField();
    TextPrompt userPH = new TextPrompt("Usuario", userTextField);

    // Contraseña
    JLabel passLabel = new JLabel("Contraseña", JLabel.CENTER);
    JPasswordField passTextField = new JPasswordField();
    TextPrompt passPH = new TextPrompt("Contraseña", passTextField);

    PanelManager panelManager;


    public FrameLogin(){
        initLoginPanel();
        setLayout(new GridLayout(2,1));
        setTitle("OdontoSystem");
        setSize(300, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initButtonPanel();
        initListeners();
        this.add(login);
        this.add(buttons);
        setVisible(true);
    }


    private void initListeners() {
        ActionListener cerrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        ActionListener iniciar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                panelManager = new PanelManager();
                panelManager.armarManager();
                panelManager.mostrarFrame();
                panelManager.mostrarPanelPrincipal();
            }
        };
        ActionListener registrar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
            }
        };
            
        btnIniciar.addActionListener(iniciar);
        btnSalir.addActionListener(cerrar);
        btnRegister.addActionListener(registrar);
    }

    private void initButtonPanel(){
        buttons = new JPanel();
        buttons.setLayout(new FlowLayout());
        buttons.add(btnIniciar);
        buttons.add(btnSalir);
        buttons.add(btnRegister);
    }

    private void initLoginPanel(){
        login = new JPanel();
        login.setLayout(new GridLayout(2,2));
        login.add(userLabel);
        login.add(userTextField);
        login.add(passLabel);
        login.add(passTextField);
    }
}