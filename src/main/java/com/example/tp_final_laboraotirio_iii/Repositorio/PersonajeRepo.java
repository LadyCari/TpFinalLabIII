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

    private Personaje personaje;

    @Override
    public void Cargar() {
        if (file.exists()) {
            try {
                this.personaje = Mapper.readValue(file, Personaje.class);
            } catch (IOException e) {
                this.personaje = null;
            }
        } else {
            System.out.println("No existe");
        }
    }

    @Override
    public void Guardar() {
        try
        {
            Mapper.writerWithDefaultPrettyPrinter().writeValue(file,this.personaje);

        }catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Personaje> Listar() {
return null;
    }



    @Override
    public void Agregar(Personaje... objeto) {
    }

    @Override
    public void Eliminar(int id) {

        Cargar();

        Guardar();

    }

    @Override
    public void Modificar(Personaje objeto) {

        Cargar();

        objeto.setGuardadoPartida(objeto.getGuardadoPartida());

        Guardar();

    }
}
