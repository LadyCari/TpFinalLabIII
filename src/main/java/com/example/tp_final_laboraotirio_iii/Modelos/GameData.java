package com.example.tp_final_laboraotirio_iii.Modelos;

import java.io.Serializable;

public class GameData implements Serializable {

    //region atributos
    public enum eventoCompletado {
        COMPLETADO, NO_COMPLETADO
    }

    public enum AsistenciaClase {
        PRESENTE, NO_PRESENTE
    }

    private String fecha;

    private eventoCompletado EventoCompletado;

    private AsistenciaClase asistenciaClase;
//endregion

    //region constructores
    public GameData() {
    }

    public GameData(String fecha, eventoCompletado eventoCompletado, AsistenciaClase asistenciaClase) {
        this.fecha = fecha;
        EventoCompletado = eventoCompletado;
        this.asistenciaClase = asistenciaClase;
    }
//endregion

    //region G Y S
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
//endregion

    //region toString
    @Override
    public String toString() {
        return "GameData{" +
                "fecha=" + fecha +
                ", EventoCompletado=" + EventoCompletado +
                ", asistenciaClase=" + asistenciaClase +
                '}';
    }
    //endregion
}
