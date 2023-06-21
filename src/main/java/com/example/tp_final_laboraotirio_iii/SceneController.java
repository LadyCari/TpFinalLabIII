package com.example.tp_final_laboraotirio_iii;

import com.example.tp_final_laboraotirio_iii.Examenes.ExamenMelina;
import com.example.tp_final_laboraotirio_iii.Gestion.GestionPersonaje;
import com.example.tp_final_laboraotirio_iii.Modelos.Clases;
import com.example.tp_final_laboraotirio_iii.Modelos.GameData;
import com.example.tp_final_laboraotirio_iii.Modelos.Personaje;
import com.example.tp_final_laboraotirio_iii.Repositorio.PersonajeRepo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SceneController {

    //region atributos
    private Stage stage;
    private Scene scene;
    private Parent root;
    //region FXML
    @FXML
    private Label registroDias;
    @FXML
    private TextField txtName;
    @FXML
    private Label textoProfesor;
    @FXML
    private Button textoAnteriorClase;
    @FXML
    private Button siguientetextoclase;
    @FXML
    private Button terminarClase;
    @FXML
    private Label txtUsuario1;
    @FXML
    private Label fechaCargarPartida;
    @FXML
    private Label dineroGanadoEnElDia1;
    @FXML
    private Label dineroGanadoEnElDia2;
    @FXML
    private Label muetraNombreUsuarioCreacionPj;
    @FXML
    private Label muetraBebidaFavoritaEnCreacionPj;
    @FXML
    public Label mostrarBebidaFavorita;
    @FXML
    public Label mostrarCordura;
    @FXML
    public Label mostrarDinero;
    @FXML
    public Label preguntaTPFinalMalenia;
    @FXML
    public Label tpFinalMaleniarespuesta1;
    @FXML
    public Label tpFinalMaleniarespuesta2;
    @FXML
    public Label tpFinalMaleniarespuesta3;
    @FXML
    public Label tpFinalMaleniarespuesta4;
    @FXML
    public TextField respuestaUsuarioTPFinalMelina;
    @FXML
    public Button elegirRespuestaTpFinalMalenia;
    @FXML
    public Button tpFinalMeleniaTerminarTp;
    @FXML
    public Button comenzarTpFinalMalenia;
    @FXML
    public Button cafeConLecheCafeteria;
    @FXML
    public Button cappuchinoCafeteria;
    @FXML
    public Button cortadoCafeteria;
    @FXML
    public Button lagrimaCafeteria;
    @FXML
    public Button jugoCafeteria;
    @FXML
    public Button teCafeteria;
    @FXML
    public Button deCafeteriaABuffetGeneral;
    //endregion

//endregion

    //region G Y S
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public String[] getMensajes() {
        return arregloCopia;
    }

    public void setMensajes(String[] mensajes) {
        arregloCopia = mensajes;
    }
    //endregion

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

    public void switchToInformacionPjCredo(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/informacionCreacionPj.fxml")));
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

    public void switchToSlotsLlenos(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/AdvertenciaSlotLlenos.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToAdvertenciaSlotVacio(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ScenaAdvertenciaCrearPj.fxml"))));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //endregion

    //region pasillo principal
    public void switchToPasilloPrincipal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/PasilloPrincipal.fxml"))));
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

    public void switchToFinalizarDias(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ScenaFinalizarDia.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//endregion

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

    public void switchToClaseNormalGarielChulde(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ClaseChaldu.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToGarielChuldeTPFinal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/YouTipsTPFinal.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToClaseNormalGuceldaBuffini(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ClaseGuceldaBuffini.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToTPFinalGuceldaBuffini(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/GuceldaBuffiniTPFinal.fxml")));
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

    public void switchToClaseNormalAdisgutinBatizi(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ClaseAdisgutinBatizi.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToTPFinalAdisgutinBatizi(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ClaseAdisgutinBatizi.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //endregion

    //region Buffet
    public void switchToBuffetGeneral(ActionEvent event) {
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

    public void switchToMenuBuffet(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/MenuCafeteria.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToBanioGeneral(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/BañoGeneral.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //endregion

    //region Patio

    public void switchToPatioFacultad(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/patioJuegos.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToEscenarioEscolar(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/patioJuegos.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //endregion

    private void switchScene(Parent root) {
        if (stage != null) {
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } else {
            System.out.println("Error: El stage es nulo. Asegúrate de haber asignado el stage correctamente en el controlador.");
        }
    }

    //region aula 1
    public void switchToaula1(ActionEvent event) {
        GestionPersonaje pj = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Clases clase = new Clases();

        GameData.AsistenciaClase asistencia = GameData.AsistenciaClase.NO_PRESENTE;

        switch (pj.ultimoDia()) {
            case 1, 2, 3 -> {
                if (asistencia.equals(pj.getAsistenciaDia())) {
                    switchToMaleniaGurciaNormal(event);
                } else {
                    switchToaulaGeneralVacia(event);
                }
            }
            case 4 -> {
                if (asistencia.equals(pj.getAsistenciaDia())) {
                    switchToMaleniaGurciaTPfinal(event);
                } else {
                    switchToaulaGeneralVacia(event);
                }
            }
            case 5, 6, 7 -> {
                if (asistencia.equals(pj.getAsistenciaDia())) {
                    switchToClaseNormalGuceldaBuffini(event);
                } else {
                    switchToaulaGeneralVacia(event);
                }
            }
            case 8 -> {
                if (asistencia.equals(pj.getAsistenciaDia())) {
                    switchToTPFinalGuceldaBuffini(event);
                } else {
                    switchToaulaGeneralVacia(event);
                }
            }
            case 9, 10, 11, 12, 17 -> {
                switchToaulaGeneralVacia(event);
            }
            case 13, 14, 15 -> {
                if (asistencia.equals(pj.getAsistenciaDia())) {
                    switchToClaseNormalGarielChulde(event);
                } else {
                    switchToaulaGeneralVacia(event);
                }
            }
            case 16 -> {
                if (asistencia.equals(pj.getAsistenciaDia())) {
                    switchToGarielChuldeTPFinal(event);
                } else {
                    switchToaulaGeneralVacia(event);
                }
            }
        }
    }
    //endregion

    //region aula 2
    public void switchToaula2(ActionEvent event) {
        GestionPersonaje pj = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Clases clase = new Clases();

        GameData.AsistenciaClase asistencia = GameData.AsistenciaClase.NO_PRESENTE;

        switch (pj.ultimoDia()) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 13, 14, 15, 16, 17 -> {
                switchToaulaAgustinVacia(event);
            }
            case 9, 10, 11 -> {
                if (asistencia.equals(pj.getAsistenciaDia())) {
                    switchToClaseNormalAdisgutinBatizi(event);
                } else {
                    switchToaulaAgustinVacia(event);
                }
            }
            case 12 -> {
                if (asistencia.equals(pj.getAsistenciaDia())) {
                    switchToTPFinalAdisgutinBatizi(event);
                } else {
                    switchToaulaAgustinVacia(event);
                }
            }
        }
    }

    //endregion

//region dialogo clases


    //region copia Arreglo
    private int indiceMensajes = 0;
    private String[] arregloCopia;
    Clases clase = new Clases();

    public void cargarArregloTeoriaParaMostrar() {
        this.arregloCopia = Arrays.copyOf(clase.getDialogo(), clase.getDialogo().length);
    }
//endregion

    //region metodos uso texto
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
            pj.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);
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

    public void initialize() {
        cargarArregloTeoriaParaMostrar();
        if (indiceMensajes >= arregloCopia.length) {
            switchToSalir(null);
        }
    }

    private void updateOtrobotonState() {
        siguientetextoclase.setDisable(false);
        textoAnteriorClase.setDisable(false);
        terminarClase.setDisable(true);
    }
    //endregion
    //endregion

//region examenes

    //region copia Arreglo
    ExamenMelina textoMelina = new ExamenMelina();
    private int iteradorExamenMelina = 0;

    private String[] copiaArregloPreguntaExamenMelina = Arrays.copyOf(textoMelina.getPreguntas(), textoMelina.getPreguntas().length);
    private String[] copiaArregloRespuesta1ExamenMelina = Arrays.copyOf(textoMelina.getRespuestas1(), textoMelina.getRespuestas1().length);
    private String[] copiaArregloRespuesta2ExamenMelina = Arrays.copyOf(textoMelina.getRespuestas2(), textoMelina.getRespuestas2().length);
    private String[] copiaArregloRespuesta3ExamenMelina = Arrays.copyOf(textoMelina.getRespuestas3(), textoMelina.getRespuestas3().length);
    private String[] copiaArregloRespuesta4ExamenMelina = Arrays.copyOf(textoMelina.getRespuestas4(), textoMelina.getRespuestas4().length);
//endregion

    //region metodos uso texto
    public void MenuExamenMelina(ActionEvent event) {
        GestionPersonaje pj = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        int notaTPMelina = 0;

        if (iteradorExamenMelina == 0) {
            preguntaTPFinalMalenia.setText(copiaArregloPreguntaExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta1.setText(copiaArregloRespuesta1ExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta2.setText(copiaArregloRespuesta2ExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta3.setText(copiaArregloRespuesta3ExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta4.setText(copiaArregloRespuesta4ExamenMelina[iteradorExamenMelina]);
            comenzarTpFinalMalenia.setDisable(true);
            elegirRespuestaTpFinalMalenia.setDisable(false);
            tpFinalMeleniaTerminarTp.setDisable(true);
            iteradorExamenMelina++;
            if (respuestaUsuarioTPFinalMelina.equals(respuestasTPFinalMelina[iteradorExamenMelina])){
                notaTPMelina += 1;
            }
        } else if (iteradorExamenMelina < copiaArregloPreguntaExamenMelina.length) {
            preguntaTPFinalMalenia.setText(copiaArregloPreguntaExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta1.setText(copiaArregloRespuesta1ExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta2.setText(copiaArregloRespuesta2ExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta3.setText(copiaArregloRespuesta3ExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta4.setText(copiaArregloRespuesta4ExamenMelina[iteradorExamenMelina]);
            if (respuestaUsuarioTPFinalMelina.equals(respuestasTPFinalMelina[iteradorExamenMelina])){
                notaTPMelina += 1;
            }
            iteradorExamenMelina++;
            actualizarBotonesTpFinalMalenia();
        } else {
            preguntaTPFinalMalenia.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
            tpFinalMaleniarespuesta1.setText("");
            tpFinalMaleniarespuesta2.setText("");
            tpFinalMaleniarespuesta3.setText("");
            tpFinalMaleniarespuesta4.setText("");
            elegirRespuestaTpFinalMalenia.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
            tpFinalMeleniaTerminarTp.setDisable(false);
            elegirRespuestaTpFinalMalenia.setDisable(true);
            pj.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);
        }
    }

    private void actualizarBotonesTpFinalMalenia() {
        elegirRespuestaTpFinalMalenia.setDisable(false);
        tpFinalMeleniaTerminarTp.setDisable(true);
        comenzarTpFinalMalenia.setDisable(true);
    }

    private  String[] respuestasTPFinalMelina = Arrays.copyOf(textoMelina.getArregloRespuestasMelinaTPFinal(), textoMelina.getArregloRespuestasMelinaTPFinal().length);

    public void verificarOpcion(ActionEvent event){


    }
    //endregion
    //endregion


    ///Metodos de los escenarios///
    public void CargarNombreUsuario(ActionEvent event) {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        Personaje personaje = new Personaje(txtName.getText());
        ArrayList<GameData> ListaDatos = new ArrayList<>();

        GameData gameData = new GameData();

        gameData.setAsistenciaClase(GameData.AsistenciaClase.NO_PRESENTE);

        gameData.setEventoCompletado(GameData.eventoCompletado.NO_COMPLETADO);

        gameData.setFecha("1");

        ListaDatos.add(gameData);

        personaje.setGuardadoPartida(ListaDatos);

        personajeRepo.Agregar(personaje);

        switchToInformacionPjCredo(event);

    }

    public void VerificarPersonaje(ActionEvent event) {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();

        if (lista.isEmpty()) {
            switchToAdvertenciaSlotVacio(event);
        } else {
            switchToCargarPartida(event);
        }
    }

    public void UpdateNombre() {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();
        if (!lista.isEmpty()) {
            GestionPersonaje pj = new GestionPersonaje();
            Personaje personaje = lista.get(0);
            txtUsuario1.setText(personaje.getNombre());
            fechaCargarPartida.setText(String.valueOf(pj.ultimoDia()));
        }
    }

    public void VerificarLista(ActionEvent event) {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();
        if (!lista.isEmpty()) {
            switchToPasilloPrincipal(event);
        } else {
            switchToAdvertenciaSlotVacio(event);
        }
    }

    public void EliminarPartida() {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();
        Personaje personaje = lista.get(0);
        personajeRepo.Eliminar(personaje.getId());

        txtUsuario1.setText("");
        fechaCargarPartida.setText("");
    }

    public void ControlDeJugadores(ActionEvent event) {
        PersonajeRepo repo = new PersonajeRepo();
        ArrayList<Personaje> lista = repo.Listar();

        int cantidad = lista.size();

        if (cantidad < 1) {
            switchToCrearPersonaje(event);
        } else {
            switchToSlotsLlenos(event);
        }
    }

    //El usuario al cargar el jugador se hardcodee la posicion del arreglo de jugadores para obtener los datos mas facilmente //Recordatorio
    public void UpdateDia() {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();
        Personaje personaje = lista.get(0);
        ArrayList<GameData> ListaDatos = personaje.getGuardadoPartida();
        //Probar aumentar los dias segun entre a este metodo

        registroDias.setText(String.valueOf(ListaDatos.size() + 1));
        dineroGanadoEnElDia1.setText(String.valueOf(personaje.getDinero()+50));
        dineroGanadoEnElDia2.setText(personaje.getEstadoEstres().name());
    }

    public void CambiarDias(ActionEvent event) {
        switchToPasilloPrincipal(event);

        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();
        Personaje personaje = lista.get(0);
        ArrayList<GameData> ListaDatos = personaje.getGuardadoPartida();
        GameData gameData = new GameData();
        personaje.setDinero(personaje.getDinero()+50);
        gameData.setFecha(String.valueOf(ListaDatos.size() + 1));
        gameData.setAsistenciaClase(GameData.AsistenciaClase.NO_PRESENTE);
        gameData.setEventoCompletado(GameData.eventoCompletado.NO_COMPLETADO);
        ListaDatos.add(gameData);
        personajeRepo.Modificar(personaje);

        UpdateDia();
    }

    public void UpdateInformacionCreacionPJ()
    {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();
        Personaje personaje = lista.get(0);
        muetraNombreUsuarioCreacionPj.setText(personaje.getNombre());
        muetraBebidaFavoritaEnCreacionPj.setText(personaje.getBuffet().name());
    }

    public void UpdateInformacionCafeteria()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();

        Personaje personaje = gestionPersonaje.cargarPersonaje();
        gestionPersonaje.cambioEstado(personaje.getEstres());

        mostrarBebidaFavorita.setText(personaje.getBuffet().name());
        mostrarCordura.setText(personaje.getEstadoEstres().name());
        mostrarDinero.setText(String.valueOf(personaje.getDinero()));
    }

   //region bebidasBuffet
    public void CafeConLeche()
    {
       GestionPersonaje gestionPersonaje = new GestionPersonaje();
       PersonajeRepo repo = new PersonajeRepo();
       Personaje personaje = gestionPersonaje.cargarPersonaje();

       if(gestionPersonaje.descontarDinero(130))
       {
           if(personaje.getBuffet().name().equals("Cafe_con_Leche"))
           {
               personaje.setEstres(personaje.getEstres()-10);
           }
           else
           {
               personaje.setEstres(personaje.getEstres()-5);
           }
       }
       if(personaje.getEstres() < 0)
       {
           personaje.setEstres(0);
       }
       repo.Modificar(personaje);
    }

    public void Capuccino()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if(gestionPersonaje.descontarDinero(250))
        {
            if(personaje.getBuffet().name().equals("Capuccino"))
            {
                personaje.setEstres(personaje.getEstres()-10);
            }
            else
            {
                personaje.setEstres(personaje.getEstres()-5);
            }
        }
        if(personaje.getEstres() < 0)
        {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void Cortado()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if(gestionPersonaje.descontarDinero(140))
        {
            if(personaje.getBuffet().name().equals("Cortado"))
            {
                personaje.setEstres(personaje.getEstres()-10);
            }
            else
            {
                personaje.setEstres(personaje.getEstres()-5);
            }
        }
        if(personaje.getEstres() < 0)
        {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void Lagrima()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

       if(gestionPersonaje.descontarDinero(160))
       {
           if(personaje.getBuffet().name().equals("Lagrima"))
           {
               personaje.setEstres(personaje.getEstres()-10);
           }
           else
           {
               personaje.setEstres(personaje.getEstres()-5);
           }
       }
        if(personaje.getEstres() < 0)
        {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void Jugo()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if(gestionPersonaje.descontarDinero(130))
        {
            if(personaje.getBuffet().name().equals("Jugo"))
            {
                personaje.setEstres(personaje.getEstres()-10);
            }
            else
            {
                personaje.setEstres(personaje.getEstres()-5);
            }
        }
        if(personaje.getEstres() < 0)
        {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void Te()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if(gestionPersonaje.descontarDinero(120))
        {
            if(personaje.getBuffet().name().equals("Te"))
            {
                personaje.setEstres(personaje.getEstres()-10);
            }
            else
            {
                personaje.setEstres(personaje.getEstres()-5);
            }
        }
        if(personaje.getEstres() < 0)
        {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }
    //endregion


}