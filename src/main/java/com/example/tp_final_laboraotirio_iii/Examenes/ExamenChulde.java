package com.example.tp_final_laboraotirio_iii.Examenes;

import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;

import java.util.List;

public class ExamenChulde {
    PersonajeRepo personajeRepo = new PersonajeRepo();
    List<Personaje> personajes = personajeRepo.Listar();
    String[] listaRespuestas;

    //region arreglo de strings
    String[] Preguntas = {"","","","","","","","","",""};
    String[] Respuestas1 ={"","","","","","","","","",""};
    String[] Respuestas2 ={"","","","","","","","","",""};
    String[] Respuestas3 ={"","","","","","","","","",""};
    String[] Respuestas4 ={"","","","","","","","","",""};    //endregion

    //region arreglo respuestas
    String[] respuestasTPFinal = {"1","2","3","2","4","1","2","3","2","3"};
    //endregion

    //region G y S strings
    public String[] getPreguntas(){
        return Preguntas;
    }
    public String[] getRespuestas1(){
        return Respuestas1;
    }
    public String[] getRespuestas2() {
        return Respuestas2;
    }
    public String[] getRespuestas3() {
        return Respuestas3;
    }
    public String[] getRespuestas4() {
        return Respuestas4;
    }

    public String[] getArregloRespuestasMelinaTPFinal(){
        return respuestasTPFinal;
    }
    //endregion
}
