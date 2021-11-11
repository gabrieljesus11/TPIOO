package Servicio;

import DAO.OdontologoDAO;
import DAO.OdontologoDAOArchivo;
import Negocio.Odontologo;

import java.util.List;

public class OdontologoServicio {

    private OdontologoDAO odontologoDAO;

    public OdontologoServicio()
    {
        odontologoDAO = new OdontologoDAOArchivo();
    }

    public void Registrar(Odontologo odontologo)
    {
        odontologoDAO.Registrar(odontologo);
    }

    public void Modificar(Odontologo odontologo)
    {
        odontologoDAO.Modificar(odontologo);
    }

    public Odontologo Buscar(long id)
    {
        return odontologoDAO.Buscar(id);
    }

    public List<Odontologo> Listar()
    {
        return odontologoDAO.Listar();
    }
}
