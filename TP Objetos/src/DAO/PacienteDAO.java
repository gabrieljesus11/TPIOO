package DAO;

import Negocio.Paciente;

import java.util.List;

public interface PacienteDAO {

    public void Registrar(Paciente paciente);
    public void Modificar(Paciente paciente);
    public void Eliminar(long id);
    public List<Paciente> Listar();
    public Paciente Buscar(long id);

}
