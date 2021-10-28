package Model;

import java.text.*;
import java.util.*;

public class Paciente extends Persona{

    private String domicilio;
    private int dni;
    private String fechaAlta;
    private String user;
    private String pass;

    public Paciente(String apellido, String nombre, String domicilio, int dni, String user, String pass){
        super(apellido, nombre);

    }


    // Domicilio
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    // DNI
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    

    // Fecha
    public void setDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        fechaAlta = formatter.format(date);
    }
    
    public String getDate() { 
        return fechaAlta;
    }

    // Usuario
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    // Password
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
