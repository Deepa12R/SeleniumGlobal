package practice;

import java.util.List;
import generics.DataBaseUtility;

public class ReadingData {
	public static void main(String[] args) {
		DataBaseUtility utility = new DataBaseUtility();
		utility.establishingTheConnection("jdbc:mysql://localhost:3306/advselenium", "root", "root");
		List<String> data = utility.readingData("select * from advselenium", "city");
		for (String s : data) {
			System.out.println(s);
		}
		utility.ClosingDataBase();
	}
}
