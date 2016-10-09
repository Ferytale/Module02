import javafx.scene.layout.Region;

/**
 * Created by feryatgecen on 07.10.16.
 */
public class ShapeTest extends Region {

    private Region shape1;
    private Region shape2;
    private Region shape3;
    private Region shape4;


    public ShapeTest(){
        initializeControl();
        layoutControl();
        setId("shape");

    }

    private void initializeControl(){
        shape1 = new Region();
        shape1.getStyleClass().addAll("shape1");


        shape2 = new Region();
        shape2.getStyleClass().addAll("shape2");


        shape3 = new Region();
        shape3.getStyleClass().addAll("shape3");


        shape4 = new Region();
        shape4.getStyleClass().addAll("shape4");


    }

    private void layoutControl(){
        getChildren().addAll(shape4, shape1, shape2, shape3);

    }
}
