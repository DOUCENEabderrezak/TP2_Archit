import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	      private Connection conn;


	    public DBConnection() throws SQLException {
	     private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}


	    public Connection getConn() {
			return conn;
	    public static DBConnection getInstance() throws SQLException {
			if(instance==null) {instance = new DBConnection();}

			return instance;
		}

		
	
}
