package XtraVision.controller;

import XtraVision.fxmlLoader;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import XtraVision.model.Movie;
import XtraVision.persistence.IMyListener;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HirePaneController implements Initializable {
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

    //IMyListener myListener
    public void setData(Movie movie){
        this.movie = movie;
        //this.myListener = myListener;
        miniTitle.setText(movie.getTitle());
        miniSubTitle.setText(movie.getSubtitle());
        miniPrice.setText(Movie.CURRENCY + movie.getPrice());
//        Image image = new Image(getClass().getResourceAsStream(movie.getImgSrc()));
//        miniImage.setImage(image);
    }

    //---------- main loader
    //------ METHODS MOVIE BEHAVIOURS
    private List<Movie> movies = new ArrayList<Movie>();
    private Image image;

    private List<Movie> getData() {

        //------- Temporary Movie list

        for (int i=0; i < 14; i++){
            movie = new Movie();
            //movie.getImgSrc("../images/Jumanji_The_Next_Level__19687.1587035140.jpg");
            movie.setTitle("Jumanji: \n" +
                    "The Next Level ");
            movie.setSubtitle("The gang is back but it’s a new game!");
            movie.setPrice(Movie.CURRENCY+"2,99");
            movies.add(movie);
        }
        return movies;
    }


    fxmlLoader object;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        movies.addAll(getData());

        int column = 1;
        int row = 0;

        for (int i=0; i < movies.size(); i++){
            object.getPage("Home");
            mainPane.setCenter(view);
            // ask Marcos
            FXMLLoader fxmlLoader = new FXMLLoader();
            ItemMovieCtrl itemController = fxmlLoader.getController();
            itemController.setData(movies.get(i));

            if(row ==3) {
                row = 0;
                column++;
            }
            //AnchorPane anchorPane = itemController;
            mainGrid.add(mainPane, column, row++);
            //GridPane.setMargin(anchorPane, new Insets(5));
//            GridPane.setMargin(anchorPane, new Insets(14));
//                mainGrig.add(anchorPane, column, row);
//                mainGrig.setMinWidth(Region.USE_COMPUTED_SIZE);
//                mainGrig.setPrefWidth(Region.USE_COMPUTED_SIZE);
//                mainGrig.setMaxWidth(Region.USE_PREF_SIZE);
//
//                //set mainGrig height
//                mainGrig.setMinHeight(Region.USE_COMPUTED_SIZE);
//                mainGrig.setPrefHeight(Region.USE_COMPUTED_SIZE);
//                mainGrig.setMaxHeight(Region.USE_PREF_SIZE);

        }
    }

    }
