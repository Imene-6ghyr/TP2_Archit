import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   // utilisation du patron singleton ; question 2
		private static DBConnection instance;
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;

	   
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	    
	    public static DBConnection getInstance() {
	    	if(instance == null) {
	    		try {
					instance = new DBConnection ();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	    	}
	    	return instance;
	    }
	    public Connection getConn() {
			return conn;
		}


		
	
}
