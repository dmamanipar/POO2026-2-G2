package pe.edu.upeu.algotimosgui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MatrizGUI extends Application {
    Label label;
    GridPane grid;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        label=new Label("Ejemplos Matrices");
        grid=new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label tam=new Label("Tamaño (n):");
        Spinner<Integer> spinner=new Spinner<>(2,30,5);
        Label numI=new Label("Numero de Inicio:");
        Spinner<Integer> spinner2=new Spinner<>(0,60,0);
        Button bt1=new Button("Generar Matriz");
        bt1.setOnAction(e -> {
            rellenarMf5(spinner.getValue(),spinner2.getValue());
        });

        HBox hb1=new HBox(10,tam,spinner,numI,spinner2,bt1);
        rellenarMf5(spinner.getValue(),spinner2.getValue());//Agregado
        VBox vb1=new VBox(10,label,hb1, grid);
        ScrollPane sp=new ScrollPane(vb1);
        primaryStage.setScene(new Scene(sp));
        primaryStage.setTitle("Matriz-Formas");
        primaryStage.show();
    }

    public void rellenarMf5(int tm, int numI){
        grid.getChildren().clear();
        for (int f=0;f< tm;f++ ){
            for (int c=tm-1; c>=tm-1-f;c--){
                Button bt=new Button(String.valueOf(numI));
                bt.setMinSize(48,42);
                bt.setPrefSize(48,42);
                grid.add(bt, c, f);
                numI++;
            }
        }
    }

}
