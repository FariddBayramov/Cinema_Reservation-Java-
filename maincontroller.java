package com.example.cinema_reservation_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class maincontroller {
    @FXML
    Stage stage;
    @FXML
    Scene scene;

    @FXML
    Image image=new Image("file:\\C:\\Users\\Dell\\IdeaProjects\\cinema_reservation_system\\src\\main\\resources\\com\\example\\cinema_reservation_system\\mycinema.jpg");
    @FXML
    public ImageView imageView=new ImageView(image);
    public void tofilms(ActionEvent event) throws IOException {

        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("films.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
