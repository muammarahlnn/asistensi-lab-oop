//with css
package pertemuan9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("KALKULATOR SEDERHANA");
        showScene1();
        stage.show();
    }

    // Scene 1: Halaman Utama
    public void showScene1() {
        Image logoImage = new Image("/image/2.PNG");
        ImageView logoImageView = new ImageView(logoImage);
        logoImageView.setFitWidth(200);
        logoImageView.setPreserveRatio(true);

        Label title = new Label("KALKULATOR SEDERHANA");
        title.getStyleClass().add("title-label");
        // title.setFont(Font.font("Courier New", 24));

        Button startButton = new Button("START");
        startButton.getStyleClass().add("start-button");
        // startButton.setFont(Font.font("Courier New", 14));
        startButton.setOnAction(action -> showScene2());

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getStyleClass().add("scene1-layout");
        layout.getChildren().addAll(logoImageView, title, startButton);

        Scene scene1 = new Scene(layout, 400, 400);
        scene1.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());

        stage.setScene(scene1);
    }
// Scene 2: Menu Utama
public void showScene2() {
    Label title = new Label("Kalkulator Sederhana");
    title.getStyleClass().add("title-label");

    Button cubeButton = new Button("Rumus Kubus");
    cubeButton.getStyleClass().add("menu-button");
    // cubeButton.setFont(Font.font("Courier New", 14));
    cubeButton.setOnAction(action -> showCubeCalculation());

    Button cmToMeterButton = new Button("Konversi Centimeter ke Meter");
    cmToMeterButton.getStyleClass().add("menu-button");
    cmToMeterButton.setOnAction(action -> showCmToMeterConversion());

    VBox layout = new VBox(10);
    layout.setAlignment(Pos.CENTER);
    layout.getStyleClass().add("scene2-layout");
    layout.getChildren().addAll(title, cubeButton, cmToMeterButton);

    Scene scene2 = new Scene(layout, 400, 400);
    scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());

    stage.setScene(scene2);
}

// Scene 3.1: Kubus
public void showCubeCalculation() {
    Label title = new Label("Rumus Kubus");
    title.getStyleClass().add("title-label");

    Label sideLabel = new Label("Panjang Sisi:");
    TextField sideField = new TextField();
    sideField.getStyleClass().add("text-field");
    sideField.setPromptText("Masukkan panjang sisi");

    Label resultLabel = new Label();

    Button calculateAreaButton = new Button("Calculate Area");
    calculateAreaButton.getStyleClass().add("calc-button");
    calculateAreaButton.setOnAction(action -> {
        try {
            double side = Double.parseDouble(sideField.getText());
            double area = 6 * side * side;
            resultLabel.setText("Luas: " + area);
        } catch (NumberFormatException e) {
            resultLabel.setText("Masukkan angka yang valid!");
        }
    });

    Button calculateVolumeButton = new Button("Calculate Volume");
    calculateVolumeButton.getStyleClass().add("calc-button");
    calculateVolumeButton.setOnAction(action -> {
        try {
            double side = Double.parseDouble(sideField.getText());
            double volume = side * side * side;
            resultLabel.setText("Volume: " + volume);
        } catch (NumberFormatException e) {
            resultLabel.setText("Masukkan angka yang valid");
        }
    });


    Button clearButton = new Button("Clear");
    clearButton.getStyleClass().add("clear-button");
    clearButton.setOnAction(action -> {
        sideField.clear();
        resultLabel.setText("");
    });

    Button backButton = new Button("Back to Menu");
    backButton.getStyleClass().add("back-button");
    backButton.setOnAction(action -> showScene2());

    VBox layout = new VBox(10);
    layout.setAlignment(Pos.CENTER);
    layout.getStyleClass().add("scene3-layout");
    layout.getChildren().addAll(title, sideLabel, sideField, calculateAreaButton, calculateVolumeButton, resultLabel, clearButton, backButton);

    Scene scene3 = new Scene(layout, 400, 400);
    scene3.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
    

    stage.setScene(scene3);
    }

    // Scene 3.2: Converse Centimeter to Meter
    public void showCmToMeterConversion() {
        Label title = new Label("Converse Centimeter ke Meter");
        title.getStyleClass().add("title-label");

        TextField cmField = new TextField();
        cmField.getStyleClass().add("text-field"); 
        cmField.setPromptText("Centimeter");
    

        Label resultLabel = new Label();

        Button convertButton = new Button("Converse");
        convertButton.getStyleClass().add("convert-button");
        convertButton.setOnAction(action -> {
            try {
                double cm = Double.parseDouble(cmField.getText());
                double meter = cm / 100;
                resultLabel.setText("Hasil: " + meter + " meter");
            } catch (NumberFormatException e) {
                resultLabel.setText("Masukkan angka yang valid!");
            }
        });

        Button clearButton = new Button("Clear");
        clearButton.getStyleClass().add("clear-button");
        clearButton.setOnAction(action -> {
            cmField.clear();
            resultLabel.setText("");
        });

        Button backButton = new Button("Back to Menu");
        backButton.getStyleClass().add("back-button");
        backButton.setOnAction(action -> showScene2());

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getStyleClass().add("scene4-layout");
        layout.getChildren().addAll(title, cmField, convertButton, resultLabel, clearButton, backButton);

        Scene scene4 = new Scene(layout, 400, 400);
        scene4.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());

        stage.setScene(scene4);
    }
}
