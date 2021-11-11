package Servicio;

import DAO.PersonaDAO;
import DAO.PersonaDAOArchivo;
import Negocio.Persona;

import java.util.List;

public class PersonaServicio {

    private PersonaDAO personaDAO;

    public PersonaServicio()
    {
        personaDAO = new PersonaDAOArchivo();
    }

    public void Guardar(Persona persona)
    {
        personaDAO.Guardar(persona);
    }

    public void Eliminar(long id)
    {
        personaDAO.Eliminar(id);
    }

    public Persona Buscar(long id)
    {
        return personaDAO.Buscar(id);
    }

    public List<Persona> Listar()
    {
        return personaDAO.Listar();
    }
}
