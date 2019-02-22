package com.kodilla.kodillaproject1;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import static com.kodilla.kodillaproject1.Boxes.*;
import static com.kodilla.kodillaproject1.Symbols.putCircle;
import static javafx.application.Platform.exit;

import javafx.stage.Stage;

public class Controller {


    public static void isWinner(int h) {

        Text message = new Text();
        if (h == 1) {
            message.setText("Congratulation! 'Cross' is a winner of the game.");
        }
        else if (h == 2) {
            message.setText("Sorry, you lost the game. 'Circle' is a winner of the game.");
        }
        message.setX(30);
        message.setY(50);
        message.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        Button buttonQuit = new Button("Quit");

        buttonQuit.setOnAction((e) -> {
            exit();
        });

        GridPane g = new GridPane();
        g.setAlignment(Pos.CENTER);
        g.setPadding(new Insets(5, 5, 5, 5));
        g.add(message, 1,1);
        g.add(buttonQuit, 2, 2);
        g.setHgap(5);
        g.setVgap(5);
        Scene sc = new Scene(g, 800, 70, Color.WHITE);
        Stage stageWin = new Stage();
        stageWin.setScene(sc);
        stageWin.show();
    }


    public static StackPane convertion(Object o) {
        final StackPane stackPane = (StackPane) o;
        return stackPane;
    }

    public static void checkWin(){

        //PION
        if (stackPaneHashMap.get(stackPane1)==stackPaneHashMap.get(stackPane4) &&
                stackPaneHashMap.get(stackPane4)==(stackPaneHashMap.get(stackPane7)) && stackPaneHashMap.get(stackPane1)!=0){
            isWinner(stackPaneHashMap.get(stackPane1));
        }
        else if((stackPaneHashMap.get(stackPane2)==(stackPaneHashMap.get(stackPane5)) &&
                stackPaneHashMap.get(stackPane5)==(stackPaneHashMap.get(stackPane8))) && stackPaneHashMap.get(stackPane8)!=0){
            isWinner(stackPaneHashMap.get(stackPane8));
        }
        else if((stackPaneHashMap.get(stackPane3)==(stackPaneHashMap.get(stackPane6)) &&
                stackPaneHashMap.get(stackPane9)==(stackPaneHashMap.get(stackPane6))) && stackPaneHashMap.get(stackPane6)!=0){
            isWinner(stackPaneHashMap.get(stackPane6));
        }
        //POZIOM
        else if((stackPaneHashMap.get(stackPane1)==(stackPaneHashMap.get(stackPane2)) &&
                stackPaneHashMap.get(stackPane2)==(stackPaneHashMap.get(stackPane3))) && stackPaneHashMap.get(stackPane3)!=0){
            isWinner(stackPaneHashMap.get(stackPane3));
        }
        else if((stackPaneHashMap.get(stackPane4)==(stackPaneHashMap.get(stackPane5)) &&
                stackPaneHashMap.get(stackPane5)==(stackPaneHashMap.get(stackPane6)))&& stackPaneHashMap.get(stackPane6)!=0){
            isWinner(stackPaneHashMap.get(stackPane6));
        }
        else if((stackPaneHashMap.get(stackPane7)==(stackPaneHashMap.get(stackPane8)) &&
                stackPaneHashMap.get(stackPane8)==(stackPaneHashMap.get(stackPane9))) && stackPaneHashMap.get(stackPane9)!=0){
            isWinner(stackPaneHashMap.get(stackPane9));
        }
        //SKOS
        else if((stackPaneHashMap.get(stackPane1)==(stackPaneHashMap.get(stackPane9)) &&
                stackPaneHashMap.get(stackPane9)==(stackPaneHashMap.get(stackPane5)))&& stackPaneHashMap.get(stackPane5)!=0){
            isWinner(stackPaneHashMap.get(stackPane5));
        }
        else if((stackPaneHashMap.get(stackPane3)==(stackPaneHashMap.get(stackPane5)) &&
                stackPaneHashMap.get(stackPane5)==(stackPaneHashMap.get(stackPane7)))&& stackPaneHashMap.get(stackPane7)!=0){
            isWinner(stackPaneHashMap.get(stackPane7));
        }
    }

    public static EventHandler<MouseEvent> clickOnBox = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent e) {

            if (stackPaneHashMap.get(convertion(e.getSource())) == 0) {
                Symbols.putCross(e.getSource());
            }

            checkWin();


            ArrayList<StackPane> list = new ArrayList<>();
            for(Map.Entry<StackPane, Integer> entry: stackPaneHashMap.entrySet()){
                if(entry.getValue() == 0){
                    list.add(entry.getKey());
                }
            }
            Random random = new Random();
            int index = random.nextInt(list.size());
            putCircle(list.get(index));

            checkWin();
        }
    };
}


