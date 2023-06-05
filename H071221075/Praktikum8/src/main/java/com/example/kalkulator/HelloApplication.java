package com.example.kalkulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.Key;

public class HelloApplication extends Application {
        private Stage stage;
        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage Stage) throws Exception{
            stage = Stage;
            stage.setTitle("KalkulatorRio");
            Scene1();
            Stage.show();
        }

        private void Scene1() {
            Label label1 = new Label("Kalkulator Rio");
            label1.setId("label1");
            Button button = new Button("Mulai");
            button.setOnAction(e -> Scene2());

            VBox layout = new VBox(40);
            layout.getStyleClass().add("layout");
            layout.getChildren().add(label1);
            layout.getChildren().add(button);
            layout.setAlignment(Pos.CENTER);

            Scene root = new Scene(layout, 500, 800);
            root.getStylesheets().add(getClass().getResource("/Styles/style.css").toExternalForm());
            stage.setScene(root);
        }

        private void Scene2() {
            // Box Paling Atas
            Rectangle rectangle1 = new Rectangle(500, 300);
            rectangle1.setFill(Color.DARKGREY);
            Text text1 = new Text("Hallo, ");
            text1.setFont(Font.font("Nexa", 50));
            text1.setFill(Color.WHITE);
            text1.setX(50);
            StackPane upperRectangle = new StackPane();
            upperRectangle.getChildren().addAll(rectangle1, text1);

            VBox upperbox = new VBox();
            upperbox.getChildren().add(upperRectangle);
            upperbox.setAlignment(Pos.TOP_CENTER);

            // Box Kalkulator BMI
            Button buttonBMI = new Button("BMI");
            buttonBMI.setOnAction(e -> KalkulatorBMI());


            // Box Kalkulator Diskon
            Button buttonDiskon = new Button("Diskon");
            buttonDiskon.setOnAction(e -> KalkulatorDiskon());



            // Box Kalkulator Mata Uang
            Button buttonKonversi = new Button("Konversi Mata Uang");
            buttonKonversi.setOnAction(e -> KonversiMataUang());


            // Box Utama
            VBox Menubox = new VBox(20); // Mengatur jarak vertikal antara elemen-elemen menjadi 20
            Menubox.getChildren().addAll(buttonDiskon, buttonKonversi, buttonBMI);
            Menubox.setAlignment(Pos.CENTER);

            VBox layout = new VBox(80);
            layout.getChildren().addAll(upperbox, Menubox);

            Scene root = new Scene(layout, 500, 800);
            root.getStylesheets().add(getClass().getResource("/Styles/style.css").toExternalForm());
            stage.setScene(root);
        }

        private void KalkulatorBMI() {
            TextField beratField = new TextField();
            beratField.setPromptText("Berat");
            TextField tinggiField = new TextField();
            tinggiField.setPromptText("Tinggi");
            Label Jawaban = new Label();

            Button hasil = new Button("Hasil");
            hasil.setOnAction(event -> {
                int berat = Integer.parseInt(beratField.getText());
                Double tinggi = Double.parseDouble(tinggiField.getText())/100;
                double BMI = berat / (tinggi*tinggi);
                Jawaban.setText(String.format("%.2f",BMI));
            });
            hasil.requestFocus();

            Button backbutton = new Button("Back");
            backbutton.setOnAction(event -> {
                Scene2();
            });


            VBox layout = new VBox(30, beratField,tinggiField,Jawaban,hasil,backbutton);
            layout.setAlignment(Pos.CENTER);

            Scene root = new Scene(layout, 500, 800);
            root.getStylesheets().add(getClass().getResource("/Styles/style.css").toExternalForm());
            stage.setScene(root);
            layout.requestFocus();

        }
        private void KalkulatorDiskon() {
            TextField jumlah = new TextField();
            TextField diskon = new TextField();
            Label Jawaban = new Label();


            Button hasil = new Button("Hasil");
            hasil.setOnAction(event -> {
                double total = Double.parseDouble(jumlah.getText());
                double persen = Double.parseDouble(diskon.getText());
                double HasilAkhir = total - (total*(persen/100));
                Jawaban.setText(String.valueOf(HasilAkhir));
            });

            Button backbutton = new Button("Back");
            backbutton.setOnAction(event -> {
                Scene2();
            });


            VBox layout = new VBox(20,jumlah,diskon,Jawaban,hasil,backbutton);
            layout.setAlignment(Pos.CENTER);

            Scene root = new Scene(layout, 500, 800);
            stage.setScene(root);
            root.getStylesheets().add(getClass().getResource("/Styles/style.css").toExternalForm());
        }

        private void KonversiMataUang() {
            TextField Uang = new TextField();
            Label label = new Label();
            Button buttonRP = new Button("Dollar -> Rupiah");
            buttonRP.setOnAction(event -> {
                int uang = Integer.parseInt(Uang.getText());
                int hasil = uang * 15000;
                label.setText(String.valueOf(hasil));
            });

            Button buttonDollar = new Button("Rupiah -> Dollar");
            buttonDollar.setOnAction(event -> {
                int uang = Integer.parseInt(Uang.getText());
                double hasil = uang / 15000;
                label.setText(String.valueOf(hasil));
            });

            Button backbutton = new Button("Back");
            backbutton.setOnAction(event -> {
                Scene2();
            });


            HBox hBox = new HBox(20);

            hBox.getChildren().add(buttonRP);
            hBox.getChildren().add(buttonDollar);
            hBox.setAlignment(Pos.CENTER);

            VBox mainbox = new VBox(30,Uang,label,hBox,backbutton);
            mainbox.setAlignment(Pos.CENTER);

            Scene root = new Scene(mainbox, 500, 800);
            stage.setScene(root);
            root.getStylesheets().add(getClass().getResource("/Styles/style.css").toExternalForm());
        }
}
