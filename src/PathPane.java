import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polygon;

/**
 * Created by feryatgecen on 06.10.16.
 */
public class PathPane extends StackPane {

    private Region regionA;
    private Region star;

    public PathPane(){
        initializeControls();
        layoutControls();

    }

    private void initializeControls(){
        regionA = new Region();
        regionA.getStyleClass().addAll("path");

        star = new Region();
        star.getStyleClass().addAll("star");


    }

    private void layoutControls(){
        getChildren().addAll(regionA, star);
    }


}
