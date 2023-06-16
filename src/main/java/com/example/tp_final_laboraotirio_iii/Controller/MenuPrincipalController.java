package com.example.tp_final_laboraotirio_iii.Controller;

import com.example.tp_final_laboraotirio_iii.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPrincipalController {
private Stage stage;
    @FXML
    private Button NuevaPartida;

    @FXML
    void showCrearPersonaje(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CrearPersonaje.fxml"));
        Parent root = fxmlLoader.load();
        CrearPersonajeController controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(stage);
        stage.show();
        this.stage.close();
    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;
    }
}

