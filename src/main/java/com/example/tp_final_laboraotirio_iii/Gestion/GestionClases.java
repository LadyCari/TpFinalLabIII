package com.example.tp_final_laboraotirio_iii.Gestion;

import com.example.tp_final_laboraotirio_iii.Modelos.Clases;
import com.example.tp_final_laboraotirio_iii.Modelos.GameData;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionClases {

    public String[] getMensajes() {
        return arregloCopia;
    }

    public void setMensajes(String[] mensajes) {
        arregloCopia = mensajes;
    }

    //region scBuilder
    @FXML
    private Label texto;
    @FXML
    private Button botonAtras;
    @FXML
    private Button botonSiguiente;
    @FXML
    private Button botonTerminar;
    //endregion

    private int indiceMensajes = 0;
    private String[] arregloCopia;

    //copiamos del arreglo de clases al local para trabajar con los metodos
    Clases clase = new Clases();

    public void cargarArregloTeoriaParaMostrar(GameData pj){
        int fecha = Integer.parseInt(pj.getFecha());
        this.arregloCopia = Arrays.copyOf(clase.getDialogo(fecha), clase.getDialogo(fecha).length);
    }

    public void submit(ActionEvent event) {

        if (indiceMensajes == 0){
            botonAtras.setDisable(true);
            botonSiguiente.setDisable(false);
            botonTerminar.setDisable(true);
        } else if (indiceMensajes < arregloCopia.length) {
            texto.setText(arregloCopia[indiceMensajes]);
            indiceMensajes++;
            updateOtrobotonState();
        } else {
            texto.setText("Asi concluye la clase nos veremos la proxima");
            botonSiguiente.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
            botonTerminar.setDisable(false);
            botonAtras.setDisable(false);
        }
    }

    public void initialize() {

        updateOtrobotonState();

        if(indiceMensajes >= arregloCopia.length)
        {
            switchToSalir(null);
        }

    }

    private void updateOtrobotonState() {
        botonSiguiente.setDisable(true);
        botonAtras.setVisible(true);
        botonTerminar.setVisible(true);
    }

    public void switchToSalir(ActionEvent event) {
        Stage stage = (Stage) botonTerminar.getScene().getWindow();
        stage.close();
    }
}

