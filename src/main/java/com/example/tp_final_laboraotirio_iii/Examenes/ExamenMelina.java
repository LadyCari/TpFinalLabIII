package com.example.tp_final_laboraotirio_iii.Examenes;

import com.example.tp_final_laboraotirio_iii.Gestion.GestionPersonaje;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import javafx.fxml.FXML;

import java.util.List;

public class ExamenMelina {


    public void gestionExamen(){

        PersonajeRepo personajeRepo=new PersonajeRepo();
        List<Personaje> personajes= personajeRepo.Listar();
        int indice=0;

        if(!personajes.isEmpty())
        {
            while (indice<10)
            {


                indice++;
            }
        }
    }

    public String getPreguntas(int indice){

        String[] Preguntas={"",""};

        return Preguntas[indice];
    }
    public String getRespuestas1(int indice)
    {
        String[] Respuestas1={};

        return Respuestas1[indice];
    }
    public String getRespuestas2(int indice)
    {
        String[] Respuestas2={};

        return Respuestas2[indice];
    }
    public String getRespuestas3(int indice)
    {
        String[] Respuestas3={};

        return Respuestas3[indice];
    }
    public String getRespuestas4(int indice)
    {
        String[] Respuestas4={};

        return Respuestas4[indice];
    }
}
/*
    @FXML
    private Label textoProfesor2;
    @FXML
    private Label textoProfesor;

    @FXML
    private Label textoProfesor1;
    @FXML
    private Label textoProfesor11;
    @FXML
    private Label textoProfesor111;



    @FXML
    private Button botonRta1;

    @FXML
    private Button BotonRta2;

    @FXML
    private Button botonRta3;

    @FXML
    private Button botonRta4;

    public void submit(ActionEvent event) {
        GestionPersonaje pj = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();

        if (indiceMensajes == 0) {
            textoProfesor.setText(arregloCopia[indiceMensajes]);
            siguientetextoclase.setDisable(false);
            terminarClase.setDisable(true);
            textoAnteriorClase.setDisable(true);
            indiceMensajes++;
        } else if (indiceMensajes < arregloCopia.length) {
            textoProfesor.setText(arregloCopia[indiceMensajes]);
            indiceMensajes++;
            updateOtrobotonState();
        } else {
            textoProfesor.setText("Asi concluye la clase nos veremos la proxima");
            siguientetextoclase.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
            terminarClase.setDisable(false);
            textoAnteriorClase.setDisable(true);
        }
    }

    public void textoAnteriorDialogoProfesor(ActionEvent event) {
        if (indiceMensajes == 0) {
            textoProfesor.setText(arregloCopia[indiceMensajes]);
            siguientetextoclase.setDisable(false);
            terminarClase.setDisable(true);
            textoAnteriorClase.setDisable(true);
        } else {
            indiceMensajes--;
            textoProfesor.setText(arregloCopia[indiceMensajes]);
            updateOtrobotonState();
        }

    }
        */