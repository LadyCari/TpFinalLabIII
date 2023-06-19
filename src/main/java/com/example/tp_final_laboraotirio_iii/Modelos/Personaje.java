package com.example.tp_final_laboraotirio_iii.Modelos;



import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;

import java.io.Serializable;
import java.util.ArrayList;

public class Personaje implements Serializable{

    //region atributos
    public enum estadoEstres
    {
        RELAJADO,NERVIOSO,ESTRESADO
    }
    private String Nombre;
    private int Estres;
    private Buffet buffet;
    private estadoEstres EstadoEstres;
    private int dinero;

    private static ArrayList<Integer>ListaNotas = new ArrayList<>(3);

    transient PersonajeRepo personajeRepo = new PersonajeRepo();

    private ArrayList<GameData>GuardadoPartida = new ArrayList<>();
    //endregion

//region constructor
    public Personaje() {
    }

    public Personaje(String nombre) {
        this.Nombre = nombre;
        this.EstadoEstres = estadoEstres.RELAJADO;
        this.Estres = 0;
        this.dinero = 300;
    }
//endregion

    //region G y S

    public int getDinero() {
        return dinero;
    }
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public static ArrayList<Integer> getListaNotas() {
        return ListaNotas;
    }
    public static void setListaNotas(ArrayList<Integer> listaNotas) {
        ListaNotas = listaNotas;
    }
    public estadoEstres getEstadoEstres() {
        return EstadoEstres;
    }
    public void setEstadoEstres(estadoEstres estadoEstres) {
        EstadoEstres = estadoEstres;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
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

    //region toString
    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + Nombre + '\'' +
                ", Estres=" + Estres +
                ", buffet=" + buffet +
                ", EstadoEstres=" + EstadoEstres +
                ", idPersonaje=" +
                '}';
    }
    //endregion
}
