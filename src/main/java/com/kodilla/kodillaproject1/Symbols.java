package com.kodilla.kodillaproject1;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

import static com.kodilla.kodillaproject1.Boxes.stackPaneHashMap;
import static com.kodilla.kodillaproject1.Controller.convertion;

public class Symbols {

    public Symbols() {
    }

    public static void putCross(Object o){
        Line line1 = new Line(1, 1, 150, 150 );
        Line line2 = new Line(1, 150, 150, 1);
        line1.setStrokeWidth(5.0);
        line2.setStrokeWidth(5.0);
        Shape cross = Shape.union(line1, line2);
        convertion(o).getChildren().add(cross);
        stackPaneHashMap.put(convertion(o), 1);
    }

    public static void putCircle(StackPane sp){

        Ellipse circle = new Ellipse(20, 20, 70, 70);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5.0);

        sp.getChildren().add(circle);
        stackPaneHashMap.put(sp, 2);
    }

}
