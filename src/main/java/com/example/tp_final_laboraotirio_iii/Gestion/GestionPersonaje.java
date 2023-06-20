package com.example.tp_final_laboraotirio_iii.Gestion;

import com.example.tp_final_laboraotirio_iii.Modelos.GameData;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;

import java.util.ArrayList;
import java.util.List;

public class GestionPersonaje {

    //region atributos
    Personaje personaje;
    List <GameData> gameData;
//endregion

    //region g y s

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public List<GameData> getGameData() {
        return gameData;
    }

    public void setGameData(List<GameData> gameData) {
        this.gameData = gameData;
    }

//endregion

    //region construccion


    public GestionPersonaje(Personaje personaje, List<GameData> gameData) {
        this.personaje = personaje;
        this.gameData = gameData;
    }

    public GestionPersonaje() {
    }
    //endregion

    //region metodo
    public Personaje cargarPersonaje(){

        PersonajeRepo repo = new PersonajeRepo();

        return repo.Listar().get(0);
    }

    public List<GameData> listaGameData(){

        return cargarPersonaje().getGuardadoPartida();
    }

    public int ultimoDia(){

        return listaGameData().size();
    }

    public GameData.AsistenciaClase getAsistenciaDia(){

        return listaGameData().get(ultimoDia()-1).getAsistenciaClase();
    }

    public void setAsistenciaDia(GameData.AsistenciaClase asistencia){

        listaGameData().get(ultimoDia()-1).setAsistenciaClase(asistencia);

    }
/*
    public void descontarDinero (double gasto){
       Personaje pj = cargarPersonaje();

       if (pj.getDinero() > gasto){


           pj.setDinero(pj.getDinero()-gasto);
       }
*/

//endregion
    }



