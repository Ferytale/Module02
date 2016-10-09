import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 * Created by feryatgecen on 06.10.16.
 */
public class ShapePane extends HBox {

    private Line line;
    private Rectangle rec;
    private Arc arc;
    private Polygon polygon;

    public  ShapePane(){
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        line = new Line(0, 0, 100, 100);
        line.getStyleClass().add("line");

        rec = new Rectangle(200, 200);
        rec.getStyleClass().add("rec");

        arc = new Arc(100, 100, 50, 50, 90, 200);
        arc.getStyleClass().add("arc");

        polygon = new Polygon();
        polygon.getPoints().addAll(127.735234, 204.0, 52.4987218, 243.554175, 66.867617, 159.777088, 6.0, 100.445825, 90.1169779, 88.2229124, 127.735234, 12.0, 165.35349, 88.2229124, 249.470468, 100.445825, 188.602851, 159.777088, 202.971746, 243.554175);
        polygon.getStyleClass().add("star");

    }

    private void layoutControls(){
        getChildren().addAll(line, rec, arc, polygon);
    }
}
