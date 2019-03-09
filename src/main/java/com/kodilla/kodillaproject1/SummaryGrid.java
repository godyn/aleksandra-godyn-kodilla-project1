package com.kodilla.kodillaproject1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import static com.kodilla.kodillaproject1.StartMenu.*;
import static com.kodilla.kodillaproject1.TicTacToe.*;

public class Grid2 {


    public static GridPane getGrid2() {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(20, 10, 10, 10));
        grid.setHgap(5);
        grid.setVgap(10);

        Text round = new Text("Round "+roundNumber+"/3");
        round.setFont(Font.font("Geneva", 22));
        Text score = new Text("Score");
        Text player = new Text();
        Text computer = new Text("Computer: "+computerScore);

        if(textFieldName.getText().equals("")){
            player.setText("You: "+playerScore);
        }
        else {
            player.setText(textFieldName.getText() + ": " + playerScore);
        }

        grid.add(round, 1,1);
        grid.add(score, 1,2);
        grid.add(player,1,3);
        grid.add(computer, 1, 4);



        return grid;
    }
}
