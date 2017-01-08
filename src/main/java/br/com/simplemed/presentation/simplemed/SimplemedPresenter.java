/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simplemed.presentation.simplemed;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Ralfh
 */

public class SimplemedPresenter implements Initializable {
    
//    private final String FXMLPath = "/view/SimpleMain.fxml";
    
    @FXML ImageView logotipo;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image logo = new Image("/img/logoJHTC.jpg");
        logotipo.setImage(logo);
    }   
    
    
    
/*
//    @Override
    public Scene sceneShow(String FxmlPath) throws IOException {        
//        return super.sceneShow(FXMLPath);
    }
    
    @FXML
    public void btnAgendaFired(ActionEvent event) throws IOException {        
        CdiContext context = CdiContext.INSTANCE;
//        AgendaController controller = context.getBean(AgendaController.class);                
        Stage stage = new Stage();
        stage.setTitle("Simple");
        stage.setScene(controller.sceneShow(null));
        stage.initOwner(primaryStage);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();
    }    

    @FXML
    public void btnPacientesFired(ActionEvent event) throws IOException {        
        CdiContext context = CdiContext.INSTANCE;
//        PacienteController controller = context.getBean(PacienteController.class);                
        Stage stage = new Stage();
        stage.setTitle("Simple");
        stage.setScene(controller.sceneShow(null));
        stage.initOwner(primaryStage);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();
    }    
*/    
}
