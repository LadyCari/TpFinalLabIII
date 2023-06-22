package com.example.tp_final_laboraotirio_iii.Modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
    private int id;

    private ArrayList<Integer>ListaNotas = new ArrayList<>(Arrays.asList(0,0,0,0));
    private ArrayList<GameData>GuardadoPartida = new ArrayList<>();
    //endregion

    //region constructor
    public Personaje() {
    }

    public Personaje(String nombre) {
        this.id = 1;
        this.Nombre = nombre;
        this.EstadoEstres = estadoEstres.RELAJADO;
        this.Estres = 0;
        this.dinero = 100;
        this.buffet = Random();
    }
//endregion

    //region G y S


    public int getDinero() {
        return dinero;
    }
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public ArrayList<Integer> getListaNotas() {
        return ListaNotas;
    }
    public void setListaNotas(ArrayList<Integer> listaNotas) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //endregion

    //region Metodo para generar una bebida favorita random
    private Buffet Random()
    {
        Buffet[]comidas = Buffet.values();
        Random random = new Random();

        return comidas[random.nextInt(6)];
    }
    //endregion

    //region toString

    @Override
    public String toString() {
        return "Personaje{" +
                "Nombre='" + Nombre + '\'' +
                ", Estres=" + Estres +
                ", buffet=" + buffet +
                ", EstadoEstres=" + EstadoEstres +
                ", dinero=" + dinero +
                ", id=" + id +
                ", ListaNotas=" + ListaNotas +
                '}';
    }
//endregion
}
