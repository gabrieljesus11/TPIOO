package View;

import Packages.TextPrompt;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelOdontologo extends JPanel{

    // General
    JButton btnRegistrar = new JButton("Registrar");
    JButton btnSalir = new JButton("Cancelar");
    JPanel titulo;
    JPanel pNombre;
    JPanel pApellido;
    JPanel pMatricula;
    JPanel buttons;

    JLabel title = new JLabel("Creación de Odontologo", JLabel.CENTER);
    // Nombre
    JLabel nombreLabel = new JLabel("Nombre", JLabel.CENTER);
    JTextField nombreTextField = new JTextField();
    TextPrompt nombrePH = new TextPrompt("Nombre", nombreTextField);

    // Apellido
    JLabel apellidoLabel = new JLabel("Apellido", JLabel.CENTER);
    JTextField apellidoTextField = new JTextField();
    TextPrompt apellidoPH = new TextPrompt("Apellido", apellidoTextField);

    // Matricula
    JLabel matriculaLabel = new JLabel("Matricula", JLabel.CENTER);
    JTextField matriculaTextField = new JTextField();
    TextPrompt matriculaPH = new TextPrompt("Matricula", matriculaTextField);
    public Object armarPanelOdontologo;

    private PanelManager panelManager;


    public PanelOdontologo(PanelManager panelManager){
        this.panelManager = panelManager;
    }


    private void initListeners() {
        ActionListener cerrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelManager.cerrarFrame();
                panelManager = new PanelManager();
                panelManager.armarManager();
                panelManager.mostrarFrame();
                panelManager.mostrarPanelPrincipal();
            }
        };
        ActionListener iniciar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Aquí va la lógica de iniciar sesión");
            }
        };

        btnRegistrar.addActionListener(iniciar);
        btnSalir.addActionListener(cerrar);

    }

    private void initButtonPanel(){
        buttons = new JPanel();
        buttons.setLayout(new FlowLayout());
        buttons.add(btnRegistrar);
        buttons.add(btnSalir);
    }

    private void initOdontologoPanel(){
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
    
    private void initMatriculaPanel(){
        pMatricula = new JPanel();
        pMatricula.setLayout(new GridLayout(1,2));
        pMatricula.add(matriculaLabel);
        pMatricula.add(matriculaTextField);
    }

    void armarPanelOdontologo(){
        
        this.removeAll();

        // Inicializamos los Paneles
        initOdontologoPanel();
        initNombrePanel();
        initApellidoPanel();
        initMatriculaPanel();
        initButtonPanel();
        // Configuramos el Frame
        setLayout(new GridLayout(5, 1));
        setSize(300, 200);
        initListeners();
        // Agregamos los paneles
        this.add(titulo);
        this.add(pNombre);
        this.add(pApellido);
        this.add(pMatricula);
        this.add(buttons);
        setVisible(true);
    }
}