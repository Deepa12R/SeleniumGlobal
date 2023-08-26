package generics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseUtility implements IAutoConstants {
	public Connection connection;

	/**
	 * this method is used to establish the database connections
	 * 
	 * @param url
	 * @param username
	 * @param password
	 */
	public void establishingTheConnection(String url, String username, String password) {
		try {
			connection = DriverManager.getConnection(JDBCURL, JDBCUN, JDBCPWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method is used to read the data from database and returning list type
	 * 
	 * @param query
	 * @param columname
	 * @return
	 */
	public List<String> readingData(String query, String columname) {
		Statement statement = null;
		ResultSet value = null;

		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			value = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		List<String> data = new ArrayList<String>();
		try {
			while (value.next()) {
				try {
					data.add(value.getString(columname));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}

	/**
	 * this method is used to close the database connection
	 */
	public void ClosingDataBase() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
