/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtraVision.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author genel
 */
public class CreditCardController implements Initializable {
    @FXML
    private Button purchaseBttn;
    @FXML
    private TextField cardnameField;
    @FXML
    private TextField cardnumberField;
    @FXML
    private TextField expdateField;
    @FXML
    private TextField codeField;
    @FXML
    private TextField emailField;
    @FXML
    private Button cancelBttn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
