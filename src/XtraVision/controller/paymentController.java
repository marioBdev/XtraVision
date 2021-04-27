package XtraVision.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class paymentController {
    @FXML
    private TextField email;

    @FXML
    private CheckBox getEmailCkb;

    @FXML
    private TextField cardNameTf;

    @FXML
    private TextField credNumberTf;

    @FXML
    private TextField expMonth;
    
    @FXML
    private TextField expYear;

    @FXML
    private PasswordField securityNumbTf;

    @FXML
    private Label totalHiredTf;

    @FXML
    private Button generateNumber;

    @FXML
    private Button purchaseBtn;
    
    @FXML
    private Button cancelPurchase;

}
