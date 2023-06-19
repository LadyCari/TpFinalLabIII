package com.example.tp_final_laboraotirio_iii.Modelos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Clases {

    public String[] getDialogo() {

        String dialogoClase1Melina[] = {"Java es un lenguaje de programación caracterizado por su portabilidad \n" , "desarrollado a mediados de los 90 por James Gosling y su equipo en Sun Microsystems. \n" , "Se popularizó para aplicaciones de servidor y para la Web \n" , "y por su utilización en la creación de aplicaciones para dispositivos móviles. \n" , "Cuando mencionamos portabilidad nos referimos a la capacidad que tiene de ser ejecutado  en cualquier plataforma que tenga el JDK que implemente la JVM."};

        switch (1){

            case 1:
                return dialogoClase1Melina;
        }
        return null;
    }

}


