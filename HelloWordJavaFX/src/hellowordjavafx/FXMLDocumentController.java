/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellowordjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * @author Wesley Jacques
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMenssage;
    private Button btnClick;
    
    @FXML
    private void clickButton(ActionEvent event) {
        lblMenssage.setText("Ele altera o valor da Label xD");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
