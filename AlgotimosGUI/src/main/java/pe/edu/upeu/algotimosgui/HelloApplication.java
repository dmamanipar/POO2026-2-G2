package pe.edu.upeu.algotimosgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Label mensaje = new Label("Bienvenido a JavaFX");
        mensaje.setStyle("-fx-font-size: 18px;");

        TextField nombre = new TextField();
        TextField num1 = new TextField();
        TextField num2 = new TextField();
        ChoiceBox<String> oper = new ChoiceBox<>();
        oper.getItems().addAll("+", "-", "*", "/");
        oper.setValue("+");

        Button boton = new Button("Saludar");
        boton.setOnAction(evento ->
                mensaje.setText("¡Hola !"+nombre.getText())
        );
        Button btnOper = new Button("Operar");
        Label resultado = new Label();
        btnOper.setOnAction(evento -> {
            switch (oper.getValue()) {
                case "+": resultado.setText(""+(Integer.parseInt(num1.getText())+Integer.parseInt(num2.getText()))); break;
                case "-": resultado.setText(""+(Integer.parseInt(num1.getText())-Integer.parseInt(num2.getText()))); break;
                case "*": resultado.setText(""+(Integer.parseInt(num1.getText())*Integer.parseInt(num2.getText()))); break;
                case "/": resultado.setText(""+(Integer.parseInt(num1.getText())/Integer.parseInt(num2.getText()))); break;
            }
        });
        VBox raiz = new VBox(15, mensaje, nombre, boton, num1, oper, num2,
                btnOper, resultado);
        raiz.setAlignment(Pos.CENTER);
        raiz.setStyle("-fx-padding: 30;");

        Scene escena = new Scene(raiz, 400, 250);

        stage.setTitle("Hola JavaFX");
        stage.setScene(escena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}