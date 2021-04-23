package XtraVision.persistence;

import XtraVision.model.Movie;

import java.sql.SQLException;
import java.util.List;

public interface IMovieDAO {
    public void insertMovie (Movie m) throws SQLException;
    public void deleteMovie (Movie m) throws SQLException;
    public void updateMovie (Movie m) throws SQLException;
    public void searchMovie (Movie m) throws SQLException;
    public List<Movie> searchMovies() throws SQLException;
}
