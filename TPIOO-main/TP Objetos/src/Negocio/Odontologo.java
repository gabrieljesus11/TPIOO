package Negocio;

public class Odontologo extends Persona{

    private int matricula;

    public Odontologo(String apellido, String nombre, int matricula){
        super(apellido, nombre);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula > 0) {
            this.matricula = matricula;
        }
    }

    
}
