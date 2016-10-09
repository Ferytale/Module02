import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by feryatgecen on 06.10.16.
 */
public class ShapePlayground extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Hier Klasse anpassen, damit es angezeigt wird
        //Parent rootPanel = new ShapePane();
        //Parent rootPanel = new PathPane();
        //Parent rootPanel = new ShapeTest();
        Parent rootPanel = new Element();

        Scene scene = new Scene(rootPanel);

        String fonts = getClass().getResource("fonts.css").toExternalForm();
        scene.getStylesheets().add(fonts);

        String stylesheet = getClass().getResource("styleElement.css").toExternalForm();
        scene.getStylesheets().add(stylesheet);

        primaryStage.setTitle("Element");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
