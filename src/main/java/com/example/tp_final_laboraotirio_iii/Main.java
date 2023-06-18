package com.example.tp_final_laboraotirio_iii;

import com.example.tp_final_laboraotirio_iii.Modelos.GameData;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tp_final_laboraotirio_iii/MenuPrincipal.fxml"));
        Parent root = loader.load();

        SceneController controller = loader.getController();
        controller.setStage(stage);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        //launch();

        //region test
        PersonajeRepo personajeRepo = new PersonajeRepo();

        Personaje personaje = new Personaje("Santurro03");

        GameData gameData = new GameData();

        gameData.setAsistenciaClase(GameData.AsistenciaClase.PRESENTE);

        gameData.setEventoCompletado(GameData.eventoCompletado.COMPLETADO);

        gameData.setFecha(1);

        GameData gameData2 = new GameData();

        gameData2.setAsistenciaClase(GameData.AsistenciaClase.PRESENTE);

        gameData2.setEventoCompletado(GameData.eventoCompletado.COMPLETADO);

        gameData2.setFecha(2);

        ArrayList<GameData> listaGuardados = personaje.getGuardadoPartida();

        listaGuardados.add(gameData);
        listaGuardados.add(gameData2);

        personajeRepo.Agregar(personaje);

        System.out.println(personaje);
        //endregion

    }

}