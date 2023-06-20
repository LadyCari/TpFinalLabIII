package com.example.tp_final_laboraotirio_iii.Modelos;

import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Clases {


    public String[] getDialogo() {


        String dialogoClase1Melina[] = {"Java es un lenguaje de programación caracterizado por su portabilidad desarrollado a mediados de los 90 por James Gosling y su equipo en Sun Microsystems." , "Se popularizó para aplicaciones de servidor y para la Web" , "y por su utilización en la creación de aplicaciones para dispositivos móviles." , "Cuando mencionamos portabilidad nos referimos a la capacidad que tiene de ser ejecutado  en cualquier plataforma que tenga el JDK que implemente la JVM."};
        String dialogoClase2Melina[] = {};
        String dialogoClase3Melina[] = {};
        String dialogoTPFinalMelina[] = {};
        String dialogoClase1Benoffi[] = {};

        switch (1){

            case 1:
                return dialogoClase1Melina;
            case 2:
                return dialogoClase2Melina;
            case 3:
                return dialogoClase3Melina;
            case 4:
                return dialogoTPFinalMelina;
            case 5:
                return dialogoClase1Benoffi;
        }
        return null;
    }

}


