module com.example.tp_final_laboraotirio_iii {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens com.example.tp_final_laboraotirio_iii to javafx.fxml;
    exports com.example.tp_final_laboraotirio_iii;
    exports com.example.tp_final_laboraotirio_iii.Modelos;
}