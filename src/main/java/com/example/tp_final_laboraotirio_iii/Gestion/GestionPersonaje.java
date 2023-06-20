package com.example.tp_final_laboraotirio_iii.Gestion;

import com.example.tp_final_laboraotirio_iii.Modelos.GameData;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;

import java.util.ArrayList;
import java.util.List;

public class GestionPersonaje {

    //region atributos
    PersonajeRepo repo = new PersonajeRepo();
    Personaje personaje = repo.Listar().get(0);

    //endregion

    //region metodo
    public Personaje cargarPersonaje(){
        return personaje;
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

    public boolean descontarDinero (int gasto){

        if (personaje.getDinero() >= gasto){
            personaje.setDinero(personaje.getDinero()-gasto);
            repo.Modificar(personaje);
            return true;
        }
        return false;
    }
    public void cambioEstado (int stress){
        if (stress <=45){
            personaje.setEstadoEstres(Personaje.estadoEstres.RELAJADO);
        } else if (stress <= 70) {
            personaje.setEstadoEstres(Personaje.estadoEstres.NERVIOSO);
        }else {
            personaje.setEstadoEstres(Personaje.estadoEstres.ESTRESADO);
        }
        repo.Modificar(personaje);
    }

/*
    public void descontarDinero ( gasto){
       Personaje pj = cargarPersonaje();

       if (pj.getDinero() > gasto){


           pj.setDinero(pj.getDinero()-gasto);
       }
*/

//endregion
    }



