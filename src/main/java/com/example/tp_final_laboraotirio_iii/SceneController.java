package com.example.tp_final_laboraotirio_iii;

import com.example.tp_final_laboraotirio_iii.TpFinales.TPFinalBarizi;
import com.example.tp_final_laboraotirio_iii.TpFinales.TPFinalBuffini;
import com.example.tp_final_laboraotirio_iii.TpFinales.TPFinalChulde;
import com.example.tp_final_laboraotirio_iii.TpFinales.TPFinalMalenia;
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
    private static int ContadorIntentosEventos = 0;
    private int notaTPBuffini, notaChulde, notaTPBatizi, iteradorExamenChulde = 0,iteradorExamenBatizzi = 0, iteradorExamenBuffini = 0, iteradorExamenMelina, indiceMensajesTeoria = 0, estresClases = 25, estresParciales = 35, notaTPMalenia;
    private String[] arregloCopiaTeoria;

    //region FXML
    @FXML
    private RadioButton salida,jugarMetegol, juegarPingPong, jugarCartas;
    @FXML
    private Label finalJuegoNota1BE,finalJuegoNota2BE,finalJuegoNota3BE,finalJuegoNota4BE, finalJuegoNota4,finalJuegoNota3,finalJuegoNota2,finalJuegoNota1,mostrarDineroEvento,mostrarCorduraPatio, textPreguntasChalduTpFinal, respuestasTpFinalChandlu1, respuestasTpFinalChandlu2, respuestasTpFinalChandlu3, respuestasTpFinalChandlu4, preguntaTPFinalBatizi, preguntaTPFinalBatizi1, preguntaTPFinalBatizi11, preguntaTPFinalBatizi12, preguntaTPFinalBatizi121, registroDias, respuesta3BenoffiTPFinal, respuesta4BenoffiTPFinal, preguntaBenoffiTPFinal, respuesta1BenoffiTPFinal, respuesta2BenoffiTPFinal, tpFinalMaleniarespuesta4, tpFinalMaleniarespuesta3, tpFinalMaleniarespuesta2, tpFinalMaleniarespuesta1, preguntaTPFinalMalenia, mostrarDinero, mostrarCordura, mostrarBebidaFavorita, muetraBebidaFavoritaEnCreacionPj, textoProfesor, txtUsuario1, fechaCargarPartida, dineroGanadoEnElDia1, dineroGanadoEnElDia2, muetraNombreUsuarioCreacionPj;
    @FXML
    private TextField txtName, respuestaUsuarioTPFinalMelina, respuestaUsuarioTPFinalChulde, respuestaUsuarioTPFinalBuffini, respuestaUsuarioTPFinalBtzz;
    @FXML
    private Button noCupongAyudemi,siCupongAyudemi,NoDarPlantaEventoRespuestas,siDarPlataEventoRespuestas,rechazoEventoBuffini,aceptarEventoBuffini,siJugarMetegol,nojugarMetegol, siJugarCartas,nojugarCartas,siJugarPingpong, nojugarpingpong, textoAnteriorClase, comenzarTpFinalChulde, tpFinalChuldeTerminarTp, elegirRespuestaTpFinalChulde, elegirRespuestaTpFinalBatizzi, tpFinalBatizziTerminarTp, comenzarTpFinalBatizzi, elegirRespuestaTpFinalBuffini, comenzarTpFinalBuffini, tpFinalBuffiniTerminarTp, comenzarTpFinalMalenia, tpFinalMeleniaTerminarTp, elegirRespuestaTpFinalMalenia, siguientetextoclase, terminarClase;
    //endregion
    //endregion

    //region G Y S
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    //endregion

    //region scenarios
    //region menu principal
    public void switchToPresentacion(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/VentanaPresentacion.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

    public void switchToJugarPingPong(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ScenaPingPongGIF.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToJugarCartas(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ScenaCartasGIF.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void switchToJugarMeteGol(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/ScenaMetegolGIF.fxml")));
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

    public void switchToEventoBenoffi(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/EventoBuffiniPokemonGo.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToEventoRespuestas(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/primeraScenaEventoRespuestas.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToEventoRespuestas2(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/segundaScenaEventoRespuestas_1.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToEventoBatiziAyudemi(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/eventoBatiziAyudemi.fxml"))));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //endregion


    //region final
    public void switchToGoodEnding(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/FinalGoodEnding.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToBadEnding(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/tp_final_laboraotirio_iii/FinalJuegoBadEnding.fxml")));
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
            case 9, 10, 11, 12, 17 -> switchToaulaGeneralVacia(event);

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

        GameData.AsistenciaClase asistencia = GameData.AsistenciaClase.NO_PRESENTE;

        switch (pj.ultimoDia()) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 13, 14, 15, 16, 17 -> switchToaulaAgustinVacia(event);
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
    public void MenuExamenMelina(ActionEvent event) {

        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        TPFinalMalenia textoMalenia = new TPFinalMalenia();
        String respuesta;

        if(personaje.getEstadoEstres().equals(Personaje.estadoEstres.ESTRESADO))
        {
            if (iteradorExamenMelina == 0) {
                preguntaTPFinalMalenia.setText(textoMalenia.getPreguntasChino()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta1.setText(textoMalenia.getRespuestas1Chino()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta2.setText(textoMalenia.getRespuestas2Chino()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta3.setText(textoMalenia.getRespuestas3Chino()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta4.setText(textoMalenia.getRespuestas4Chino()[iteradorExamenMelina]);
                comenzarTpFinalMalenia.setDisable(true);
                elegirRespuestaTpFinalMalenia.setDisable(false);
                tpFinalMeleniaTerminarTp.setDisable(true);
                iteradorExamenMelina++;
                ActualizarTextRespuestas();
            } else if (iteradorExamenMelina < textoMalenia.getPreguntasChino().length) {
                preguntaTPFinalMalenia.setText(textoMalenia.getPreguntasChino()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta1.setText(textoMalenia.getRespuestas1Chino()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta2.setText(textoMalenia.getRespuestas2Chino()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta3.setText(textoMalenia.getRespuestas3Chino()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta4.setText(textoMalenia.getRespuestas4Chino()[iteradorExamenMelina]);
                respuesta = respuestaUsuarioTPFinalMelina.getText();
                iteradorExamenMelina++;
                actualizarBotonesTpFinalMalenia();
                ActualizarTextRespuestas();
            } else {
                respuesta = respuestaUsuarioTPFinalMelina.getText();

                preguntaTPFinalMalenia.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
                tpFinalMaleniarespuesta1.setText("");
                tpFinalMaleniarespuesta2.setText("");
                tpFinalMaleniarespuesta3.setText("");
                tpFinalMaleniarespuesta4.setText("");
                elegirRespuestaTpFinalMalenia.setDisable(true);
                tpFinalMeleniaTerminarTp.setDisable(false);
                elegirRespuestaTpFinalMalenia.setDisable(true);
                gestionPersonaje.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

                ArrayList<Integer> Notas = personaje.getListaNotas();
                Notas.set(0, 0);
                gestionPersonaje.sumarStressPersonaje(personaje, estresParciales);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
        }
        else {
            if (iteradorExamenMelina == 0) {
                preguntaTPFinalMalenia.setText(textoMalenia.getPreguntas()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta1.setText(textoMalenia.getRespuestas1()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta2.setText(textoMalenia.getRespuestas2()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta3.setText(textoMalenia.getRespuestas3()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta4.setText(textoMalenia.getRespuestas4()[iteradorExamenMelina]);
                comenzarTpFinalMalenia.setDisable(true);
                elegirRespuestaTpFinalMalenia.setDisable(false);
                tpFinalMeleniaTerminarTp.setDisable(true);
                iteradorExamenMelina++;
                ActualizarTextRespuestas();
            } else if (iteradorExamenMelina < textoMalenia.getPreguntas().length) {
                preguntaTPFinalMalenia.setText(textoMalenia.getPreguntas()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta1.setText(textoMalenia.getRespuestas1()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta2.setText(textoMalenia.getRespuestas2()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta3.setText(textoMalenia.getRespuestas3()[iteradorExamenMelina]);
                tpFinalMaleniarespuesta4.setText(textoMalenia.getRespuestas4()[iteradorExamenMelina]);
                respuesta = respuestaUsuarioTPFinalMelina.getText();
                if (respuesta.equals(textoMalenia.getRespuestasTPFinal()[iteradorExamenMelina - 1])) {
                    notaTPMalenia += 1;
                }
                iteradorExamenMelina++;
                actualizarBotonesTpFinalMalenia();
                ActualizarTextRespuestas();
            } else {
                respuesta = respuestaUsuarioTPFinalMelina.getText();
                if (respuesta.equals(textoMalenia.getRespuestasTPFinal()[iteradorExamenMelina - 1])) {
                    notaTPMalenia += 1;
                }
                preguntaTPFinalMalenia.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
                tpFinalMaleniarespuesta1.setText("");
                tpFinalMaleniarespuesta2.setText("");
                tpFinalMaleniarespuesta3.setText("");
                tpFinalMaleniarespuesta4.setText("");
                elegirRespuestaTpFinalMalenia.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
                tpFinalMeleniaTerminarTp.setDisable(false);
                elegirRespuestaTpFinalMalenia.setDisable(true);
                gestionPersonaje.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

                ArrayList<Integer> Notas = personaje.getListaNotas();
                Notas.set(0, notaTPMalenia);
                gestionPersonaje.sumarStressPersonaje(personaje, estresParciales);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
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
    //endregion

    //region examen Buffini
    public void MenuExamenBuffini(ActionEvent event) {

        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        Personaje personaje= gestionPersonaje.cargarPersonaje();
        TPFinalBuffini textoBuffini = new TPFinalBuffini();
        String respuesta;

        if(personaje.getEstadoEstres().equals(Personaje.estadoEstres.ESTRESADO))
        {
            if (iteradorExamenBuffini == 0) {
                preguntaBenoffiTPFinal.setText(textoBuffini.getPreguntasChino()[iteradorExamenBuffini]);
                respuesta1BenoffiTPFinal.setText(textoBuffini.getRespuestas1Chino()[iteradorExamenBuffini]);
                respuesta2BenoffiTPFinal.setText(textoBuffini.getRespuestas2Chino()[iteradorExamenBuffini]);
                respuesta3BenoffiTPFinal.setText(textoBuffini.getRespuestas3Chino()[iteradorExamenBuffini]);
                respuesta4BenoffiTPFinal.setText(textoBuffini.getRespuestas4Chino()[iteradorExamenBuffini]);
                comenzarTpFinalBuffini.setDisable(true);
                elegirRespuestaTpFinalBuffini.setDisable(false);
                tpFinalBuffiniTerminarTp.setDisable(true);
                iteradorExamenBuffini++;
                ActualizarTextRespuestasBuffini();
            } else if (iteradorExamenBuffini < textoBuffini.getPreguntasChino().length) {
                preguntaBenoffiTPFinal.setText(textoBuffini.getPreguntasChino()[iteradorExamenBuffini]);
                respuesta1BenoffiTPFinal.setText(textoBuffini.getRespuestas1Chino()[iteradorExamenBuffini]);
                respuesta2BenoffiTPFinal.setText(textoBuffini.getRespuestas2Chino()[iteradorExamenBuffini]);
                respuesta3BenoffiTPFinal.setText(textoBuffini.getRespuestas3Chino()[iteradorExamenBuffini]);
                respuesta4BenoffiTPFinal.setText(textoBuffini.getRespuestas4Chino()[iteradorExamenBuffini]);
                respuesta = respuestaUsuarioTPFinalBuffini.getText();
                ActualizarTextRespuestasBuffini();
                iteradorExamenBuffini++;
                actualizarBotonesTpFinalBuffini();
                ActualizarTextRespuestasBuffini();
            } else {
                respuesta = respuestaUsuarioTPFinalBuffini.getText();
                preguntaBenoffiTPFinal.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
                respuesta1BenoffiTPFinal.setText("");
                respuesta2BenoffiTPFinal.setText("");
                respuesta3BenoffiTPFinal.setText("");
                respuesta4BenoffiTPFinal.setText("");
                elegirRespuestaTpFinalBuffini.setDisable(true);
                tpFinalBuffiniTerminarTp.setDisable(false);
                comenzarTpFinalBuffini.setDisable(true);
                gestionPersonaje.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

                ArrayList<Integer> Notas = personaje.getListaNotas();
                Notas.set(1, 0);
                gestionPersonaje.sumarStressPersonaje(personaje, estresParciales);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
        }
        else {
            if (iteradorExamenBuffini == 0) {
                preguntaBenoffiTPFinal.setText(textoBuffini.getPreguntas()[iteradorExamenBuffini]);
                respuesta1BenoffiTPFinal.setText(textoBuffini.getRespuestas1()[iteradorExamenBuffini]);
                respuesta2BenoffiTPFinal.setText(textoBuffini.getRespuestas2()[iteradorExamenBuffini]);
                respuesta3BenoffiTPFinal.setText(textoBuffini.getRespuestas3()[iteradorExamenBuffini]);
                respuesta4BenoffiTPFinal.setText(textoBuffini.getRespuestas4()[iteradorExamenBuffini]);
                comenzarTpFinalBuffini.setDisable(true);
                elegirRespuestaTpFinalBuffini.setDisable(false);
                tpFinalBuffiniTerminarTp.setDisable(true);
                iteradorExamenBuffini++;
                ActualizarTextRespuestasBuffini();
            } else if (iteradorExamenBuffini < textoBuffini.getPreguntas().length) {
                preguntaBenoffiTPFinal.setText(textoBuffini.getPreguntas()[iteradorExamenBuffini]);
                respuesta1BenoffiTPFinal.setText(textoBuffini.getRespuestas1()[iteradorExamenBuffini]);
                respuesta2BenoffiTPFinal.setText(textoBuffini.getRespuestas2()[iteradorExamenBuffini]);
                respuesta3BenoffiTPFinal.setText(textoBuffini.getRespuestas3()[iteradorExamenBuffini]);
                respuesta4BenoffiTPFinal.setText(textoBuffini.getRespuestas4()[iteradorExamenBuffini]);
                respuesta = respuestaUsuarioTPFinalBuffini.getText();
                ActualizarTextRespuestasBuffini();
                if (respuesta.equals(textoBuffini.getRespuestasTPFinal()[iteradorExamenBuffini - 1])) {
                    notaTPBuffini += 1;
                }
                iteradorExamenBuffini++;
                actualizarBotonesTpFinalBuffini();
                ActualizarTextRespuestasBuffini();
            } else {
                respuesta = respuestaUsuarioTPFinalBuffini.getText();
                if (respuesta.equals(textoBuffini.getRespuestasTPFinal()[iteradorExamenBuffini - 1])) {
                    notaTPBuffini += 1;
                }
                preguntaBenoffiTPFinal.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
                respuesta1BenoffiTPFinal.setText("");
                respuesta2BenoffiTPFinal.setText("");
                respuesta3BenoffiTPFinal.setText("");
                respuesta4BenoffiTPFinal.setText("");
                elegirRespuestaTpFinalBuffini.setDisable(true);
                tpFinalBuffiniTerminarTp.setDisable(false);
                comenzarTpFinalBuffini.setDisable(true);
                gestionPersonaje.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

                ArrayList<Integer> Notas = personaje.getListaNotas();
                Notas.set(1, notaTPBuffini);
                gestionPersonaje.sumarStressPersonaje(personaje,estresParciales);
                personaje.setEstres(personaje.getEstres() + estresParciales);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
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
    //endregion

    //region Examen Batizi
    public void MenuExamenBatizzi(ActionEvent event) {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        TPFinalBarizi textoBatizi = new TPFinalBarizi();
        Personaje personaje= gestionPersonaje.cargarPersonaje();
        String respuesta;

        if(personaje.getEstadoEstres().equals(Personaje.estadoEstres.ESTRESADO))
        {
            if (iteradorExamenBatizzi == 0) {
                preguntaTPFinalBatizi.setText(textoBatizi.getPreguntasChino()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi1.setText(textoBatizi.getRespuestas1Chino()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi11.setText(textoBatizi.getRespuestas2Chino()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi12.setText(textoBatizi.getRespuestas3Chino()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi121.setText(textoBatizi.getRespuestas4Chino()[iteradorExamenBatizzi]);
                comenzarTpFinalBatizzi.setDisable(true);
                elegirRespuestaTpFinalBatizzi.setDisable(false);
                tpFinalBatizziTerminarTp.setDisable(true);
                iteradorExamenBatizzi++;
                ActualizarTextRespuestasBatizzi();
            } else if (iteradorExamenBatizzi < textoBatizi.getPreguntasChino().length) {
                preguntaTPFinalBatizi.setText(textoBatizi.getPreguntasChino()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi1.setText(textoBatizi.getRespuestas1Chino()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi11.setText(textoBatizi.getRespuestas2Chino()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi12.setText(textoBatizi.getRespuestas3Chino()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi121.setText(textoBatizi.getRespuestas4Chino()[iteradorExamenBatizzi]);
                respuesta = respuestaUsuarioTPFinalBtzz.getText();
                ActualizarTextRespuestasBatizzi();
                iteradorExamenBatizzi++;
                actualizarBotonesTpFinalBatizzi();
                ActualizarTextRespuestasBatizzi();
            } else {
                respuesta = respuestaUsuarioTPFinalBtzz.getText();

                preguntaTPFinalBatizi.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
                preguntaTPFinalBatizi1.setText("");
                preguntaTPFinalBatizi11.setText("");
                preguntaTPFinalBatizi12.setText("");
                preguntaTPFinalBatizi121.setText("");
                elegirRespuestaTpFinalBatizzi.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
                tpFinalBatizziTerminarTp.setDisable(false);
                comenzarTpFinalBatizzi.setDisable(true);
                gestionPersonaje.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

                ArrayList<Integer> Notas = personaje.getListaNotas();
                Notas.set(2, 0);
                gestionPersonaje.sumarStressPersonaje(personaje, estresParciales);
                personaje.setEstres(personaje.getEstres() + estresParciales);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
        }
        else {
            if (iteradorExamenBatizzi == 0) {
                preguntaTPFinalBatizi.setText(textoBatizi.getPreguntas()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi1.setText(textoBatizi.getRespuestas1()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi11.setText(textoBatizi.getRespuestas2()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi12.setText(textoBatizi.getRespuestas3()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi121.setText(textoBatizi.getRespuestas4()[iteradorExamenBatizzi]);
                comenzarTpFinalBatizzi.setDisable(true);
                elegirRespuestaTpFinalBatizzi.setDisable(false);
                tpFinalBatizziTerminarTp.setDisable(true);
                iteradorExamenBatizzi++;
                ActualizarTextRespuestasBatizzi();
            } else if (iteradorExamenBatizzi < textoBatizi.getPreguntas().length) {
                preguntaTPFinalBatizi.setText(textoBatizi.getPreguntas()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi1.setText(textoBatizi.getRespuestas1()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi11.setText(textoBatizi.getRespuestas2()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi12.setText(textoBatizi.getRespuestas3()[iteradorExamenBatizzi]);
                preguntaTPFinalBatizi121.setText(textoBatizi.getRespuestas4()[iteradorExamenBatizzi]);
                respuesta = respuestaUsuarioTPFinalBtzz.getText();
                ActualizarTextRespuestasBatizzi();
                if (respuesta.equals(textoBatizi.getRespuestasTPFinal()[iteradorExamenBatizzi - 1])) {
                    notaTPBatizi += 1;
                }
                iteradorExamenBatizzi++;
                actualizarBotonesTpFinalBatizzi();
                ActualizarTextRespuestasBatizzi();
            } else {
                respuesta = respuestaUsuarioTPFinalBtzz.getText();
                if (respuesta.equals(textoBatizi.getRespuestasTPFinal()[iteradorExamenBatizzi - 1])) {
                    notaTPBatizi += 1;
                }
                preguntaTPFinalBatizi.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
                preguntaTPFinalBatizi1.setText("");
                preguntaTPFinalBatizi11.setText("");
                preguntaTPFinalBatizi12.setText("");
                preguntaTPFinalBatizi121.setText("");
                elegirRespuestaTpFinalBatizzi.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
                tpFinalBatizziTerminarTp.setDisable(false);
                comenzarTpFinalBatizzi.setDisable(true);
                gestionPersonaje.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

                ArrayList<Integer> Notas = personaje.getListaNotas();
                Notas.set(2, notaTPBatizi);
                gestionPersonaje.sumarStressPersonaje(personaje, estresParciales);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
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
    //endregion

    //region Chulde
    public void MenuExamenChulde(ActionEvent event) {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        PersonajeRepo repo = new PersonajeRepo();
        TPFinalChulde textoChulde = new TPFinalChulde();
        Personaje personaje= gestionPersonaje.cargarPersonaje();
        String respuesta;

        if(personaje.getEstadoEstres().equals(Personaje.estadoEstres.ESTRESADO))
        {
            if (iteradorExamenChulde == 0) {
                textPreguntasChalduTpFinal.setText(textoChulde.getPreguntasChino()[iteradorExamenChulde]);
                respuestasTpFinalChandlu1.setText(textoChulde.getRespuestas1Chino()[iteradorExamenChulde]);
                respuestasTpFinalChandlu2.setText(textoChulde.getRespuestas2Chino()[iteradorExamenChulde]);
                respuestasTpFinalChandlu3.setText(textoChulde.getRespuestas3Chino()[iteradorExamenChulde]);
                respuestasTpFinalChandlu4.setText(textoChulde.getRespuestas3Chino()[iteradorExamenChulde]);
                comenzarTpFinalChulde.setDisable(true);
                elegirRespuestaTpFinalChulde.setDisable(false);
                tpFinalChuldeTerminarTp.setDisable(true);
                iteradorExamenChulde++;
                ActualizarTextRespuestasChulde();
            } else if (iteradorExamenChulde < textoChulde.getPreguntasChino().length) {
                textPreguntasChalduTpFinal.setText(textoChulde.getPreguntasChino()[iteradorExamenChulde]);
                respuestasTpFinalChandlu1.setText(textoChulde.getRespuestas1Chino()[iteradorExamenChulde]);
                respuestasTpFinalChandlu2.setText(textoChulde.getRespuestas2Chino()[iteradorExamenChulde]);
                respuestasTpFinalChandlu3.setText(textoChulde.getRespuestas3Chino()[iteradorExamenChulde]);
                respuestasTpFinalChandlu4.setText(textoChulde.getRespuestas4Chino()[iteradorExamenChulde]);
                respuesta = respuestaUsuarioTPFinalChulde.getText();
                ActualizarTextRespuestasChulde();
                iteradorExamenChulde++;
                actualizarBotonesTpFinalChulde();
                ActualizarTextRespuestasChulde();
            } else {
                respuesta = respuestaUsuarioTPFinalChulde.getText();
                textPreguntasChalduTpFinal.setText("Bueno terminaron el TP para la proxima semana se los corrijo");
                respuestasTpFinalChandlu1.setText("");
                respuestasTpFinalChandlu2.setText("");
                respuestasTpFinalChandlu3.setText("");
                respuestasTpFinalChandlu4.setText("");
                elegirRespuestaTpFinalChulde.setDisable(true); // Deshabilitar el botón cuando se han mostrado todos los mensajes
                tpFinalChuldeTerminarTp.setDisable(false);
                comenzarTpFinalChulde.setDisable(true);
                gestionPersonaje.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);
                ArrayList<Integer> Notas = personaje.getListaNotas();
                Notas.set(3, 0);
                gestionPersonaje.sumarStressPersonaje(personaje, estresParciales);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
        }
        else {

            if (iteradorExamenChulde == 0) {
                textPreguntasChalduTpFinal.setText(textoChulde.getPreguntas()[iteradorExamenChulde]);
                respuestasTpFinalChandlu1.setText(textoChulde.getRespuestas1()[iteradorExamenChulde]);
                respuestasTpFinalChandlu2.setText(textoChulde.getRespuestas2()[iteradorExamenChulde]);
                respuestasTpFinalChandlu3.setText(textoChulde.getRespuestas3()[iteradorExamenChulde]);
                respuestasTpFinalChandlu4.setText(textoChulde.getRespuestas4()[iteradorExamenChulde]);
                comenzarTpFinalChulde.setDisable(true);
                elegirRespuestaTpFinalChulde.setDisable(false);
                tpFinalChuldeTerminarTp.setDisable(true);
                iteradorExamenChulde++;
                ActualizarTextRespuestasChulde();
            } else if (iteradorExamenChulde < textoChulde.getPreguntas().length) {
                textPreguntasChalduTpFinal.setText(textoChulde.getPreguntas()[iteradorExamenChulde]);
                respuestasTpFinalChandlu1.setText(textoChulde.getRespuestas1()[iteradorExamenChulde]);
                respuestasTpFinalChandlu2.setText(textoChulde.getRespuestas2()[iteradorExamenChulde]);
                respuestasTpFinalChandlu3.setText(textoChulde.getRespuestas3()[iteradorExamenChulde]);
                respuestasTpFinalChandlu4.setText(textoChulde.getRespuestas4()[iteradorExamenChulde]);
                respuesta = respuestaUsuarioTPFinalChulde.getText();
                ActualizarTextRespuestasChulde();
                if (respuesta.equals(textoChulde.getRespuestasTPFinal()[iteradorExamenChulde - 1])) {
                    notaChulde += 1;
                }
                iteradorExamenChulde++;
                actualizarBotonesTpFinalChulde();
                ActualizarTextRespuestasChulde();
            } else {
                respuesta = respuestaUsuarioTPFinalChulde.getText();
                if (respuesta.equals(textoChulde.getRespuestasTPFinal()[iteradorExamenChulde - 1])) {
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
                gestionPersonaje.setAsistenciaDia(GameData.AsistenciaClase.PRESENTE);

                ArrayList<Integer> Notas = personaje.getListaNotas();
                Notas.set(3, notaChulde);
                gestionPersonaje.sumarStressPersonaje(personaje, estresParciales);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
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
    public void EventoCartasYBenoffi(ActionEvent event) {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        int ultimodia = gestionPersonaje.ultimoDia();

        if (ultimodia == 5 && personaje.getGuardadoPartida().get(ultimodia - 1).getEventoCompletado().equals(GameData.eventoCompletado.NO_COMPLETADO)) {
            switchToEventoCartas(event);
        } else if(ultimodia == 7 && personaje.getGuardadoPartida().get(ultimodia - 1).getEventoCompletado().equals(GameData.eventoCompletado.NO_COMPLETADO)) {
            switchToEventoBenoffi(event);
        }
        else
        {
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
    public void EventoMetegolYRespuestas(ActionEvent event) {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();

        int ultimodia = gestionPersonaje.ultimoDia();

        if (ultimodia == 11 && personaje.getGuardadoPartida().get(ultimodia - 1).getEventoCompletado().equals(GameData.eventoCompletado.NO_COMPLETADO)) {
            switchToEventoMeteGol(event);
        } else if(ultimodia == 15 && personaje.getGuardadoPartida().get(ultimodia - 1).getEventoCompletado().equals(GameData.eventoCompletado.NO_COMPLETADO)) {
            switchToEventoRespuestas(event);
        }
        else
        {
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
    public void AceptarBenoffi(ActionEvent event)
    {
        PersonajeRepo repo = new PersonajeRepo();
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        List<GameData> Listadata = gestionPersonaje.listaGameData();
        int ultimodia = gestionPersonaje.ultimoDia();

        if (event.getSource().equals(aceptarEventoBuffini)) {

            GameData gameData = Listadata.get(ultimodia - 1);
            gameData.setEventoCompletado(GameData.eventoCompletado.COMPLETADO);
            gestionPersonaje.restarStressJuegos(personaje, 5);
        }
        switchToPatioFacultad(event);
    }

    public void RechazarBenoffi(ActionEvent event)
    {
        if (event.getSource().equals(rechazoEventoBuffini)) {
            switchToPatioFacultad(event);
        }
    }

    public void AceptarRespuestas(ActionEvent event)
    {
        PersonajeRepo repo = new PersonajeRepo();
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        List<GameData> Listadata = gestionPersonaje.listaGameData();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        int ultimodia = gestionPersonaje.ultimoDia();
        if (event.getSource().equals(siDarPlataEventoRespuestas) && personaje.getDinero() >= 500) {
            switchToEventoRespuestas2(event);
            gestionPersonaje.descontarDinero(500);
            GameData gameData = Listadata.get(ultimodia - 1);
            gameData.setEventoCompletado(GameData.eventoCompletado.COMPLETADO);
            repo.Modificar(personaje);
        }
    }

    public void ActualizarDineroBanio()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        mostrarDineroEvento.setText(String.valueOf(personaje.getDinero()));
    }

    public void RechazarRespuestas(ActionEvent event)
    {
        if (event.getSource().equals(NoDarPlantaEventoRespuestas)) {
            switchToBuffetGeneral(event);
        }
    }

    public void TerminarDeverRespuestas(ActionEvent event)
    {
         switchToBanioGeneral(event);
    }


    public void RestarEstresEventos(ActionEvent event) {
        PersonajeRepo personajeRepo = new PersonajeRepo();
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        if (ContadorIntentosEventos < MaximoIntentosEventos) {
            if (event.getSource().equals(juegarPingPong))
            {
                switchToJugarPingPong(event);
                gestionPersonaje.restarStressJuegos(personaje, 15);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            } else if (event.getSource().equals(jugarCartas)) {

                switchToJugarCartas(event);
                gestionPersonaje.restarStressJuegos(personaje, 15);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
            else
            {
                switchToJugarMeteGol(event);
                gestionPersonaje.restarStressJuegos(personaje, 15);
                gestionPersonaje.cambioEstado(personaje.getEstres());
            }
           ContadorIntentosEventos++;
        }
    }

    public void Gimnasio(ActionEvent event)
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        int ultimodia = gestionPersonaje.ultimoDia();
        double promedio = PromedioNotas();

        if (ultimodia == 17 && promedio >= 6) {
            switchToGoodEnding(event);
        } else if(ultimodia == 17 && promedio < 6) {
            switchToBadEnding(event);
        }
        else
        {
            switchToEscenarioEscolar(event);
        }
    }

    public void ActualizarBotonSalida()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        int ultimodia = gestionPersonaje.ultimoDia();
        salida.setVisible(ultimodia != 17);
    }

    public void UpdateParciales()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        ArrayList<Integer>listaNotas = personaje.getListaNotas();

        finalJuegoNota1.setText(String.valueOf(listaNotas.get(0)));
        finalJuegoNota2.setText(String.valueOf(listaNotas.get(1)));
        finalJuegoNota3.setText(String.valueOf(listaNotas.get(2)));
        finalJuegoNota4.setText(String.valueOf(listaNotas.get(3)));
    }

    public void UpdateParciales2()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        ArrayList<Integer>listaNotas = personaje.getListaNotas();

        finalJuegoNota1BE.setText(String.valueOf(listaNotas.get(0)));
        finalJuegoNota2BE.setText(String.valueOf(listaNotas.get(1)));
        finalJuegoNota3BE.setText(String.valueOf(listaNotas.get(2)));
        finalJuegoNota4BE.setText(String.valueOf(listaNotas.get(3)));
    }

    private double PromedioNotas()
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        int total = 0;
        double promedio;
        int i;


        for(i = 0;i<personaje.getListaNotas().size();i++)
        {
            total+=personaje.getListaNotas().get(i);
        }

        promedio = (double) total /i;

        return promedio;
    }

    public void VerificarAula2YEvento(ActionEvent event)
    {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        int ultimodia = gestionPersonaje.ultimoDia();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        if (ultimodia == 13 && personaje.getGuardadoPartida().get(ultimodia - 1).getEventoCompletado().equals(GameData.eventoCompletado.NO_COMPLETADO)) {
            switchToEventoBatiziAyudemi(event);
        }
        else
        {
            switchToaula2(event);
        }
    }

    public void RechazarUdemy(ActionEvent event)
    {
        if (event.getSource().equals(noCupongAyudemi)) {
            switchToPasilloPrincipal(event);
        }
    }

    public void AceptarUdemy(ActionEvent event)
    {
        PersonajeRepo repo = new PersonajeRepo();
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        List<GameData> Listadata = gestionPersonaje.listaGameData();
        Personaje personaje = gestionPersonaje.cargarPersonaje();
        int ultimodia = gestionPersonaje.ultimoDia();

        if (event.getSource().equals(siCupongAyudemi)) {
            gestionPersonaje.restarStressJuegos(personaje, 10);
        }
        switchToaula2(event);
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

    //region bebidas Buffet
    public void CafeConLeche() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        gestionPersonaje.actualizarBuffet("Cafe_con_Leche", 130);
    }

    public void Capuccino() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        gestionPersonaje.actualizarBuffet("Capuccino", 250);
    }

    public void Cortado() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        gestionPersonaje.actualizarBuffet("Cortado", 140);
    }

    public void Lagrima() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        gestionPersonaje.actualizarBuffet("Lagrima", 160);
    }

    public void Jugo() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        gestionPersonaje.actualizarBuffet("Jugo", 130);
    }

    public void Te() {
        GestionPersonaje gestionPersonaje = new GestionPersonaje();
        gestionPersonaje.actualizarBuffet("Te", 120);
    }
    //endregion
}