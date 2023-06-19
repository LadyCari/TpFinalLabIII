package com.example.tp_final_laboraotirio_iii;

import com.example.tp_final_laboraotirio_iii.Gestion.GestionClases;
import com.example.tp_final_laboraotirio_iii.Modelos.GameData;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Objects;

public class SceneController {

    //region atributos
    private Stage stage;
    private Scene scene;
    private Parent root;
//endregion

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    //region menu principal
    public void switchToMenuPrincipal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/MenuPrincipal.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToCrearPersonaje(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/CrearPersonaje.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToInstrucciones(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/Instrucciones.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToCargarPartida(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/PantallaCargaPartida.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToSalir(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    //endregion

    public void switchToPasilloPrincipal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/PasilloPrincipal.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //region aulas y profesores

    public void switchToaulaGeneralVacia(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/AulaGeneralVacia.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToMaleniaGurciaTPfinal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/MaleniaGurciaTPfinal.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToMaleniaGurciaNormal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ClaseMaleniaGurcia.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToaulaAgustinVacia(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/AulaVaciaAdisgustinBatizi.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//endregion

    public void switchToBuffetPrincipal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/BuffetPrincipal.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToContadorDias(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ScenaPasarDias.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void switchScene(Parent root) {
        if (stage != null) {
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } else {
            System.out.println("Error: El stage es nulo. Asegúrate de haber asignado el stage correctamente en el controlador.");
        }
    }


    ///Metodos de los escenarios///

    public void CargarNombreUsuario(ActionEvent event) {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        Personaje personaje = new Personaje(txtName.getText());
        ArrayList<GameData>ListaDatos = new ArrayList<>();

        GameData gameData = new GameData();

        gameData.setAsistenciaClase(GameData.AsistenciaClase.PRESENTE);

        gameData.setEventoCompletado(GameData.eventoCompletado.COMPLETADO);

        gameData.setFecha("1");

        ListaDatos.add(gameData);

        personaje.setGuardadoPartida(ListaDatos);

        personajeRepo.Agregar(personaje);

        switchToContadorDias(event);

    }

    public void CrearPersonaje(ActionEvent event) {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        Personaje personaje1 = new Personaje();

        switchToCargarPartida(event);
    }

    public void ControlDeJugadores(ActionEvent event) {
        PersonajeRepo repo = new PersonajeRepo();
        ArrayList<Personaje> lista = repo.Listar();

        int cantidad = lista.size();

        if (cantidad < 2) {
            switchToCrearPersonaje(event);
        } else {
            switchToInstrucciones(event);
        }
    }

    //El usuario al cargar el jugador se hardcodee la posicion del arreglo de jugadores para obtener los datos mas facilmente //Recordatorio
    public void UpdateDia() {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();
        Personaje personaje =  lista.get(0);
        ArrayList<GameData> ListaDatos = personaje.getGuardadoPartida();
        //Probar aumentar los dias segun entre a este metodo

        registroDias.setText(String.valueOf(ListaDatos.size()));
    }


    public void CambiarDias(ActionEvent event) {
        switchToPasilloPrincipal(event);

        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();
        Personaje personaje =  lista.get(0);
        ArrayList<GameData> ListaDatos = personaje.getGuardadoPartida();
        GameData gameData = new GameData();
        gameData.setFecha(String.valueOf(ListaDatos.size()+1));
        gameData.setAsistenciaClase(GameData.AsistenciaClase.PRESENTE);
        gameData.setEventoCompletado(GameData.eventoCompletado.NO_COMPLETADO);
        ListaDatos.add(gameData);
        personajeRepo.Modificar(personaje);

        UpdateDia();

    }


    public void CondicionDeEvento(ActionEvent event) {
        int isConditionMet = 2;

        if (isConditionMet == 0) {
            switchToMaleniaGurciaNormal(event);
        } else if (isConditionMet == 1) {
            switchToMaleniaGurciaTPfinal(event);
        } else {
            switchToaulaGeneralVacia(event);
        }
    }

    public void aula1(ActionEvent event) {
        // Aquí va tu lógica para determinar el contexto
        GestionClases texto = new GestionClases();
        PersonajeRepo repo = new PersonajeRepo();
        GameData pj = new GameData();

        switch (pj.getFecha()){
            case 1:
                if (pj.getAsistenciaClase().equals(GameData.AsistenciaClase.NO_PRESENTE)){
                    switchToMaleniaGurciaNormal(event);
                    texto.submit(event);
                } else {
                    switchToaulaGeneralVacia(event);
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }

    }
}
