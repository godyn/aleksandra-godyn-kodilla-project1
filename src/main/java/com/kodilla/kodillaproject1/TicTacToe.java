package com.kodilla.kodillaproject1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TicTacToe extends Application{

    private Image image = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/background.png");

    public static void main (String[] args){
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setBackground(background);

        Scene scene = new Scene(grid, 700, 700, Color.WHITE);

        primaryStage.setTitle("Tic tac toe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
