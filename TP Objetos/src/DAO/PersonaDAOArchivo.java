package DAO;

import Negocio.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOArchivo implements PersonaDAO{

    @Override
    public void Guardar(Persona persona) {

        //1 recuperar de un archivo todo el listado de personas
        List<Persona> lista = Listar();

        if(lista == null)
            lista = new ArrayList<>();

        int idMax = 0;
        //2 preguntar si id de la persona es igual a cero
        if(persona.getId() == 0)
        {
            for(Persona p:lista) {
                if (p.getId() > idMax)
                    idMax = p.getId();
            }
            //3 agregar a persona dentro de la lista de personas
            persona.setId(idMax + 1);
            lista.add(persona);
        }else
        {
            //4 si el id es difernte de cero tengo que modificar los atributos de la persona con ese id
            for(Persona p:lista) {
                if(p.getId() == persona.getId())
                {
                    p.setApellido(persona.getApellido());
                    p.setEdad(persona.getEdad());
                    p.setNombre(persona.getNombre());
                }
            }
        }
        //5 guardar el listado en el archivo
        Archivo archivoPersonas = new Archivo("personas.txt");
        archivoPersonas.Guardar(lista);
    }

    @Override
    public void Eliminar(long id) {
        //1 recuperar de un archivo todo el listado de personas
        List<Persona> listado = Listar();
        //2 buscar en el listado de personas una persona con el id que viene por parametro

        int i = 0;
        boolean encontro = false;
        while(i < listado.size() && !encontro)
        {
            //3 si lo encontre lo elimino de la lista
            Persona p = listado.get(i);
            if(p.getId() == id)
            {
                listado.remove(p);
                encontro = true;
            }
            i++;
        }

        //4 guardar el listado en el archivo
        Archivo archivoPersonas = new Archivo("personas.txt");
        archivoPersonas.Guardar(listado);

    }

    @Override
    public List<Persona> Listar() {
        //1 recuperar de un archivo todo el listado de personas
        Archivo archivoPersonas = new Archivo("personas.txt");
        List lista = archivoPersonas.Recuperar();

        if(lista == null)
            lista = new ArrayList<>();
        //2 retornar ese listado*/
        return lista;
    }

    @Override
    public Persona Buscar(long id) {
        //1 recuperar de un archivo todo el listado de personas
        List<Persona> listado = Listar();
        //2 buscar dentro de ese listado una persona con el id que viene por parametro en este metodo
        for(Persona p : listado) {
            //3 si lo encuentro retornar ese objeto persona.
            if (p.getId() == id)
                return p;
        }
        return null;
    }
}
