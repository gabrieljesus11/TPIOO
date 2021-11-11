package Servicio;

import DAO.PacienteDAO;
import DAO.PacienteDAOArchivo;
import Negocio.Paciente;

import java.util.List;

public class PacienteServicio {

    private PacienteDAO pacienteDAO;

    public PacienteServicio()
    {
        pacienteDAO = new PacienteDAOArchivo();
    }

    public void Registrar(Paciente paciente)
    {
        pacienteDAO.Registrar(paciente);
    }

    public void Modificar(Paciente paciente)
    {
        pacienteDAO.Modificar(paciente);
    }

    public void Eliminar(long id)
    {
        pacienteDAO.Eliminar(id);
    }

    public Paciente Buscar(long id)
    {
        return pacienteDAO.Buscar(id);
    }

    public List<Paciente> Listar()
    {
        return pacienteDAO.Listar();
    }
}
