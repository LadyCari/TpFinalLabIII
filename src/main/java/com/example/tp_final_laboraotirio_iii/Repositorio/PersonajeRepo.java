package com.example.tp_final_laboraotirio_iii.Repositorio;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonajeRepo implements IRepositorio<Personaje>{

    private final File file = new File("src/main/resources/Archivos/guardados.json");

    private final ObjectMapper Mapper = new ObjectMapper();

    private ArrayList<Personaje>listaPersonajes; //Actualmente estamos trabajando con un solo dato, pero estamos utilizando un arreglo porque al principio teniamos la idea de que sean varios jugadores, pero por complicaciones tuvimos que reducir la cantidad y modificar en este momento el atributo nos llevaria a muchos errores y nos atrasaria.

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

        this.listaPersonajes.removeIf(personaje -> personaje.getId() == id);

        Guardar();

    }

    @Override
    public void Modificar(Personaje objeto) {

        Cargar();

        for(Personaje aux : this.listaPersonajes)
        {
            aux.setGuardadoPartida(objeto.getGuardadoPartida());
            aux.setDinero(objeto.getDinero());
            aux.setEstres(objeto.getEstres());
            aux.setEstadoEstres(objeto.getEstadoEstres());
            aux.setListaNotas(objeto.getListaNotas());
        }

        Guardar();

    }
}