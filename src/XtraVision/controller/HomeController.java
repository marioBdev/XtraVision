package XtraVision.controller;

import XtraVision.fxmlLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class HomeController {
    @FXML
    private AnchorPane home;

    @FXML
    private Button btnRent;

    @FXML
    private Button btnReturn;

    @FXML
    private Pane view;

    @FXML
    private BorderPane mainPane;

    //btnRent
    @FXML
    private void handleBtnRent(ActionEvent event) {
        System.out.println("This button was just clicked!"); //double checking if the button is working properly
        fxmlLoader object = new fxmlLoader();
        view = object.getPage("itemMovie");
        mainPane.setCenter(view);

    }
}
