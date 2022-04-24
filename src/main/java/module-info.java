module com.example.tp4 {
    requires javafx.controls;
    requires javafx.fxml;
    exports com.example.tp4.modelos;
    exports com.example.tp4.pantallas;
    opens com.example.tp4.pantallas to javafx.fxml;
    exports com.example.tp4;
}