package com.example.tp_final_laboraotirio_iii.Gestion;

import com.example.tp_final_laboraotirio_iii.Modelos.GameData;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;

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
        repo.Modificar(personaje);
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
        } else if (stress <= 75) {
            personaje.setEstadoEstres(Personaje.estadoEstres.NERVIOSO);
        }else {
            personaje.setEstadoEstres(Personaje.estadoEstres.ESTRESADO);
        }
        repo.Modificar(personaje);
    }

    public void actualizarBuffet(String bebida, int gasto){

        if (descontarDinero(gasto)) {
            if (personaje.getBuffet().name().equals(bebida)) {
                personaje.setEstres(personaje.getEstres() - 10);
            } else {
                personaje.setEstres(personaje.getEstres() - 5);
            }
        }
        if (personaje.getEstres() < 0) {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void restarStressJuegos (Personaje personaje, int stress){

        personaje.setEstres(personaje.getEstres() - stress);

        if (personaje.getEstres() < 0) {
            personaje.setEstres(0);
        }

        repo.Modificar(personaje);
        cambioEstado(personaje.getEstres());
    }

    public void sumarStressPersonaje(Personaje personaje, int estres){

        personaje.setEstres(personaje.getEstres() + estres);
        if (personaje.getEstres() >= 100) {
            personaje.setEstres(100);
        }
        repo.Modificar(personaje);
    }
//endregion
    }



