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
    PersonajeRepo repo = new PersonajeRepo();
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

    public PersonajeRepo getRepo() {
        return repo;
    }

    public void setRepo(PersonajeRepo repo) {
        this.repo = repo;
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

    //retorna personaje desde el archivo
    public Personaje cargarPersonaje(){

        return repo.Listar().get(0);
    }

    //trae el personaje y retorna una lista de GameData
    public List<GameData> listaGameData(){

        return cargarPersonaje().getGuardadoPartida();
    }

    //retorna dia actual
    //usa el tamaño de la lista para ver el dia que esta
    public int ultimoDia(){

        return listaGameData().size();
    }

    //retorna que asistencia tiene a la clase
    public GameData.AsistenciaClase getAsistenciaDia(){

        return listaGameData().get(ultimoDia()-1).getAsistenciaClase();
    }

    //se le guarda al personaje la asistencia el ultimo dia
    public void setAsistenciaDia(GameData.AsistenciaClase asistencia){

        listaGameData().get(ultimoDia()-1).setAsistenciaClase(asistencia);
        repo.Modificar(personaje);
    }

//sacar dinero del personaje y actualizarlo
    public void descontarDinero (int gasto){

       if (personaje.getDinero() > gasto){
           personaje.setDinero(personaje.getDinero()-gasto);
           repo.Modificar(personaje);
       }
    }

    public void cambioEstado (int stress){
        if (stress <=45){
            personaje.setEstadoEstres(Personaje.estadoEstres.RELAJADO);
        } else if (stress <= 70) {
            personaje.setEstadoEstres(Personaje.estadoEstres.ESTRESADO);
        }else {
            personaje.setEstadoEstres(Personaje.estadoEstres.NERVIOSO);
        }
        repo.Modificar(personaje);
    }

    //obtenemos si el estado del evento completado o no
    public GameData.eventoCompletado getStadoEvento(){

        return listaGameData().get(ultimoDia()-1).getEventoCompletado();
    }

    //se le guarda al personaje la asistencia al evento el ultimo dia
    public void setStadoEvento(GameData.eventoCompletado asistencia){

        listaGameData().get(ultimoDia()-1).setEventoCompletado(asistencia);
        repo.Modificar(personaje);
    }
    //endregion
}



