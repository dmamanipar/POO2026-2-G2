module pe.edu.upeu.algotimosgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.algotimosgui to javafx.fxml;
    exports pe.edu.upeu.algotimosgui;
}