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

public class filmscontroller {
    @FXML
    Stage stage;
    @FXML
    Scene scene;
    @FXML
    Image matrix=new Image("file:\\C:\\Users\\Dell\\IdeaProjects\\cinema_reservation_system\\src\\main\\resources\\com\\example\\cinema_reservation_system\\matrix.jpg");
    @FXML
    public ImageView matrixx=new ImageView(matrix);
    @FXML
    Image taken=new Image("file:\\C:\\Users\\Dell\\IdeaProjects\\cinema_reservation_system\\src\\main\\resources\\com\\example\\cinema_reservation_system\\taken.jpg");
    @FXML
    public ImageView takenn=new ImageView(taken);
    @FXML
    Image shawshank=new Image("file:\\C:\\Users\\Dell\\IdeaProjects\\cinema_reservation_system\\src\\main\\resources\\com\\example\\cinema_reservation_system\\shawshank.jpg");
    @FXML
    public ImageView shawshankk=new ImageView(shawshank);

    public void toreservaton(ActionEvent event) throws IOException {

        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void tomain(ActionEvent event) throws IOException {

        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
