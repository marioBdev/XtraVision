package XtraVision.controller;

import XtraVision.model.Movie;
import XtraVision.persistence.DBDAO;
import XtraVision.persistence.IMovieDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddMovieController implements IMovieDAO {
    //----- Inputs Page
    @FXML
    private AnchorPane admAnchor;

    @FXML
    private Label eMsnAddMovie;

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
    // ----- Image Loader
    @FXML
    private Button insertMovieAdmBtn;

    @FXML
    private ImageView bigImage;

    @FXML
    private Button loadBigImageBtn ;
    private FileChooser fileChooser;
    private InputStream is;
    private Image image;
    private File file;
    private Movie m;
    private AnchorPane anchorpane;


    @FXML
    public void loadBigImageBtn(ActionEvent event) throws SQLException {
        // Single File Selection
        System.out.println("Load Button has been clicked!!!");
        fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif")
        );
        file = fileChooser.showOpenDialog(loadBigImageBtn.getScene().getWindow());
        if (file != null) {
            nameTf.setText(file.getName());
            image = new Image(file.toURI().toString(), 315, 460, true, true);//Path, PrefWidth, PreHeight, PreserveRatio
            bigImage.setFitWidth(315);
            bigImage.setFitHeight(460);
            bigImage.setPreserveRatio(true);
            bigImage.setImage(image);
            m.setImageMovie(image);
            m.setImgSrc(nameTf.getText());
            eMsnAddMovie.setText("");
            }else {
            eMsnAddMovie.setText("There is no file selected!");
        }

        }
    //insertMovieAdmBtn.setOnAction (e->);
    private Connection c;
    public void DBDAO() throws SQLException, ClassNotFoundException {
        DBDAO dbDAO = new DBDAO();
        c= dbDAO.getConnection();
    }

    @Override
    public void insertMovie(Movie m) throws SQLException {

        String sql = "INSERT INTO xtravision VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1,m.getIdMovie());
        ps.setString(2,m.getTitle());
        ps.setString(3,m.getSubtitle());
        ps.setString(4,m.getImgSrc());
        ps.setString(5,m.getDescription());
        ps.setString(6, m.getDirector());
        ps.setString(7, m.getStarringMovie());
        ps.setString(8,m.getReleasedMovie());
        ps.execute();
        ps.close();
    }

    @Override
    public void deleteMovie(Movie m) throws SQLException {
        String sql = "DELETE FROM xtravision WHERE idMovie = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1,m.getIdMovie());
        ps.execute();
        ps.close();
    }

    @Override
    public void updateMovie(Movie m) throws SQLException {
        String sql = "UPDATE xtravision SET idMovie=?, movieTitle = ?, subTitleMovie = ?, imgMovie = ?, descriptMovie = ?, directorMovie =?, starringMovie = ?, releaseMovie = ? WHERE idMovie = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1,m.getIdMovie());
        ps.setString(2,m.getTitle());
        ps.setString(3,m.getSubtitle());
        ps.setString(4,m.getImgSrc());
        ps.setString(5,m.getDescription());
        ps.setString(6, m.getDirector());
        ps.setString(7, m.getStarringMovie());
        ps.setString(8,m.getReleasedMovie());
        ps.execute();
        ps.close();
    }

    @Override
    public void searchMovie(Movie m) throws SQLException {
        StringBuffer sb = new StringBuffer();

    }

    @Override
    public List<Movie> searchMovies() throws SQLException {
        List<Movie> listMovie = new ArrayList<Movie>();
        StringBuffer sql = new StringBuffer();
        sql.append ("SELECT m.idMovie AS idMovie, ");
        sql.append ("m.movieTitle AS title, m.subtitleMovie AS subtitle, ");
        sql.append ("m.imgMovie as image, m.descriptMovie AS description, ");
        sql.append ("m.directorMovie AS director, m.starringMovie AS starring, ");
        sql.append ("g.genre AS genre, ");
        sql.append ("m.releasedMovie AS release, ");
        sql.append ("FROM xtravision m INNER xtra_genre g, ");
        sql.append ("ON m.idMovie = g.idGenre ");
        sql.append ("INNER JOIN  qdtMovie q ");
        sql.append ("ON m.idMovie =  q.fk_idMovie ");
        sql.append ("INNER JOIN rateStar r ");
        sql.append ("ON m.idMovie =  r.fk_idMovie ");
        PreparedStatement ps = c.prepareStatement(sql.toString());
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Movie m = new Movie();
            m.setIdMovie(rs.getInt("idMovie"));
            m.setTitle(rs.getString("title"));
            m.setSubtitle(rs.getString("subtitle"));
            Blob blob = rs.getBlob("image");
            is = blob.getBinaryStream();
            m.setImageMovie(new Image (is));
            m.setDescription(rs.getString("description"));
            m.setDirector(rs.getString("director"));
            m.setStarringMovie(rs.getString("starring"));
            m.setGenre(rs.getString("genre"));

        }
        rs.close();
        return listMovie;
    }
}