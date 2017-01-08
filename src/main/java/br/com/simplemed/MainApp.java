package br.com.simplemed;

import br.com.simplemed.presentation.simplemed.SimplemedView;
import com.airhacks.afterburner.injection.Injector;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {        
        SimplemedView mainappView = new SimplemedView();
        Scene scene = new Scene(mainappView.getView());
        stage.setTitle("SimpleMed");
//        final String uri = getClass().getResource("app.css").toExternalForm();
//        scene.getStylesheets().add(uri);
        stage.setScene(scene);
        stage.show();        
    }

   @Override
    public void stop() throws Exception {
        Injector.forgetAll();
    }    
    
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
