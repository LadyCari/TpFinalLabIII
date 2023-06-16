package com.example.tp_final_laboraotirio_iii.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CrearPersonajeController {

    private Stage stage;
    @FXML
    private Button inicioJuego;

    @FXML
    private TextField txtName;

    @FXML
    void showPasilloPrincipal(ActionEvent event) {

    }

    public void init(Stage stage) {
this.stage = stage;
    }
}

