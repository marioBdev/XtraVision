package XtraVision.persistence;

import XtraVision.model.Movie;

import java.sql.*;
import java.util.ArrayList;

public class DBDAO {
    private Connection conn;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //String dbServer = "jdbc:mysql://localhost:8889/teachers"; //1º simpler
        //String hostname = "localhost";
        String hostname = "apontejaj.com";
        //String user = "root";
        String user = "Mario_2019451";
        String password = "2019451";

        //Class.forName("com.mysql.jdbc.Driver");
        Class.forName("jdbc:mysql://apontejaj.com:");
        conn = DriverManager.getConnection (
                //String.format ("jdbc:mysql://%s:8889;databaseName=%s;user=%s",hostname,user,password)
                String.format ("jdbc:mysql://%s:8889;databaseName=%s;user=%s",hostname,user,password));

        ArrayList<Movie> list = new ArrayList<Movie>();
        String sql = "SELECT * FROM Mario_2019451.xtravision; ";
        Statement stm = conn.createStatement();
        ResultSet rs  = stm.executeQuery(sql);
        while(rs.next()){
            Movie m = new Movie();
            m.setTitle(rs.getString("idMovie"));
            m.setDescription(rs.getString("descriptMovie"));
            list.add(m);
        }
        System.out.println(list);
//conn = DriverManager.getConnection(dbServer,user,password); // Simpler String Connection

        return conn;
    }

}

//jdbc:mysql://apontejaj.com:3306/Mario_2219451?useSSL=false


