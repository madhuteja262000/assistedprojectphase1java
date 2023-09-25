package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQeryDEMO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//String query = "INSERT INTO movies VALUES ('movie', 'comedy', 'director1','1985')";
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl, username, password);
		String title = "newmovie";
		String genre = "comedy";
		String director = "director";
		String release_year = "1999";
		PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?,?)");
		
		ps.setString(1, title);
		ps.setString(2, genre);
		ps.setString(3, director);
		ps.setString(4, release_year);
		
		ps.executeUpdate();
		
		con.close();


	}

}
