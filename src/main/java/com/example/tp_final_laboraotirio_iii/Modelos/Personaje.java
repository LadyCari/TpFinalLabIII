package com.example.tp_final_laboraotirio_iii.Modelos;



import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;

import java.io.Serializable;
import java.util.ArrayList;

public class Personaje implements Serializable{

    public enum estadoEstres
    {
        RELAJADO,NERVIOSO,ESTRESADO
    }

    private String nombre;

    private int Estres;

    private Buffet buffet;

    private estadoEstres EstadoEstres;

    private int idPersonaje;

    transient PersonajeRepo personajeRepo = new PersonajeRepo();

    private ArrayList<GameData>GuardadoPartida = new ArrayList<>();


    transient ArrayList<Personaje>contadorPersonajes;


    public Personaje() {
    }

    public Personaje(String nombre) {
        contadorPersonajes = personajeRepo.Listar();
        this.idPersonaje = contadorPersonajes.size();
        this.nombre = nombre;
        this.EstadoEstres = estadoEstres.RELAJADO;
        this.Estres = 0;
    }

    //region getset

    public estadoEstres getEstadoEstres() {
        return EstadoEstres;
    }

    public void setEstadoEstres(estadoEstres estadoEstres) {
        EstadoEstres = estadoEstres;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstres() {
        return Estres;
    }

    public void setEstres(int estres) {
        Estres = estres;
    }

    public Buffet getBuffet() {
        return buffet;
    }

    public void setBuffet(Buffet buffet) {
        this.buffet = buffet;
    }

    public ArrayList<GameData> getGuardadoPartida() {
        return GuardadoPartida;
    }

    public void setGuardadoPartida(ArrayList<GameData> guardadoPartida) {
        GuardadoPartida = guardadoPartida;
    }

    //endregion

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", Estres=" + Estres +
                ", buffet=" + buffet +
                ", EstadoEstres=" + EstadoEstres +
                ", idPersonaje=" + idPersonaje +
                '}';
    }
}
