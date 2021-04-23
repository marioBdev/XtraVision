package XtraVision.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.InputStream;

public class AddMovieController {
    //----- Inputs Page
    @FXML
    private AnchorPane admAnchor;

    @FXML
    private ImageView bigImage;

    @FXML
    private Button loadBigImageBtn;

    @FXML
    private ComboBox<String> categoryCb;

    @FXML
    private ComboBox<String> releadesCb;

    @FXML
    private TextField nameTf;

    @FXML
    private TextField subtitleTf;

    @FXML
    private TextField directorMovieTf;

    @FXML
    private TextArea starringTf;

    @FXML
    private TextArea movieDescripTf;

    @FXML
    private Button clearAdmBt;

    @FXML
    private Button insertMovieAdmBtn;

    private FileChooser fileChooser;
    private InputStream inputStream;

    //-----Methods SCOPE

//    fileChooser = new FileChooser();
//    fileChooser.getSe
//
//    loadBigImageBtn.setOnAction(e ->{
//        file =
//    })

}
