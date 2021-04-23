package XtraVision.controller;
import XtraVision.persistence.IMyListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import XtraVision.model.Movie;
import XtraVision.fxmlLoader;

//import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable  {
    // ----Buttons TOP
    @FXML
    private Button homeBtn;

    @FXML
    private Button hireMovieBtn;

    @FXML
    private Button workingBtn;

    @FXML
    private Button admBtn;

    // ------ MAIN FRAME
    @FXML
    private BorderPane mainPane;

    @FXML
    private ScrollPane mainScroll;

    @FXML
    private GridPane mainGrid;

    //------ VIEW INTERFACE
    @FXML
    private Label label;

    // ---- Loader Pane
    private Pane view;
    private IMyListener myListener;

    //------ METHODS MOVIE BEHAVIOURS

    private List<Movie> movies = new ArrayList<Movie>();
    private Movie movie;
    private Image image;

    //------ VIEW INTERFACE BEHAVIOURS
    // ------ SET A SPECIFIC MOVIE

    @FXML
    private void homeBtn (ActionEvent event) {
        System.out.println("You clicked me Home Button!");
        fxmlLoader object = new fxmlLoader();
        view = object.getPage("Home");
        mainPane.setCenter(view);
    }
    @FXML
    private void hireMovieBtn (ActionEvent event){
        System.out.println("You clicked me Hire Button!");
        fxmlLoader object = new fxmlLoader();
        view = object.getPage("HirePane");
        mainPane.setCenter(view);
    }
    @FXML
    private void admBtn (ActionEvent event){
        System.out.println("You clicked me ADM Button! ");
        fxmlLoader object = new fxmlLoader();
        view = object.getPage("AddMovie");
        mainPane.setCenter(view);
    }
//    @FXML
//    private void workingBtn (ActionEvent event){
//        System.out.println("You clicked me Working button!");
//        fxmlLoader object = new fxmlLoader();
//        view = object.getPage("Working");
//        mainPane.setCenter(view);
//    }
//    @FXML
//    private void handleBtn5Action (ActionEvent event){
//        System.out.println("You clicked me!");
//        fxmlLoader object = new fxmlLoader();
//        view = object.getPage("Screen5");
//        mainPane.setCenter(view);
//    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fxmlLoader object = new fxmlLoader();
        Pane view = object.getPage("Home");
            mainPane.setCenter(view);
    }
}
