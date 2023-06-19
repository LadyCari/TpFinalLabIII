package com.example.tp_final_laboraotirio_iii.Repositorio;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonajeRepo implements IRepositorio<Personaje>{

    private final File file = new File("TpFinalLabIII\\src\\main\\resources\\Archivos\\guardados.json");

    private final ObjectMapper Mapper = new ObjectMapper();

    private ArrayList<Personaje>listaPersonajes;

    @Override
    public void Cargar() {
        if(file.exists())
        {
            try
            {
                CollectionType collectionType = Mapper.getTypeFactory().constructCollectionType(ArrayList.class,Personaje.class);
                this.listaPersonajes = Mapper.readValue(file,collectionType);
            }catch (IOException e)
            {
                listaPersonajes = new ArrayList<>();
            }
        }
        else
        {
            System.out.println("No existe");
        }
    }

    @Override
    public void Guardar() {
        try
        {
            Mapper.writerWithDefaultPrettyPrinter().writeValue(file,this.listaPersonajes);

        }catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Personaje> Listar() {

        Cargar();

        return this.listaPersonajes;
    }

    @Override
    public void Agregar(Personaje... objeto) {

        Cargar();

        this.listaPersonajes.addAll(List.of(objeto));

        Guardar();

    }

    @Override
    public void Eliminar(int id) {

        Cargar();

        this.listaPersonajes.removeIf(personaje -> personaje.getIdPersonaje() == id);

        Guardar();

    }

    @Override
    public void Modificar(Personaje objeto) {

        Cargar();

        for(Personaje aux : this.listaPersonajes)
        {
            aux.setGuardadoPartida(objeto.getGuardadoPartida());
        }

        Guardar();

    }
}
