package com.kodilla.kodillaproject1;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.util.HashMap;
import java.util.Map;

import static com.kodilla.kodillaproject1.Controller.clickOnBox;


public class Boxes{

    public static HashMap<StackPane, Integer> stackPaneHashMap = new HashMap<StackPane, Integer>();

    private static Image sp1 = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/sp1.png", 155, 155, true, false);
    private static Image sp2 = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/sp2.png", 155, 155, true, false);
    private static Image sp3 = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/sp3.png", 155, 155, true, false);
    private static Image sp4 = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/sp4.png", 155, 155, true, false);
    private static Image sp5 = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/sp5.png", 155, 155, true, false);
    private static Image sp6 = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/sp6.png", 155, 155, true, false);
    private static Image sp7 = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/sp7.png", 155, 155, true, false);
    private static Image sp8 = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/sp8.png", 155, 155, true, false);
    private static Image sp9 = new Image("file:/Users/aleksandragodyn/PROGRAMMING/PROJECTS/kodilla-project1/src/main/resources/sp9.png", 155, 155, true, false);

    static StackPane stackPane1 = new StackPane(new ImageView(sp1));
    static StackPane stackPane2 = new StackPane(new ImageView(sp2));
    static StackPane stackPane3 = new StackPane(new ImageView(sp3));
    static StackPane stackPane4 = new StackPane(new ImageView(sp4));
    static StackPane stackPane5 = new StackPane(new ImageView(sp5));
    static StackPane stackPane6 = new StackPane(new ImageView(sp6));
    static StackPane stackPane7 = new StackPane(new ImageView(sp7));
    static StackPane stackPane8 = new StackPane(new ImageView(sp8));
    static StackPane stackPane9 = new StackPane(new ImageView(sp9));



    static {

        stackPaneHashMap.put(stackPane1, 0);
        stackPaneHashMap.put(stackPane2, 0);
        stackPaneHashMap.put(stackPane3, 0);
        stackPaneHashMap.put(stackPane4, 0);
        stackPaneHashMap.put(stackPane5, 0);
        stackPaneHashMap.put(stackPane6, 0);
        stackPaneHashMap.put(stackPane7, 0);
        stackPaneHashMap.put(stackPane8, 0);
        stackPaneHashMap.put(stackPane9, 0);

        for(Map.Entry<StackPane, Integer> entry: stackPaneHashMap.entrySet()){
            entry.getKey().addEventHandler(MouseEvent.MOUSE_CLICKED, clickOnBox);
        }
    }
}

