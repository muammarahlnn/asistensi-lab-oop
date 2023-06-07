package pertemuan9;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        showScene1();
        stage.show();
    }

    // Scene 1: Halaman Utama
    public void showScene1() {
        Image logoImage = new Image("/image/calc.jpg");
        ImageView logoImageView = new ImageView(logoImage);
        logoImageView.setFitWidth(200);
        logoImageView.setPreserveRatio(true);

        Label title = new Label("KALKULATOR ESTETIK TRALALA");
        title.getStyleClass().add("title-label");
        title.setFont(Font.font("Arial", 24));

        Button startButton = new Button("START");
        startButton.getStyleClass().add("start-button");
        startButton.setFont(Font.font("Arial", 14));
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
        Label title = new Label("MENU CALCULATOR");
        title.getStyleClass().add("title-label");
        title.setFont(Font.font("Arial", 24));

        Button pythagorasButton = new Button("Pythagoras");
        pythagorasButton.getStyleClass().add("menu-button");
        pythagorasButton.setFont(Font.font("Arial", 14));
        pythagorasButton.setOnAction(action -> showPythagorasCalculation());

        Button cmToMeterButton = new Button("Convert Centimeter to Meter");
        cmToMeterButton.getStyleClass().add("menu-button");
        cmToMeterButton.setFont(Font.font("Arial", 14));
        cmToMeterButton.setOnAction(action -> showCmToMeterConversion());

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getStyleClass().add("scene2-layout");
        layout.getChildren().addAll(title, pythagorasButton, cmToMeterButton);

        Scene scene2 = new Scene(layout, 300, 400);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());

        stage.setScene(scene2);
    }

    // Scene 3: Halaman Kalkulasi Pythagoras
    public void showPythagorasCalculation() {
        Label title = new Label("Pythagoras");
        title.getStyleClass().add("title-label");
        title.setFont(Font.font("Arial", 24));

        TextField side1Field = new TextField();
        side1Field.setPromptText("side length 1 (cm)");

        TextField side2Field = new TextField();
        side2Field.setPromptText("side length 2 (cm)");

        Label resultLabel = new Label();

        Button calculateButton = new Button("Calculate");
        calculateButton.getStyleClass().add("calc-button");
        calculateButton.setFont(Font.font("Arial", 14));
        calculateButton.setOnAction(action -> {
            try {
                double side1 = Double.parseDouble(side1Field.getText());
                double side2 = Double.parseDouble(side2Field.getText());
                double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
                resultLabel.setText("Hasil: " + hypotenuse + " cm");
            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter a valid number");
            }
        });

        Button clearButton = new Button("Clear");
        clearButton.getStyleClass().add("clear-button");
        clearButton.setFont(Font.font("Arial", 14));
        clearButton.setOnAction(action -> {
            side1Field.clear();
            side2Field.clear();
            resultLabel.setText("");
        });

        Button backButton = new Button("Back to Menu");
        backButton.getStyleClass().add("back-button");
        backButton.setFont(Font.font("Arial", 14));
        backButton.setOnAction(action -> showScene2());

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getStyleClass().add("scene3-layout");
        layout.getChildren().addAll(title, side1Field, side2Field, calculateButton, resultLabel, clearButton, backButton);

        Scene scene3 = new Scene(layout, 300, 400);
        scene3.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());

        stage.setScene(scene3);
    }

    // Scene 4: Halaman Konversi Centimeter ke Meter
    public void showCmToMeterConversion() {
        Label title = new Label("Convert Centimeter to Meter");
        title.getStyleClass().add("title-label");
        title.setFont(Font.font("Arial", 24));

        TextField cmField = new TextField();
        cmField.setPromptText("Centimeter");

        Label resultLabel = new Label();

        Button convertButton = new Button("Convert");
        convertButton.getStyleClass().add("convert-button");
        convertButton.setFont(Font.font("Arial", 14));
        convertButton.setOnAction(action -> {
            try {
                double cm = Double.parseDouble(cmField.getText());
                double meter = cm / 100;
                resultLabel.setText("Hasil: " + meter + " meter");
            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter a valid number");
            }
        });

        Button clearButton = new Button("Clear");
        clearButton.getStyleClass().add("clear-button");
        clearButton.setFont(Font.font("Arial", 14));
        clearButton.setOnAction(action -> {
            cmField.clear();
            resultLabel.setText("");
        });

        Button backButton = new Button("Back to Menu");
        backButton.getStyleClass().add("back-button");
        backButton.setFont(Font.font("Arial", 14));
        backButton.setOnAction(action -> showScene2());

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getStyleClass().add("scene4-layout");
        layout.getChildren().addAll(title, cmField, convertButton, resultLabel, clearButton, backButton);

        Scene scene4 = new Scene(layout, 300, 400);
        scene4.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());

        stage.setScene(scene4);
    }
}