package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadingDataFromJDBC {
public static void main(String[] args) throws SQLException {
	//creating driver reference...
		Driver dbDriver = new Driver();
		
	//register the driver..
		DriverManager.registerDriver(dbDriver);
		
	//get the connection..
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advselenium", "root", "root");
		
		Statement statement = connection.createStatement();
		
		ResultSet data = statement.executeQuery("select * from advselenium");
		
		while(data.next())
		{
			System.out.println(data.getInt("id")+"  "+data.getString("name")+"  "+data.getString("city"));
		}
		
		connection.close();
}
}
