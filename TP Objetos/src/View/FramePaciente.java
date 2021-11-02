package View;

import Packages.TextPrompt;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FramePaciente extends JFrame{

    
    // General
    JButton btnRegistrar = new JButton("Registrar");
    JButton btnSalir = new JButton("Cancelar");
    JPanel titulo;
    JPanel pNombre;
    JPanel pApellido;
    JPanel pDomicilio;
    JPanel pDNI;
    JPanel pUsuario;
    JPanel pPassword;
    JPanel buttons;

    JLabel title = new JLabel("Creación de Paciente", JLabel.CENTER);
    // Nombre
    JLabel nombreLabel = new JLabel("Nombre", JLabel.CENTER);
    JTextField nombreTextField = new JTextField();
    TextPrompt nombrePH = new TextPrompt("Nombre", nombreTextField);

    // Apellido
    JLabel apellidoLabel = new JLabel("Apellido", JLabel.CENTER);
    JTextField apellidoTextField = new JTextField();
    TextPrompt apellidoPH = new TextPrompt("Apellido", apellidoTextField);

    // Domicilio
    JLabel domicilioLabel = new JLabel("Domicilio", JLabel.CENTER);
    JTextField domicilioTextField = new JTextField();
    TextPrompt domicilioPH = new TextPrompt("Domicilio", domicilioTextField);

    // DNI
    JLabel dniLabel = new JLabel("DNI", JLabel.CENTER);
    JTextField dniTextField = new JTextField();
    TextPrompt dniPH = new TextPrompt("DNI", dniTextField);

    // Usuario
    JLabel usuarioLabel = new JLabel("Usuario", JLabel.CENTER);
    JTextField usuarioTextField = new JTextField();
    TextPrompt usuarioPH = new TextPrompt("Usuario", usuarioTextField);

    // Contraseña
    JLabel passLabel = new JLabel("Contraseña", JLabel.CENTER);
    JTextField passTextField = new JTextField();
    TextPrompt passPH = new TextPrompt("Contraseña", passTextField);



    public FramePaciente(){

        // Inicializamos los Paneles
        initPacientePanel();
        initNombrePanel();
        initApellidoPanel();
        initDomicilioPanel();
        initDNIPanel();
        initUsuarioPanel();
        initPasswordPanel();
        initButtonPanel();

        // Configuramos el Frame
        setLayout(new GridLayout(8,1));
        setTitle("OdontoSystem");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initListeners();

        // Agregamos los paneles
        this.add(titulo);
        this.add(pNombre);
        this.add(pApellido);
        this.add(pDomicilio);
        this.add(pDNI);
        this.add(pUsuario);
        this.add(pPassword);
        this.add(buttons);
        setVisible(true);
    }


    private void initListeners() {
        ActionListener registrar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Aquí va la lógica de iniciar sesión");
                FrameLogin login = new FrameLogin();
                dispose();
                login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        };

        ActionListener cerrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameLogin login = new FrameLogin();
                login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
        };

        btnRegistrar.addActionListener(registrar);
        btnSalir.addActionListener(cerrar);

    }

    private void initButtonPanel(){
        buttons = new JPanel();
        buttons.setLayout(new FlowLayout());
        buttons.add(btnRegistrar);
        buttons.add(btnSalir);
    }

    private void initPacientePanel(){
        titulo = new JPanel();
        titulo.setLayout(new GridLayout(1,1));
        titulo.add(title);
    }

    private void initNombrePanel(){
        pNombre = new JPanel();
        pNombre.setLayout(new GridLayout(1,2));
        pNombre.add(nombreLabel);
        pNombre.add(nombreTextField);
    }

    private void initApellidoPanel(){
        pApellido = new JPanel();
        pApellido.setLayout(new GridLayout(1,2));
        pApellido.add(apellidoLabel);
        pApellido.add(apellidoTextField);
    }
    
    private void initDomicilioPanel(){
        pDomicilio = new JPanel();
        pDomicilio.setLayout(new GridLayout(1,2));
        pDomicilio.add(domicilioLabel);
        pDomicilio.add(domicilioTextField);
    }

    private void initDNIPanel(){
        pDNI = new JPanel();
        pDNI.setLayout(new GridLayout(1,2));
        pDNI.add(dniLabel);
        pDNI.add(dniTextField);
    }
    
    private void initUsuarioPanel(){
        pUsuario = new JPanel();
        pUsuario.setLayout(new GridLayout(1,2));
        pUsuario.add(usuarioLabel);
        pUsuario.add(usuarioTextField);
    }
    
    private void initPasswordPanel(){
        pPassword = new JPanel();
        pPassword.setLayout(new GridLayout(1,2));
        pPassword.add(passLabel);
        pPassword.add(passTextField);
    }
}