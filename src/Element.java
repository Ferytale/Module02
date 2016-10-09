import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.scene.layout.Region;


public class Element extends Region {

    private Rectangle rectangle;
    private Circle oval;
    private ShapeTest test;
    private Region region;

    public Element(){
        initializeControl();
        layoutControls();

    }

    private void initializeControl(){
        region = new Region();
        region.getStyleClass().addAll("region");

        rectangle = new Rectangle(600, 300);
        rectangle.getStyleClass().addAll("rectangle");
        rectangle.setArcHeight(10);
        rectangle.setArcWidth(10);

        oval = new Circle(68, 39, 87);
        oval.getStyleClass().addAll("oval");

        test = new ShapeTest();
        test.getStyleClass().addAll("testshape");



    }

    private void layoutControls(){
        getChildren().addAll(rectangle, oval, test);

    }


}
