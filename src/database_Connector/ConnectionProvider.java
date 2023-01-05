package database_Connector;
import java.sql.*;

public class ConnectionProvider {

	private static Connection connection;

	public static Connection getConnection() {

		try {

			if (connection == null) {

				String url = "jdbc:mysql://localhost:3306/hospital_management_system";

				String user = "Souvik";
				
				String password = "Keynumber@123";

				connection = DriverManager.getConnection(url, user, password);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

}

