package com.example.tp_final_laboraotirio_iii;

import com.example.tp_final_laboraotirio_iii.Examenes.ExamenBatizi;
import com.example.tp_final_laboraotirio_iii.Examenes.ExamenBuffini;
import com.example.tp_final_laboraotirio_iii.Examenes.ExamenChulde;
import com.example.tp_final_laboraotirio_iii.Examenes.ExamenMalenia;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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

    private static final int MaximoIntentosEventos = 2;
    private int ContadorIntentosEventos = 0, notaTPBuffini, notaChulde, notaTPBatizzi, iteradorExamenChulde = 0,iteradorExamenBatizzi = 0, iteradorExamenBuffini = 0, iteradorExamenMelina, indiceMensajesTeoria = 0, estresClases = 25, estresParciales = 35, notaTPMelina;
    private String[] arregloCopiaTeoria;
    //region FXML
    @FXML
    private RadioButton jugarMetegol, juegarPingPong, jugarCartas;
    @FXML
    private Label mostrarCorduraPatio, textPreguntasChalduTpFinal, respuestasTpFinalChandlu1, respuestasTpFinalChandlu2, respuestasTpFinalChandlu3, respuestasTpFinalChandlu4, preguntaTPFinalBatizi, preguntaTPFinalBatizi1, preguntaTPFinalBatizi11, preguntaTPFinalBatizi12, preguntaTPFinalBatizi121, registroDias, respuesta3BenoffiTPFinal, respuesta4BenoffiTPFinal, preguntaBenoffiTPFinal, respuesta1BenoffiTPFinal, respuesta2BenoffiTPFinal, tpFinalMaleniarespuesta4, tpFinalMaleniarespuesta3, tpFinalMaleniarespuesta2, tpFinalMaleniarespuesta1, preguntaTPFinalMalenia, mostrarDinero, mostrarCordura, mostrarBebidaFavorita, muetraBebidaFavoritaEnCreacionPj, textoProfesor, txtUsuario1, fechaCargarPartida, dineroGanadoEnElDia1, dineroGanadoEnElDia2, muetraNombreUsuarioCreacionPj;
    @FXML
    private TextField txtName, respuestaUsuarioTPFinalMelina, respuestaUsuarioTPFinalChulde, respuestaUsuarioTPFinalBuffini, respuestaUsuarioTPFinalBtzz;
    @FXML
    private Button siJugarMetegol,nojugarMetegol, siJugarCartas,nojugarCartas,siJugarPingpong, nojugarpingpong, textoAnteriorClase, comenzarTpFinalChulde, tpFinalChuldeTerminarTp, elegirRespuestaTpFinalChulde, elegirRespuestaTpFinalBatizzi, tpFinalBatizziTerminarTp, comenzarTpFinalBatizzi, elegirRespuestaTpFinalBuffini, comenzarTpFinalBuffini, tpFinalBuffiniTerminarTp, deCafeteriaABuffetGeneral, teCafeteria, jugoCafeteria, lagrimaCafeteria, cortadoCafeteria, cappuchinoCafeteria, cafeConLecheCafeteria, comenzarTpFinalMalenia, tpFinalMeleniaTerminarTp, elegirRespuestaTpFinalMalenia, siguientetextoclase, terminarClase;
    //endregion
    //endregion

    //region G Y S
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String[] getMensajes() {
        return arregloCopiaTeoria;
    }

    public void setMensajes(String[] mensajes) {
        arregloCopiaTeoria = mensajes;
    }
    //endregion

    //region scenarios
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
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/AdisgustinBatiziTPFinal.fxml")));
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
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/GimnacioGraduacion.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //endregion

    //region eventos
    public void switchToEventoCartas(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/CariEventoCartas.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToEventoPingPong(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/EventoSantiPingPong.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToEventoMeteGol(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/NachoEventoMetegol.fxml")));
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
    //endregion

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
    Clases clase = new Clases();

    public void cargarArregloTeoriaParaMostrar() {
        this.arregloCopiaTeoria = Arrays.copyOf(clase.getDialogo(), clase.getDialogo().length);
    }
    //endregion

    //region metodos uso texto
    public void submit(ActionEvent event) {
        GestionPersonaje pj = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();

        if (indiceMensajesTeoria == 0) {
            textoProfesor.setText(arregloCopiaTeoria[indiceMensajesTeoria]);
            siguientetextoclase.setDisable(false);
            terminarClase.setDisable(true);
            textoAnteriorClase.setDisable(true);
            indiceMensajesTeoria++;
        } else if (indiceMensajesTeoria < arregloCopiaTeoria.length) {
            textoProfesor.setText(arregloCopiaTeoria[indiceMensajesTeoria]);
            indiceMensajesTeoria++;
            updateOtrobotonState();
        } else {
            textoProfesor.setText("Asi concluye la clase nos veremos la proxima");
            siguientetextoclase.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
            terminarClase.setDisable(false);
            textoAnteriorClase.setDisable(true);
            pj.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);
            Personaje personaje = pj.cargarPersonaje();
            personaje.setEstres(personaje.getEstres() + estresClases);
            if (personaje.getEstres() >= 100) {
                personaje.setEstres(100);
            }
            repo.Modificar(personaje);
            pj.cambioEstado(personaje.getEstres());
        }
    }

    public void textoAnteriorDialogoProfesor(ActionEvent event) {

        if (indiceMensajesTeoria == 0) {
            textoProfesor.setText(arregloCopiaTeoria[indiceMensajesTeoria]);
            siguientetextoclase.setDisable(false);
            terminarClase.setDisable(true);
            textoAnteriorClase.setDisable(true);
        } else {
            indiceMensajesTeoria--;
            textoProfesor.setText(arregloCopiaTeoria[indiceMensajesTeoria]);
            updateOtrobotonState();
        }
    }

    public void initialize() {
        cargarArregloTeoriaParaMostrar();
        if (indiceMensajesTeoria >= arregloCopiaTeoria.length) {
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

    //region examen malenia

    //region copia Arreglo
    ExamenMalenia textoMelina = new ExamenMalenia();

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
            ActualizarTextRespuestas();
        } else if (iteradorExamenMelina < copiaArregloPreguntaExamenMelina.length) {
            preguntaTPFinalMalenia.setText(copiaArregloPreguntaExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta1.setText(copiaArregloRespuesta1ExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta2.setText(copiaArregloRespuesta2ExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta3.setText(copiaArregloRespuesta3ExamenMelina[iteradorExamenMelina]);
            tpFinalMaleniarespuesta4.setText(copiaArregloRespuesta4ExamenMelina[iteradorExamenMelina]);
            String respuesta = respuestaUsuarioTPFinalMelina.getText();
            if (respuesta.equals(respuestasTPFinalMelina[iteradorExamenMelina - 1])) {
                notaTPMelina += 1;
            }
            iteradorExamenMelina++;
            actualizarBotonesTpFinalMalenia();
            ActualizarTextRespuestas();
        } else {
            String respuesta = respuestaUsuarioTPFinalMelina.getText();
            if (respuesta.equals(respuestasTPFinalMelina[iteradorExamenMelina - 1])) {
                notaTPMelina += 1;
            }
            preguntaTPFinalMalenia.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
            tpFinalMaleniarespuesta1.setText("");
            tpFinalMaleniarespuesta2.setText("");
            tpFinalMaleniarespuesta3.setText("");
            tpFinalMaleniarespuesta4.setText("");
            elegirRespuestaTpFinalMalenia.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
            tpFinalMeleniaTerminarTp.setDisable(false);
            elegirRespuestaTpFinalMalenia.setDisable(true);
            pj.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

            Personaje personaje = pj.cargarPersonaje();
            ArrayList<Integer> Notas = personaje.getListaNotas();
            Notas.set(0, notaTPMelina);
            personaje.setEstres(personaje.getEstres() + estresParciales);
            if (personaje.getEstres() >= 100) {
                personaje.setEstres(100);
            }
            repo.Modificar(personaje);
            pj.cambioEstado(personaje.getEstres());
        }
    }

    private void actualizarBotonesTpFinalMalenia() {
        elegirRespuestaTpFinalMalenia.setDisable(false);
        tpFinalMeleniaTerminarTp.setDisable(true);
        comenzarTpFinalMalenia.setDisable(true);
    }

    private void ActualizarTextRespuestas() {
        respuestaUsuarioTPFinalMelina.setText(" ");
    }

    private String[] respuestasTPFinalMelina = Arrays.copyOf(textoMelina.getArregloRespuestas(), textoMelina.getArregloRespuestas().length);
    //endregion
    //endregion

    //region examen Buffini

    //region copia Arreglo
    ExamenBuffini textoBuffini = new ExamenBuffini();

    private String[] copiaArregloPreguntaExamenBuffini = Arrays.copyOf(textoBuffini.getPreguntas(), textoBuffini.getPreguntas().length);
    private String[] copiaArregloRespuesta1ExamenBuffini = Arrays.copyOf(textoBuffini.getRespuestas1(), textoBuffini.getRespuestas1().length);
    private String[] copiaArregloRespuesta2ExamenBuffini = Arrays.copyOf(textoBuffini.getRespuestas2(), textoBuffini.getRespuestas2().length);
    private String[] copiaArregloRespuesta3ExamenBuffini = Arrays.copyOf(textoBuffini.getRespuestas3(), textoBuffini.getRespuestas3().length);
    private String[] copiaArregloRespuesta4ExamenBuffini = Arrays.copyOf(textoBuffini.getRespuestas4(), textoBuffini.getRespuestas4().length);
//endregion

    //region metodos uso texto
    public void MenuExamenBuffini(ActionEvent event) {
        GestionPersonaje pj = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();


        if (iteradorExamenBuffini == 0) {
            preguntaBenoffiTPFinal.setText(copiaArregloPreguntaExamenBuffini[iteradorExamenBuffini]);
            respuesta1BenoffiTPFinal.setText(copiaArregloRespuesta1ExamenBuffini[iteradorExamenBuffini]);
            respuesta2BenoffiTPFinal.setText(copiaArregloRespuesta2ExamenBuffini[iteradorExamenBuffini]);
            respuesta3BenoffiTPFinal.setText(copiaArregloRespuesta3ExamenBuffini[iteradorExamenBuffini]);
            respuesta4BenoffiTPFinal.setText(copiaArregloRespuesta4ExamenBuffini[iteradorExamenBuffini]);
            comenzarTpFinalBuffini.setDisable(true);
            elegirRespuestaTpFinalBuffini.setDisable(false);
            tpFinalBuffiniTerminarTp.setDisable(true);
            iteradorExamenBuffini++;
            ActualizarTextRespuestasBuffini();
        } else if (iteradorExamenBuffini < copiaArregloPreguntaExamenBuffini.length) {
            preguntaBenoffiTPFinal.setText(copiaArregloPreguntaExamenBuffini[iteradorExamenBuffini]);
            respuesta1BenoffiTPFinal.setText(copiaArregloRespuesta1ExamenBuffini[iteradorExamenBuffini]);
            respuesta2BenoffiTPFinal.setText(copiaArregloRespuesta2ExamenBuffini[iteradorExamenBuffini]);
            respuesta3BenoffiTPFinal.setText(copiaArregloRespuesta3ExamenBuffini[iteradorExamenBuffini]);
            respuesta4BenoffiTPFinal.setText(copiaArregloRespuesta4ExamenBuffini[iteradorExamenBuffini]);
            String respuesta = respuestaUsuarioTPFinalBuffini.getText();
            ActualizarTextRespuestasBuffini();
            if (respuesta.equals(respuestasTPFinalBuffini[iteradorExamenBuffini - 1])) {
                notaTPBuffini += 1;
            }
            iteradorExamenBuffini++;
            actualizarBotonesTpFinalBuffini();
            ActualizarTextRespuestasBuffini();
        } else {
            String respuesta = respuestaUsuarioTPFinalBuffini.getText();
            if (respuesta.equals(respuestasTPFinalBuffini[iteradorExamenBuffini - 1])) {
                notaTPBuffini += 1;
            }
            preguntaBenoffiTPFinal.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
            respuesta1BenoffiTPFinal.setText("");
            respuesta2BenoffiTPFinal.setText("");
            respuesta3BenoffiTPFinal.setText("");
            respuesta4BenoffiTPFinal.setText("");
            elegirRespuestaTpFinalBuffini.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
            tpFinalBuffiniTerminarTp.setDisable(false);
            comenzarTpFinalBuffini.setDisable(true);
            pj.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

            Personaje personaje = pj.cargarPersonaje();
            ArrayList<Integer> Notas = personaje.getListaNotas();
            Notas.set(1, notaTPBuffini);
            personaje.setEstres(personaje.getEstres() + estresParciales);
            if (personaje.getEstres() >= 100) {
                personaje.setEstres(100);
            }
            repo.Modificar(personaje);
            pj.cambioEstado(personaje.getEstres());
        }
    }


    private void actualizarBotonesTpFinalBuffini() {
        elegirRespuestaTpFinalBuffini.setDisable(false);
        tpFinalBuffiniTerminarTp.setDisable(true);
        comenzarTpFinalBuffini.setDisable(true);
    }

    private void ActualizarTextRespuestasBuffini() {
        respuestaUsuarioTPFinalBuffini.setText(" ");
    }

    private String[] respuestasTPFinalBuffini = Arrays.copyOf(textoBuffini.getArregloRespuestas(), textoBuffini.getArregloRespuestas().length);
    //endregion
    //endregion

    //region Examen Batizi

    //region copia Arreglo
    ExamenBatizi textoBatizi = new ExamenBatizi();

    private String[] copiaArregloPreguntaExamenBatizi = Arrays.copyOf(textoBatizi.getPreguntas(), textoBatizi.getPreguntas().length);
    private String[] copiaArregloRespuesta1ExamenBatizi = Arrays.copyOf(textoBatizi.getRespuestas1(), textoBatizi.getRespuestas1().length);
    private String[] copiaArregloRespuesta2ExamenBatizi = Arrays.copyOf(textoBatizi.getRespuestas2(), textoBatizi.getRespuestas2().length);
    private String[] copiaArregloRespuesta3ExamenBatizi = Arrays.copyOf(textoBatizi.getRespuestas3(), textoBatizi.getRespuestas3().length);
    private String[] copiaArregloRespuesta4ExamenBatizi = Arrays.copyOf(textoBatizi.getRespuestas4(), textoBatizi.getRespuestas4().length);
//endregion

    //region metodos uso texto
    public void MenuExamenBatizzi(ActionEvent event) {
        GestionPersonaje pj = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();

        if (iteradorExamenBatizzi == 0) {
            preguntaTPFinalBatizi.setText(copiaArregloPreguntaExamenBatizi[iteradorExamenBatizzi]);
            preguntaTPFinalBatizi1.setText(copiaArregloRespuesta1ExamenBatizi[iteradorExamenBatizzi]);
            preguntaTPFinalBatizi11.setText(copiaArregloRespuesta2ExamenBatizi[iteradorExamenBatizzi]);
            preguntaTPFinalBatizi12.setText(copiaArregloRespuesta3ExamenBatizi[iteradorExamenBatizzi]);
            preguntaTPFinalBatizi121.setText(copiaArregloRespuesta4ExamenBatizi[iteradorExamenBatizzi]);
            comenzarTpFinalBatizzi.setDisable(true);
            elegirRespuestaTpFinalBatizzi.setDisable(false);
            tpFinalBatizziTerminarTp.setDisable(true);
            iteradorExamenBatizzi++;
            ActualizarTextRespuestasBatizzi();
        } else if (iteradorExamenBatizzi < copiaArregloPreguntaExamenBatizi.length) {
            preguntaTPFinalBatizi.setText(copiaArregloPreguntaExamenBatizi[iteradorExamenBatizzi]);
            preguntaTPFinalBatizi1.setText(copiaArregloRespuesta1ExamenBatizi[iteradorExamenBatizzi]);
            preguntaTPFinalBatizi11.setText(copiaArregloRespuesta2ExamenBatizi[iteradorExamenBatizzi]);
            preguntaTPFinalBatizi12.setText(copiaArregloRespuesta3ExamenBatizi[iteradorExamenBatizzi]);
            preguntaTPFinalBatizi121.setText(copiaArregloRespuesta4ExamenBatizi[iteradorExamenBatizzi]);
            String respuesta = respuestaUsuarioTPFinalBtzz.getText();
            ActualizarTextRespuestasBatizzi();
            if (respuesta.equals(respuestasTPFinalBatizzi[iteradorExamenBatizzi - 1])) {
                notaTPBatizzi += 1;
            }
            iteradorExamenBatizzi++;
            actualizarBotonesTpFinalBatizzi();
            ActualizarTextRespuestasBatizzi();
        } else {
            String respuesta = respuestaUsuarioTPFinalBtzz.getText();
            if (respuesta.equals(respuestasTPFinalBatizzi[iteradorExamenBatizzi - 1])) {
                notaTPBatizzi += 1;
            }
            preguntaTPFinalBatizi.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
            preguntaTPFinalBatizi1.setText("");
            preguntaTPFinalBatizi11.setText("");
            preguntaTPFinalBatizi12.setText("");
            preguntaTPFinalBatizi121.setText("");
            elegirRespuestaTpFinalBatizzi.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
            tpFinalBatizziTerminarTp.setDisable(false);
            comenzarTpFinalBatizzi.setDisable(true);
            pj.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

            Personaje personaje = pj.cargarPersonaje();
            ArrayList<Integer> Notas = personaje.getListaNotas();
            Notas.set(2, notaTPBatizzi);
            personaje.setEstres(personaje.getEstres() + estresParciales);
            if (personaje.getEstres() >= 100) {
                personaje.setEstres(100);
            }
            repo.Modificar(personaje);
            pj.cambioEstado(personaje.getEstres());
        }
    }


    private void actualizarBotonesTpFinalBatizzi() {
        elegirRespuestaTpFinalBatizzi.setDisable(false);
        tpFinalBatizziTerminarTp.setDisable(true);
        comenzarTpFinalBatizzi.setDisable(true);
    }

    private void ActualizarTextRespuestasBatizzi() {
        respuestaUsuarioTPFinalBtzz.setText(" ");
    }
    private String[] respuestasTPFinalBatizzi = Arrays.copyOf(textoBatizi.getArregloRespuestas(), textoBatizi.getArregloRespuestas().length);
    //endregion
    //endregion

    //region Examen chulde

    //region copia Arreglo
    ExamenChulde textoChulde = new ExamenChulde();

    private String[] copiaArregloPreguntaExamenBChulde = Arrays.copyOf(textoChulde.getPreguntas(), textoChulde.getPreguntas().length);
    private String[] copiaArregloRespuesta1ExamenChulde = Arrays.copyOf(textoChulde.getRespuestas1(), textoChulde.getRespuestas1().length);
    private String[] copiaArregloRespuesta2ExamenChulde = Arrays.copyOf(textoChulde.getRespuestas2(), textoChulde.getRespuestas2().length);
    private String[] copiaArregloRespuesta3ExamenChulde = Arrays.copyOf(textoChulde.getRespuestas3(), textoChulde.getRespuestas3().length);
    private String[] copiaArregloRespuesta4ExamenChulde = Arrays.copyOf(textoChulde.getRespuestas4(), textoChulde.getRespuestas4().length);
//endregion

    //region metodos uso texto
    public void MenuExamenChulde(ActionEvent event) {
        GestionPersonaje pj = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();

        if (iteradorExamenChulde == 0) {
            textPreguntasChalduTpFinal.setText(copiaArregloPreguntaExamenBChulde[iteradorExamenChulde]);
            respuestasTpFinalChandlu1.setText(copiaArregloRespuesta1ExamenChulde[iteradorExamenChulde]);
            respuestasTpFinalChandlu2.setText(copiaArregloRespuesta2ExamenChulde[iteradorExamenChulde]);
            respuestasTpFinalChandlu3.setText(copiaArregloRespuesta3ExamenChulde[iteradorExamenChulde]);
            respuestasTpFinalChandlu4.setText(copiaArregloRespuesta4ExamenChulde[iteradorExamenChulde]);
            comenzarTpFinalChulde.setDisable(true);
            elegirRespuestaTpFinalChulde.setDisable(false);
            tpFinalChuldeTerminarTp.setDisable(true);
            iteradorExamenChulde++;
            ActualizarTextRespuestasChulde();
        } else if (iteradorExamenChulde < copiaArregloPreguntaExamenBChulde.length) {
            textPreguntasChalduTpFinal.setText(copiaArregloPreguntaExamenBChulde[iteradorExamenChulde]);
            respuestasTpFinalChandlu1.setText(copiaArregloRespuesta1ExamenChulde[iteradorExamenChulde]);
            respuestasTpFinalChandlu2.setText(copiaArregloRespuesta2ExamenChulde[iteradorExamenChulde]);
            respuestasTpFinalChandlu3.setText(copiaArregloRespuesta3ExamenChulde[iteradorExamenChulde]);
            respuestasTpFinalChandlu4.setText(copiaArregloRespuesta4ExamenChulde[iteradorExamenChulde]);
            String respuesta = respuestaUsuarioTPFinalChulde.getText();
            ActualizarTextRespuestasChulde();
            if (respuesta.equals(respuestasTPFinalChulde[iteradorExamenChulde - 1])) {
                notaChulde += 1;
            }
            iteradorExamenChulde++;
            actualizarBotonesTpFinalChulde();
            ActualizarTextRespuestasChulde();
        } else {
            String respuesta = respuestaUsuarioTPFinalChulde.getText();
            if (respuesta.equals(respuestasTPFinalChulde[iteradorExamenChulde - 1])) {
                notaChulde += 1;
            }
            textPreguntasChalduTpFinal.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
            respuestasTpFinalChandlu1.setText("");
            respuestasTpFinalChandlu2.setText("");
            respuestasTpFinalChandlu3.setText("");
            respuestasTpFinalChandlu4.setText("");
            elegirRespuestaTpFinalChulde.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
            tpFinalChuldeTerminarTp.setDisable(false);
            comenzarTpFinalChulde.setDisable(true);
            pj.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

            Personaje personaje = pj.cargarPersonaje();
            ArrayList<Integer> Notas = personaje.getListaNotas();
            Notas.set(3, notaChulde);
            personaje.setEstres(personaje.getEstres() + estresParciales);
            if (personaje.getEstres() >= 100) {
                personaje.setEstres(100);
            }
            repo.Modificar(personaje);
            pj.cambioEstado(personaje.getEstres());
        }
    }


    private void actualizarBotonesTpFinalChulde() {
        elegirRespuestaTpFinalChulde.setDisable(false);
        tpFinalChuldeTerminarTp.setDisable(true);
        comenzarTpFinalChulde.setDisable(true);
    }

    private void ActualizarTextRespuestasChulde() {
        respuestaUsuarioTPFinalChulde.setText(" ");
    }
    private String[] respuestasTPFinalChulde = Arrays.copyOf(textoChulde.getArregloRespuestas(), textoChulde.getArregloRespuestas().length);
    //endregion
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
        dineroGanadoEnElDia1.setText(String.valueOf(personaje.getDinero() + 50));
        dineroGanadoEnElDia2.setText(personaje.getEstadoEstres().name());
    }

    public void CambiarDias(ActionEvent event) {
        switchToPasilloPrincipal(event);

        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo personajeRepo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        List<GameData> ListaDatos = gestionPersonaje.listaGameData();
        GameData gameData = new GameData();
        personaje.setDinero(personaje.getDinero() + 50);
        gameData.setFecha(String.valueOf(ListaDatos.size() + 1));
        gameData.setAsistenciaClase(GameData.AsistenciaClase.NO_PRESENTE);
        gameData.setEventoCompletado(GameData.eventoCompletado.NO_COMPLETADO);
        gestionPersonaje.cambioEstado(personaje.getEstres());
        ListaDatos.add(gameData);
        personajeRepo.Modificar(personaje);
        ContadorIntentosEventos = 0;

        UpdateDia();
    }

    public void UpdateInformacionCreacionPJ() {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        ArrayList<Personaje> lista = personajeRepo.Listar();
        Personaje personaje = lista.get(0);
        muetraNombreUsuarioCreacionPj.setText(personaje.getNombre());
        muetraBebidaFavoritaEnCreacionPj.setText(personaje.getBuffet().name());
    }

    public void UpdateInformacionCafeteria() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();

        Personaje personaje = gestionPersonaje.cargarPersonaje();
        gestionPersonaje.cambioEstado(personaje.getEstres());

        mostrarBebidaFavorita.setText(personaje.getBuffet().name());
        mostrarCordura.setText(personaje.getEstadoEstres().name());
        mostrarDinero.setText(String.valueOf(personaje.getDinero()));
    }

    //region eventos

    ///EVENTO PING PONG
    public void EventoPingPong(ActionEvent event) {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        int ultimodia = gestionPersonaje.ultimoDia();

        if (ultimodia == 3 && personaje.getGuardadoPartida().get(ultimodia - 1).getEventoCompletado().equals(GameData.eventoCompletado.NO_COMPLETADO)) {
            switchToEventoPingPong(event);
        } else {
            switchToBuffetGeneral(event);
        }
    }

    public void AceptarPingPong(ActionEvent event)
    {
        PersonajeRepo repo = new PersonajeRepo();
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        List<GameData> Listadata = gestionPersonaje.listaGameData();
        int ultimodia = gestionPersonaje.ultimoDia();

        if (event.getSource().equals(siJugarPingpong)) {

            GameData gameData = Listadata.get(ultimodia - 1);
            gameData.setEventoCompletado(GameData.eventoCompletado.COMPLETADO);
            repo.Modificar(personaje);
        }
        switchToPatioFacultad(event);
    }

    public void RechazarPingPong(ActionEvent event)
    {
        if (event.getSource().equals(nojugarpingpong)) {
           switchToBuffetGeneral(event);
        }
    }

    private void UpdateBotonPingPong() {
        juegarPingPong.setVisible(false);
    }

    ///EVENTO CARTAS
    public void EventoCartas(ActionEvent event) {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        int ultimodia = gestionPersonaje.ultimoDia();

        if (ultimodia == 5 && personaje.getGuardadoPartida().get(ultimodia - 1).getEventoCompletado().equals(GameData.eventoCompletado.NO_COMPLETADO)) {
            switchToEventoCartas(event);
        } else {
            switchToPatioFacultad(event);
        }
    }

    public void AceptarCartas(ActionEvent event)
    {
        PersonajeRepo repo = new PersonajeRepo();
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        List<GameData> Listadata = gestionPersonaje.listaGameData();
        int ultimodia = gestionPersonaje.ultimoDia();

        if (event.getSource().equals(siJugarCartas)) {

            GameData gameData = Listadata.get(ultimodia - 1);
            gameData.setEventoCompletado(GameData.eventoCompletado.COMPLETADO);
            repo.Modificar(personaje);
        }
        switchToPatioFacultad(event);
    }

    public void RechazarCartas(ActionEvent event)
    {
        if (event.getSource().equals(nojugarCartas)) {
            switchToPatioFacultad(event);
        }
    }



    private void UpdateBotonCartas() {
        jugarCartas.setVisible(false);
    }

    //EVENTO METEGOL
    public void EventoMetegol(ActionEvent event) {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        int ultimodia = gestionPersonaje.ultimoDia();

        if (ultimodia == 11 && personaje.getGuardadoPartida().get(ultimodia - 1).getEventoCompletado().equals(GameData.eventoCompletado.NO_COMPLETADO)) {
            switchToEventoMeteGol(event);
        } else {
            switchToBanioGeneral(event);
        }
    }
    public void AceptarMetegol(ActionEvent event)
    {
        PersonajeRepo repo = new PersonajeRepo();
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        List<GameData> Listadata = gestionPersonaje.listaGameData();
        int ultimodia = gestionPersonaje.ultimoDia();

        if (event.getSource().equals(siJugarMetegol)) {

            GameData gameData = Listadata.get(ultimodia - 1);
            gameData.setEventoCompletado(GameData.eventoCompletado.COMPLETADO);
            repo.Modificar(personaje);
        }
        switchToPatioFacultad(event);
    }

    public void RechazarMetegol(ActionEvent event)
    {
        if (event.getSource().equals(nojugarMetegol)) {
            switchToBanioGeneral(event);
        }
    }

    private void UpdateMetegol() {
        jugarMetegol.setVisible(false);
    }

    public void RestarEstresEventos() {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        if (ContadorIntentosEventos < MaximoIntentosEventos) {
            personaje.setEstres(personaje.getEstres() - 15);
            if (personaje.getEstres() < 0) {
                personaje.setEstres(0);
            }
            personajeRepo.Modificar(personaje);
            gestionPersonaje.cambioEstado(personaje.getEstres());
            ContadorIntentosEventos++;
        }
    }

    public void PatioJuegos() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        List<GameData> Listadata = gestionPersonaje.listaGameData();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        int ultimoDia = gestionPersonaje.ultimoDia();
        mostrarCorduraPatio.setText(personaje.getEstadoEstres().name());

        if (Integer.parseInt(Listadata.get(ultimoDia - 1).getFecha()) > 2) {
            if (Listadata.get(2).getEventoCompletado().equals(GameData.eventoCompletado.COMPLETADO)) {
                juegarPingPong.setVisible(true);
            } else {
                UpdateBotonPingPong();
            }
        } else {
            UpdateBotonPingPong();
        }

        if (Integer.parseInt(Listadata.get(ultimoDia - 1).getFecha()) > 4) {
            if (Listadata.get(4).getEventoCompletado().equals(GameData.eventoCompletado.COMPLETADO)) {
                jugarCartas.setVisible(true);
            } else {
                UpdateBotonCartas();
            }
        } else {
            UpdateBotonCartas();
        }

        if (Integer.parseInt(Listadata.get(ultimoDia - 1).getFecha()) > 10) {
            if (Listadata.get(10).getEventoCompletado().equals(GameData.eventoCompletado.COMPLETADO)) {
                jugarMetegol.setVisible(true);
            } else {
                UpdateMetegol();
            }
        } else {
            UpdateMetegol();
        }
    }

    //endregion


    //region bebidasBuffet
    public void CafeConLeche() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if (gestionPersonaje.descontarDinero(130)) {
            if (personaje.getBuffet().name().equals("Cafe_con_Leche")) {
                personaje.setEstres(personaje.getEstres() - 10);
            } else {
                personaje.setEstres(personaje.getEstres() - 5);
            }
        }
        if (personaje.getEstres() < 0) {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void Capuccino() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if (gestionPersonaje.descontarDinero(250)) {
            if (personaje.getBuffet().name().equals("Capuccino")) {
                personaje.setEstres(personaje.getEstres() - 10);
            } else {
                personaje.setEstres(personaje.getEstres() - 5);
            }
        }
        if (personaje.getEstres() < 0) {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void Cortado() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if (gestionPersonaje.descontarDinero(140)) {
            if (personaje.getBuffet().name().equals("Cortado")) {
                personaje.setEstres(personaje.getEstres() - 10);
            } else {
                personaje.setEstres(personaje.getEstres() - 5);
            }
        }
        if (personaje.getEstres() < 0) {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void Lagrima() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if (gestionPersonaje.descontarDinero(160)) {
            if (personaje.getBuffet().name().equals("Lagrima")) {
                personaje.setEstres(personaje.getEstres() - 10);
            } else {
                personaje.setEstres(personaje.getEstres() - 5);
            }
        }
        if (personaje.getEstres() < 0) {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void Jugo() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if (gestionPersonaje.descontarDinero(130)) {
            if (personaje.getBuffet().name().equals("Jugo")) {
                personaje.setEstres(personaje.getEstres() - 10);
            } else {
                personaje.setEstres(personaje.getEstres() - 5);
            }
        }
        if (personaje.getEstres() < 0) {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }

    public void Te() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        if (gestionPersonaje.descontarDinero(120)) {
            if (personaje.getBuffet().name().equals("Te")) {
                personaje.setEstres(personaje.getEstres() - 10);
            } else {
                personaje.setEstres(personaje.getEstres() - 5);
            }
        }
        if (personaje.getEstres() < 0) {
            personaje.setEstres(0);
        }
        repo.Modificar(personaje);
    }
    //endregion


}