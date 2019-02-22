package com.kodilla.kodillaproject1;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import static com.kodilla.kodillaproject1.Boxes.*;

public class TicTacToe extends Application{

    private Image image = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/background.png");

    public static void main (String[] args){
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setBackground(background);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(40, 50, 70, 24));
        grid.setHgap(20);
        grid.setVgap(20);

        grid.add(stackPane1, 1, 1);
        grid.add(stackPane2, 2, 1);
        grid.add(stackPane3, 3, 1);
        grid.add(stackPane4, 1, 2);
        grid.add(stackPane5, 2, 2);
        grid.add(stackPane6, 3, 2);
        grid.add(stackPane7, 1, 3);
        grid.add(stackPane8, 2, 3);
        grid.add(stackPane9, 3, 3);

        Scene scene = new Scene(grid, 700, 900, Color.WHITE);

        primaryStage.setTitle("Tic tac toe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
