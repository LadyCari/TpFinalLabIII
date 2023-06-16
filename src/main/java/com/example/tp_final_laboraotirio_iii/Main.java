package com.example.tp_final_laboraotirio_iii;

import com.example.tp_final_laboraotirio_iii.Modelos.GameData;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MaleniaGurciaTPfinal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //launch();

        PersonajeRepo personajeRepo = new PersonajeRepo();

        Personaje personaje = new Personaje("Santurro03");

        GameData gameData = new GameData();

        gameData.setAsistenciaClase(GameData.AsistenciaClase.PRESENTE);

        gameData.setEventoCompletado(GameData.eventoCompletado.COMPLETADO);

        gameData.setFecha(1);

        ArrayList<GameData> listaGuardados = personaje.getGuardadoPartida();

        listaGuardados.add(gameData);

        personajeRepo.Agregar(personaje);

        System.out.println(personaje);




    }
}