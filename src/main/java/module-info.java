module com.example.tp_final_laboraotirio_iii {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires java.desktop;


    opens com.example.tp_final_laboraotirio_iii to javafx.fxml;
    exports com.example.tp_final_laboraotirio_iii;
    exports com.example.tp_final_laboraotirio_iii.Modelos;
    exports com.example.tp_final_laboraotirio_iii.Examenes;
}