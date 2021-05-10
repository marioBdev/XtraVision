package XtraVision.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import XtraVision.persistence.IMyListener;
import XtraVision.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class ItemMovieCtrl {
    @FXML
    private ImageView miniImage;

    @FXML
    private Label miniTitle;

    @FXML
    private Label miniSubTitle;

    @FXML
    private Label miniPrice;

    private Movie movie;
    private IMyListener myListener;

    //------ MAIN FRAME
    @FXML
    private BorderPane mainPane;

    @FXML
    private ScrollPane mainScroll;

    @FXML
    private GridPane mainGrid;

    //------ VIEW INTERFACE
    @FXML
    private Label label;

    @FXML
    private Pane view;
//    IMyListener myListener;

//        @FXML
//    private void click(MouseEvent mouseEvent) {
//        myListener.onClickListener(movie);
//    }
//
    public void setData(Movie movie){
        this.movie = movie;
        this.myListener = myListener;
        miniTitle.setText(movie.getTitle());
        miniSubTitle.setText(movie.getSubtitle());
        miniPrice.setText(Movie.CURRENCY + movie.getPrice());
        Image image = new Image(getClass().getResourceAsStream(movie.getImgSrc()));
        miniImage.setImage(image);
    }

    //---------- main loader
    //------ METHODS MOVIE BEHAVIOURS
    private List<Movie> movies = new ArrayList<Movie>();
    private Image image;

}
