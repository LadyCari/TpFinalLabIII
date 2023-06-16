package com.example.tp_final_laboraotirio_iii.Modelos;

import java.io.Serializable;

public class GameData implements Serializable {

    public enum eventoCompletado {
        COMPLETADO, NO_COMPLETADO
    }

    public enum AsistenciaClase {
        PRESENTE, NO_PRESENTE
    }


    private int fecha;

    private eventoCompletado EventoCompletado;

    private AsistenciaClase asistenciaClase;

    public GameData() {
    }

    public GameData(int fecha, eventoCompletado eventoCompletado, AsistenciaClase asistenciaClase) {
        this.fecha = fecha;
        EventoCompletado = eventoCompletado;
        this.asistenciaClase = asistenciaClase;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public eventoCompletado getEventoCompletado() {
        return EventoCompletado;
    }

    public void setEventoCompletado(eventoCompletado eventoCompletado) {
        EventoCompletado = eventoCompletado;
    }

    public AsistenciaClase getAsistenciaClase() {
        return asistenciaClase;
    }

    public void setAsistenciaClase(AsistenciaClase asistenciaClase) {
        this.asistenciaClase = asistenciaClase;
    }

    @Override
    public String toString() {
        return "GameData{" +
                "fecha=" + fecha +
                ", EventoCompletado=" + EventoCompletado +
                ", asistenciaClase=" + asistenciaClase +
                '}';
    }
}
